/**
 * E1数据入库
 */
package com.bys.ots.datasource.e1;

import com.bys.ots.dao.DnInfoE1Mapper;
import com.bys.ots.dao.SoEmailE1Mapper;
import com.bys.ots.dao.SoInfoE1Mapper;
import com.bys.ots.model.DnInfoE1;
import com.bys.ots.model.SoEmailE1;
import com.bys.ots.model.SoInfoE1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tobias
 * 2019/12/02
 */

@Component
@Configuration
@EnableScheduling
public class ImportDataE1 {
	
	private final Logger logger = LoggerFactory.getLogger(ImportDataE1.class);   

	@Resource
	private SoInfoE1Mapper soInfoE1Mapper;
	
   @Resource
    private SoEmailE1Mapper soEmailE1Mapper;
   
   @Resource
   private DnInfoE1Mapper dnInfoE1Mapper;
	
   //@Scheduled(cron = "0/5 * * * * ?")
   //@Scheduled(fixedRate=600000)
	private void importDataFromSAP() {
		
		logger.info("->开始录入E1 数据！");
		
		String header = getCode();
		logger.info("->开始录入SO数据，本批次SO header为："+header);
		List<SoInfoE1> data = new ArrayList<SoInfoE1>();
		
		for(int i=0; i<3000; i++)
		{		    
		SoInfoE1 soInfo = new SoInfoE1();
		soInfo.setSo(header+i);
		soInfo.setSoItem(header+i);
		soInfo.setDescription("QuantStudio PCR 热循环仪"+ i);
		soInfo.setDisC("disc"+header);
		soInfo.setPoNumber(i+header+i);
		soInfo.setQty(i);
		soInfo.setSaleOffice("西北 xi'an 西安市雁塔区");
		soInfo.setSaleOrg("博彦科技Beyondsoft");
		soInfo.setSku(i);
		
		soInfo.setSoldTo("客户群+header");
		soInfo.setSoStatus(1);
		soInfo.setUnit(i+"");	
		
		data.add(soInfo);	
		}
		
		int count = soInfoE1Mapper.insertBatch(data);
	
		if(count>0)
		{
			logger.info("->E1 SO 数据插入完成！成功插入记录数为："+count);
		}
		
		insertIntoSoEmail(header);	
		insertIntoDnInfo(header);
	}
	
	 private void insertIntoSoEmail(String header)
    {
	     logger.info("->开始录入E1 Email数据！");
	      List<SoEmailE1> data = new ArrayList<SoEmailE1>();
	      
	        for(int i=0; i<3000; i++)
	        {           
	        SoEmailE1 soEmail = new SoEmailE1();
	        soEmail.setSo(header+i);
	        soEmail.setSoItem(header+i);
	        soEmail.setPartner("partner"+i);
	        soEmail.setCustomer("customer"+i);
			soEmail.setEmail("wanggang" + i + "@beyondsoft.com");
	        
	        data.add(soEmail);   
	        }
	     
	        int count = soEmailE1Mapper.insertBatch(data);
	        
	        if(count>0)
	        {
	            logger.info("->E1 Email 数据插入完成！成功插入记录数为："+count);
	        }               
    }
	 
	 private void insertIntoDnInfo(String header)
	 {
	     logger.info("->开始录入E1 DN数据！");
	     List<DnInfoE1> data = new ArrayList<DnInfoE1>();
	     for(int i=0; i<3000; i++)
         {  
	         DnInfoE1 dnInfoE1 = new DnInfoE1();
	         dnInfoE1.setDeliveryDate(new Date());
	         dnInfoE1.setSo(header+i);
	         dnInfoE1.setSoItem(header+i);
	         dnInfoE1.setDnItem(header+i);
	         dnInfoE1.setDn("463795"+getNumber());
	         dnInfoE1.setUnit(i+"");
	         
	         data.add(dnInfoE1);
         }
	     
         int count = dnInfoE1Mapper.insertBatch(data);
         
         if(count>0)
         {
             logger.info("->E1 DN 信息 数据插入完成！成功插入记录数为："+count);
         }  
	 }

    public String getCode() {
	     
	        String model = "0123456789";
	        char[] m = model.toCharArray();
	        String randomcode = "";
	        for (int j = 0; j < 8; j++)
	        {
	            char c = m[(int) (Math.random() * 10)];
	            if (randomcode.contains(String.valueOf(c)))
	            {
	                j--;
	                continue;
	            }
	            randomcode = randomcode + c;
	        }
	        return randomcode;
	 }
    
    
    public String getNumber() {
        
        String model = "789";
        char[] m = model.toCharArray();
        String randomcode = "";
        char c = m[(int) (Math.random() * 3)];
        randomcode = randomcode + c;
        return randomcode;
 }
}
