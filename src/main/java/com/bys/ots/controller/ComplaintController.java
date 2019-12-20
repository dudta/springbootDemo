/**
 * 投诉信息controller层
 */
package com.bys.ots.controller;

import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.ComplaintService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;

/**
 * @author bairuihua
 * 2019/12/03
 */
@Api(value = "Complaint Controller")
@RestController
@RequestMapping(value = "v1")
public class ComplaintController
{
    @Resource
    private ComplaintService complaintService;

    @Value("${textPath}")
    private String textPath;

    private final Logger log = LoggerFactory.getLogger(ComplaintController.class);

    @ApiOperation(value = "get All Complaint")
    @GetMapping(value = "/getAllComplaint")
    public Result getAllComplaint()
    {

        log.info("->User Enter controller getAllComplaint ");
        return ResultUtil.OTSResult(complaintService.getAllComplaint());
    }

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException
    {
        log.info("=== file type :" + file.getContentType() + "file name : " +
                         file.getOriginalFilename() + " file size : {2}" + file.getSize());
        //file.transferTo(new File("D:\\temptext\\" + file.getOriginalFilename()));
        InputStream inputStream = file.getInputStream();
        Writer write = new FileWriter(textPath + file.getOriginalFilename());
        IOUtils.copy(inputStream, write);
        write.close();
        return ResultUtil.success();
    }

}
