/**
 * 订单信息表实现类
 */
package com.bys.ots.service.impl;

import com.alibaba.fastjson.JSON;
import com.bys.ots.model.DnInfoE1;
import com.bys.ots.model.SoInfoE1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import com.bys.ots.model.*;
import com.bys.ots.service.ISoInfoService;

import net.sf.json.JSONObject;
import nu.xom.ParsingException;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bys.ots.dao.DnInfoE1Mapper;
import com.bys.ots.dao.DnInfoSapMapper;
import com.bys.ots.dao.SoInfoMapper;
import com.bys.ots.dao.SoEmailE1Mapper;
import com.bys.ots.dao.SoInfoE1Mapper;
import com.bys.ots.dao.SoInfoSapMapper;
import com.bys.ots.pojo.ConstantModel;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.util.LogisticUtil;

/**
 * @author bairuihua
 * 2019/11/26
 */
@Service(value = "soInfoService")
public class SoInfoServiceImpl implements ISoInfoService
{
    private final Logger logger = LoggerFactory.getLogger(SoInfoServiceImpl.class);

    @Resource
    private SoInfoMapper soInfoMapper;

    @Resource
    private SoEmailE1Mapper soEmailE1Mapper;

    @Resource
    private SoInfoSapMapper soInfoSapMapper;

    @Resource
    private SoInfoE1Mapper soInfoE1Mapper;

    @Resource
    private DnInfoSapMapper dnInfoSapMapper;

    @Resource
    private DnInfoE1Mapper dnInfoE1Mapper;

    @Autowired
    ConstantModel constantModel;

    public Result getSoInfoList(String emailaddress)
    {

        logger.info("->User start to enter service getOderTableList => emailaddress:{}",
                    emailaddress);
        JSONObject jsonObj = JSONObject.fromObject(emailaddress);
        String email = jsonObj.getString("emailAddress");
        String deliveryStatus = jsonObj.getString("deliveryStatus");

        if (StringUtils.isEmpty(email))
        {
            logger.error("-> rawData解析后的 email为空 => email:{}", email);
            return ResultUtil.error(ResultEnum.CODE_404);
        }

        if (StringUtils.isEmpty(deliveryStatus))
        {
            logger.error("-> rawData解析后的 email为空 => deliveryStatus:{}", deliveryStatus);
            return ResultUtil.error(ResultEnum.CODE_420);
        }
        List<SoInfo> soInfoList = null;
        soInfoList = soInfoMapper.selectByEmailAndStatus(email, deliveryStatus);
        logger.info("->查找到的订单数量为：" + soInfoList.size());
        return ResultUtil.OTSResult(soInfoList);
    }

    public Result getSoInfoDetail(String SO, String type)
    {

        logger.info("->进入service层获取订单详细信息 => SO:{},type:{}", SO, type);
        Map<String, Object> result = new HashMap<String, Object>();
        if (StringUtils.equals(type.toUpperCase(), "SAP"))
        {
            SoInfo soInfo = soInfoSapMapper.selectBySO(SO);
            List<DnInfoSap> dns = dnInfoSapMapper.selectBySO(SO);
            result.put("orderDetail", soInfo);
            result.put("DnDetail", dns);
        }
        return ResultUtil.OTSResult(result);
    }

    public Result getLogisticInfo(String type, String so, String soItem)
    {

        logger.info("->进入service层获取物流详细信息 => type:{},so:{},soItem:{}", type, so, soItem);
        Map logisticResult = null;
        if ("SAP".contentEquals(type.toUpperCase()))
        {
            DnInfoSap DN = dnInfoSapMapper.selectBySOAndItem(so, soItem);
            try
            {
                logisticResult = LogisticUtil
                        .searchLogistic(DN.getDn(), constantModel.getBuleBoxPartnered());
            }
            catch (Exception e)
            {
                logger.error("->获取物流信息失败！ error, the requeset param is:DN：{}",
                             DN);
                try
                {
                    logisticResult = LogisticUtil
                            .searchLogistic("4637957", constantModel.getBuleBoxPartnered());
                }
                catch (ParsingException ex)
                {
                    logger.info("获取默认物流信息失败");
                }
            }
            return ResultUtil.OTSResult(logisticResult.get("data"));
        }

        return ResultUtil.error(ResultEnum.CODE_416);
    }

}

