/**
  *  投诉信息controller层
 */
package com.bys.ots.controller;

import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.ComplaintService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * @author bairuihua
 * 2019/12/03
 */
@Api(value = "Complaint Controller")
@RestController
@RequestMapping(value="v1")
public class ComplaintController
{
    @Resource
    private ComplaintService complaintService;

    private final Logger logger = LoggerFactory.getLogger(ComplaintController.class);

    @ApiOperation(value = "get All Complaint")
    @ApiImplicitParam
    (
        // name = "email", value = "email", required = true, dataType = "String"
     )
    @GetMapping(value = "/getAllComplaint")
    public Result getAllComplaint()
    {
        
    	logger.info("->User Enter controller getAllComplaint ");
        return ResultUtil.OTSResult(complaintService.getAllComplaint());
    }     

}
