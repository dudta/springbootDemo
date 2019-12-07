/**
 * 订单信息表实现类
 */
package com.bys.ots.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.parsing.ParsingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.bys.ots.dao.DnInfoE1Mapper;
import com.bys.ots.dao.DnInfoSapMapper;
import com.bys.ots.dao.OrderTableMapper;
import com.bys.ots.dao.SoEmailE1Mapper;
import com.bys.ots.dao.SoInfoE1Mapper;
import com.bys.ots.dao.SoInfoSapMapper;
import com.bys.ots.model.DnInfoE1;
import com.bys.ots.model.DnInfoE1Key;
import com.bys.ots.model.SoInfoE1;
import com.bys.ots.model.SoInfoE1Key;
import com.bys.ots.model.SoInfoSapKey;
import com.bys.ots.pojo.ConstantModel;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.IOrderTableService;
import com.bys.ots.util.LogisticUtil;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
@Service(value = "orderTableService")
public class OrderTableServiceImpl implements IOrderTableService
{
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private OrderTableMapper orderTableMapper;
    
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

    public Result getOderTableList(String emailaddress)
    {
        logger.info("->User start to enter service getOderTableList => emailaddress:{}", emailaddress);
        JSONObject jsonObj = JSONObject.fromObject(emailaddress);
        String email = jsonObj.getString("emailAddress");     
        String pageNum = jsonObj.getString("pageNum");
        String pageSize = jsonObj.getString("pageSize");

        if (StringUtils.isEmpty(email))
        {
            logger.error("-> rawData解析后的 email为空 => email:{}", email);
            return ResultUtil.error(ResultEnum.CODE_404);
        }
        if (StringUtils.isEmpty(pageNum))
        {
            logger.error("-> rawData解析后的 pageNum为空 => pageNum:{}", pageNum);
            return ResultUtil.error(ResultEnum.CODE_414);
        }
        if (StringUtils.isEmpty(pageSize))
        {
            logger.error("-> rawData解析后的 pageSize为空 => pageSize:{}", pageSize);
            return ResultUtil.error(ResultEnum.CODE_415);
        }

        int pageNumber = Integer.parseInt(pageNum);
        int pageSized = Integer.parseInt(pageSize);
        int start = (pageNumber-1) * pageSized;
        List<SoInfoE1> soInfoList = null;
        soInfoList = soInfoE1Mapper.selectByEmailAndPage(email, start, pageSized);
        

//        List<SoEmailE1> soEmailList = soEmailE1Mapper.selectByEmail(email);
//        System.out.print(soEmailList.size());
//        
//        List<SoInfoE1> soInfoList = new ArrayList<SoInfoE1>();
//        
//        for(SoEmailE1 soEmailE1:soEmailList)
//        {
//            SoInfoE1 soInfoE1 = soInfoE1Mapper.selectBySO(soEmailE1.getSo());
//            soInfoList.add(soInfoE1);
//        }
//        
//        List<OrderTable> orderTableList = orderTableMapper.findByEmail(email);
//        if (ObjectUtils.isEmpty(orderTableList))
//        {
//            logger.error("->User can't find this order_table record by email => email:{}", email);
//        }
        return ResultUtil.OTSResult(soInfoList);
    }
    
  

    public Result getOderDetail(String SO)
    {

        logger.info("->进入service层获取订单详细信息 => orderId:{}", SO);

      SoInfoE1 soInfo = soInfoE1Mapper.selectBySO(SO);
      soInfo.setType("E1");
      if (ObjectUtils.isEmpty(soInfo))
      {
          logger.error("->User can't find this order_table record => SO:{}", SO);
      }

        DnInfoE1 DN = dnInfoE1Mapper.selectBySO(SO);
      
        Map logisticResult = null;

        try
        {
            logisticResult = LogisticUtil.searchLogistic(DN.getDn(),
                                                         constantModel.getBuleBoxPartnered());
        }
        catch (Exception e)
        {
            logger.error("->获取物流信息失败！ error, the requeset param is:orderId：{}",
                         DN);
            e.printStackTrace();
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("orderDetail", soInfo);
        result.put("logisticDetail", logisticResult);
        
		return ResultUtil.OTSResult(result);       
    }
    
    
    public Result getLogisticInfo(String type, String so, String soItem)
    {

//        logger.info("->进入service层获取物流详细信息 => type:{},so:{},soItem:{}", type, so, soItem);
//        
//        if (StringUtils.isEmpty(type) || StringUtils.isEmpty(so) || StringUtils.isEmpty(soItem)) {
//            logger.error("->User can't find this so record by type:{},so:{},soItem:{}", type, so, soItem);
//            ResultUtil.error(ResultEnum.CODE_409);
//        }
//        Object record = null;
//        if ("E1".contentEquals(type.toUpperCase())) {
//            record = dnInfoE1Mapper.selectBySoAndSoItem(so, soItem);
//            return ResultUtil.OTSResult(record);
//        }   
//        if ("SAP".contentEquals(type.toUpperCase())) {
//            record = dnInfoSapMapper.selectBySoAndSoItem(so, soItem);
//            return ResultUtil.OTSResult(record);
//        }
        
        return ResultUtil.error(ResultEnum.CODE_416);
    }


}

