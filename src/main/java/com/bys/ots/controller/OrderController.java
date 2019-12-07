/**
   * 订单信息controller层
 */
package com.bys.ots.controller;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bys.ots.pojo.ConstantModel;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.IOrderTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;

/**
 * @author bairuihua
 * 2019/11/25
 */

@Api(value = "Order Table Controller")
@RestController
@RequestMapping(value="v1")
public class OrderController
{
    @Resource
    private IOrderTableService orderTableService;

    @Autowired
    ConstantModel constantModel;

    static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @PostMapping(value = "/getOderTableList")
    @ApiOperation(value = "get Oder Table")
    @ApiImplicitParams
    ({
         @ApiImplicitParam(name = "rawData",paramType = "body",  value = "请求体", required = true, defaultValue="{status:\"\";pageNum:\"\";pageSize:\"\"}") 
    })
    public Result getOderTable(@RequestBody(required = true) String rawData)
    {
        logger.info("->User start to enter controller /getOderTableList, the email info is：rawData:{}",
                    rawData);
        if (StringUtils.isEmpty(rawData))
        {
            logger.error("->emailaddress 为空，  error, the email info is：rawData:{}", rawData);
            return ResultUtil.error(ResultEnum.CODE_409);
        }
        return orderTableService.getOderTableList(rawData);

    }

    @GetMapping(value = "/getOderDetail")
    @ApiOperation(value = "get Oder Table Detail")
    @ApiImplicitParam(name = "orderId", value = "订单ID", required = true, dataType = "String")
    //public Result getOderDetail(@RequestParam(required = false) String orderId)
    public Result getOderDetail(@RequestParam(required = false,value="orderId") String orderId)
    {
        logger.info("->User start to enter controller  getOderDetail, the request info is： orderId:{}",
                    orderId);
        if (StringUtils.isEmpty(orderId))
        {
            logger.error("->User start to enter controller getOderDetail error, the request is: orderId：{}",
                         orderId);
            return ResultUtil.error(ResultEnum.CODE_406);
        }
        return orderTableService.getOderDetail(orderId);

    }  

    @GetMapping(value = "/getLogisticInfo")
    @ApiOperation(value = "get Logistic Info")
    @ApiImplicitParams
    ({ 
        @ApiImplicitParam(name = "type", value = "订单类型", required = true, dataType = "String"),
        @ApiImplicitParam(name = "so", value = "so编号", required = true, dataType = "String"), 
        @ApiImplicitParam(name = "soItem", value = "soItem编号", required = true, dataType = "String")
    })
    public Result getLogisticInfo(@RequestParam String type, @RequestParam String so, @RequestParam String soItem)
    {
        logger.info("->User start to enter controller  /getLogisticInfo, the request info is： type:{}, so:{}, soItem:{}",
                    type, so, soItem);
          
        return orderTableService.getLogisticInfo(type, so, soItem);
   
   
    }
}
