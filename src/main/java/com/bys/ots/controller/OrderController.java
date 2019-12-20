/**
 * 订单信息controller层
 */
package com.bys.ots.controller;

import com.bys.ots.pojo.ConstantModel;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.ISoInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author bairuihua
 * 2019/11/25
 */

@Api(value = "Order Table Controller")
@RestController
@RequestMapping(value = "v1")
public class OrderController
{
    @Autowired
    private ISoInfoService soInfoService;

    @Autowired
    private ConstantModel constantModel;

    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @PostMapping(value = "/getSoInfoList")
    @ApiOperation(value = "get SoInfo")
    @ApiImplicitParams
            ({
                    @ApiImplicitParam(name = "rawData", paramType = "body", value = "请求体", required = true, defaultValue = "{status:\"\"}")
            })
    public Result getSoInfoList(@RequestBody(required = true) String rawData, HttpSession session)
    {
        logger.info(
                "->User start to enter controller /getSoInfoList, the email info is：rawData:{}",
                rawData);
        if (StringUtils.isEmpty(rawData))
        {
            logger.error("->rawData empty  error, the request info is：rawData:{}", rawData);
            return ResultUtil.error(ResultEnum.CODE_409);
        }
        return soInfoService.getSoInfoList(rawData);

    }

    @GetMapping(value = "/getSoInfoDetail")
    @ApiOperation(value = "get SoInfo Detail")
    @ApiImplicitParam(name = "orderId", value = "订单ID", required = true, dataType = "String")
    public Result getSoInfoDetail(@RequestParam(required = false, value = "orderId") String orderId,
                                  @RequestParam(required = false, value = "type") String type, HttpSession session)
    {
        logger.info(
                "->User start to enter controller  getSoInfoDetail, the request info is： orderId:{},type:{}",
                orderId, type);
        if (StringUtils.isEmpty(orderId))
        {
            logger.error("->orderId is empty, the request is: orderId：{}",
                         orderId);
            return ResultUtil.error(ResultEnum.CODE_406);
        }

        if (StringUtils.isEmpty(type) || !StringUtils.equals(type.toUpperCase(), "SAP"))
        {
            logger.error("->type is empty, the request is: type：{}",
                         type);
            return ResultUtil.error(ResultEnum.CODE_416);
        }
        return soInfoService.getSoInfoDetail(orderId, type);

    }

    @GetMapping(value = "/getLogisticInfo")
    @ApiOperation(value = "get Logistic Info")
    @ApiImplicitParams
            ({
                    @ApiImplicitParam(name = "type", value = "订单类型", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "so", value = "so编号", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "soItem", value = "soItem编号", required = true, dataType = "String")
            })
    public Result getLogisticInfo(@RequestParam String type, @RequestParam String so,
                                  @RequestParam String soItem, HttpSession session)
    {
        logger.info(
                "->User start to enter controller  /getLogisticInfo, the request info is： type:{}, so:{}, soItem:{}",
                type, so, soItem);
        if (StringUtils.isEmpty(type))
        {
            logger.error("->orderId is empty, the request is: orderId：{}",
                         type);
            return ResultUtil.error(ResultEnum.CODE_416);
        }

        if (StringUtils.isEmpty(so))
        {
            logger.error("->type is empty, the request is: type：{}",
                         so);
            return ResultUtil.error(ResultEnum.CODE_406);
        }
        if (StringUtils.isEmpty(soItem))
        {
            logger.error("->soItem is empty, the request is: soItem：{}",
                         soItem);
            return ResultUtil.error(ResultEnum.CODE_418);
        }

        return soInfoService.getLogisticInfo(type, so, soItem);

    }
}
