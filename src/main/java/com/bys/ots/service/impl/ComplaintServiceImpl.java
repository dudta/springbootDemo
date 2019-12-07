/**
 * 
 */
package com.bys.ots.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bys.ots.dao.ComplaintMapper;
import com.bys.ots.dao.OrderTableMapper;
import com.bys.ots.model.Complaint;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.ComplaintService;

/**
 * @author bairuihua
 * 2019/12/03
 */
@Service("complaintService")
public class ComplaintServiceImpl implements ComplaintService
{

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private ComplaintMapper complaintMapper;
    @Override
    public Result getAllComplaint()
    {
        logger.info("User enter service complaintService");
        // TODO Auto-generated method stub
        return ResultUtil.OTSResult(complaintMapper.findAll());
    }

}
