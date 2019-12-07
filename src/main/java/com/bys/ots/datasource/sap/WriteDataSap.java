package com.bys.ots.datasource.sap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bys.ots.model.DnInfoSap;
import com.bys.ots.model.SoEmailSap;
import com.bys.ots.model.SoInfoSap;
/**
 * @author zhagnyan
 * 2019/12/02
 */
@Component
@Configuration
@EnableScheduling
public class WriteDataSap {

 private final Logger logger = LoggerFactory.getLogger(WriteDataSap.class);  

	@Value("${SapSoEmailFilePath}")
	private String SapSoEmailFilePath;
	@Value("${SoInfoSapFilePath}")
	private String SoInfoSapFilePath;
	@Value("${DnInfoSapFilePath}")
	private String DnInfoSapFilePath;
	
 
	public void InserSapEmailData() {
    logger.info("->开始录入SAP 数据！");
    String header = getCode();
	logger.info("->开始录入SOEmail数据，本批次SO header为："+header);
	SoEmailSap soEmailSap; 
    List<SoEmailSap> mlist=new ArrayList<SoEmailSap>(); 
     for (int i = 0; i <3000; i++){
	  soEmailSap =new SoEmailSap();
	  soEmailSap.setSo(header+i+"");
	  soEmailSap.setSoItem(header+i+header);
	  soEmailSap.setPartner("liuyixd"+i+""); 
	  soEmailSap.setCustomer("sixkdm"+i+"");
	  soEmailSap.setEmail("yliuy"+i+""+"@126.com");
	  mlist.add(soEmailSap);
  }
     File file = new File(SapSoEmailFilePath);
     try {
    	 if (!file.exists()) {
    		 File.createTempFile(SapSoEmailFilePath, null);
         }
     BufferedWriter writer = new BufferedWriter(new FileWriter(file));
     for (SoEmailSap so:mlist){
         writer.write(so.getSo()+"|"+so.getSoItem()+"|"+so.getPartner()+"|"+so.getCustomer()+"|"+so.getEmail()+ "\r\n");
     }
     writer.close();
	}catch (IOException e) { 
		e.printStackTrace(); 
      }
	}

	
 
	public  void importsoInfoSapData() {
		logger.info("->开始录入SAP 数据！");
		String header = getCode();
		logger.info("->开始录入SOInfo数据，本批次SO header为：" + header);
		List<SoInfoSap> data = new ArrayList<SoInfoSap>();
		for (int i = 0; i < 3000; i++) {
			SoInfoSap soInfo = new SoInfoSap();
			soInfo.setSo(header + i);
			soInfo.setSoItem(header + i);
			soInfo.setDescription("PCR1 热循环仪" + i);
			soInfo.setDisC("discsc");
			soInfo.setPoNumber(i+header);
			soInfo.setQty(i);
			soInfo.setSaleOffice("beijing");
			soInfo.setSaleOrg("xi'an");
			soInfo.setSku(i);
			soInfo.setSoldTo("customer");
			soInfo.setSoStatus(1);
			soInfo.setUnit(i + "");
			data.add(soInfo);
		}
		File file = new File(SoInfoSapFilePath);
	     try {
	    	 if (!file.exists()) {
	    		 File.createTempFile(SoInfoSapFilePath, null);
	         }
	     BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	     for (SoInfoSap so:data){
	         writer.write(so.getSo()+"|"+so.getPoNumber()+"|"+so.getSoldTo()+"|"+so.getSaleOrg()+"|"+so.getSaleOffice()+"|"+so.getSoItem()+
	        		 "|"+so.getDisC()+"|"+so.getSku()+"|"+so.getSoStatus()+"|"+so.getDescription()+"|"+so.getQty()+"|"+so.getUnit()+"\r\n");
	     }
	     writer.close();
		}catch (IOException e) { 
			e.printStackTrace(); 
	      }
		}
		

	  
	 
	public void InserSapDnInfoData() {
		logger.info("->开始录入SAP 数据！");
		String header = getCode();
		logger.info("->开始录入DnInfo数据，本批次SO header为：" + header);
		List<DnInfoSap> Dlist = new ArrayList<DnInfoSap>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i <3000; i++) {
			DnInfoSap dnInfoSap = new DnInfoSap();
			dnInfoSap.setDn(header + i+"ddd");
			dnInfoSap.setDnItem(header + i);
			dnInfoSap.setSo(header + i);
			dnInfoSap.setSoItem(header + i);
			dnInfoSap.setPlant("Dyixd" + i + "");
			dnInfoSap.setStorLoc("dsdfx" + i);
			dnInfoSap.setDnStatus(1);
			dnInfoSap.setQty(i);
			dnInfoSap.setShippingPoint("beijing");
			dnInfoSap.setUnit(i + "");
			dnInfoSap.setDeliveryDate(formatter.format(new Date()));
			Dlist.add(dnInfoSap);
		}
		File file = new File(DnInfoSapFilePath);
	     try {
 
	    	 if (!file.exists()) {
	    		 File.createTempFile(SoInfoSapFilePath, null);
	         }
	     BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	     for (DnInfoSap so:Dlist){
	         writer.write(so.getSo()+"|"+so.getSoItem()+"|"+so.getPlant()+"|"+so.getStorLoc()+"|"+
	     so.getShippingPoint()+"|"+so.getDnStatus()+"|"+so.getDn()+"|"+so.getDnItem()+"|"
	        		 +so.getDeliveryDate()+"|"+so.getQty()+"|"+so.getUnit()+"\r\n");
	        		
	     }
	     writer.close();
		}catch (IOException e) { 
			e.printStackTrace(); 
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
	
}
