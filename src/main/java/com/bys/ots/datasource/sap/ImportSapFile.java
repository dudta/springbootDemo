
package com.bys.ots.datasource.sap;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bys.ots.dao.DnInfoSapMapper;
import com.bys.ots.dao.SoEmailSapMapper;
import com.bys.ots.dao.SoInfoSapMapper;
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
public class ImportSapFile {
	private final Logger logger = LoggerFactory.getLogger(ImportSapFile.class);

	@Autowired
	private SoEmailSapMapper soEmailSapMapper;

	@Autowired
	private SoInfoSapMapper soInfoSapMapper;

	@Autowired
	private DnInfoSapMapper dnInfoSapMapper;

	@Autowired
	private ImportSapFile readCus;

	@Value("${SapSoEmailFilePath}")
	private String SapSoEmailFilePath;

	@Value("${SoInfoSapFilePath}")
	private String SoInfoSapFilePath;

	@Value("${DnInfoSapFilePath}")
	private String DnInfoSapFilePath;

 
	public void WriteFile() {

		readCus.readTxtFileBySoInfoSap(SoInfoSapFilePath);
		logger.info("->开始导入Txt文件中SoInfoSap 数据！");
		readCus.readTxtFileBySoEmailSap(SapSoEmailFilePath);
		logger.info("->开始导入Txt文件中SoEmailSap 数据！");
		readCus.readTxtFileByDnInfoSap(DnInfoSapFilePath);
		logger.info("->开始导入Txt文件中DnInfoSap 数据！");
	}

	public void readTxtFileBySoInfoSap(String fileName) {
		List<SoInfoSap> data = new ArrayList<SoInfoSap>();
		File file = new File(fileName);
		if (!file.exists()) {
			logger.error("->The file path does not exist => file:{}\", file");
		}
		try {
			LineIterator lineIterator = FileUtils.lineIterator(file, "UTF-8");
			while (lineIterator.hasNext()) {
				String line = lineIterator.nextLine(); // 行数据转换成数组
				String[] custArray = line.split("\\|");
				SoInfoSap soInfo = new SoInfoSap();
				soInfo.setSo(custArray[0]);
				soInfo.setPoNumber(custArray[1]);
				soInfo.setSoldTo(custArray[2]);
				soInfo.setSaleOrg(custArray[3]);
				soInfo.setSaleOffice(custArray[4]);
				soInfo.setSoItem(custArray[5]);
				soInfo.setDisC(custArray[6]);
				soInfo.setSku(Integer.valueOf(custArray[7]));
				soInfo.setSoStatus(Integer.valueOf(custArray[8]));
				soInfo.setDescription(custArray[9]);
				soInfo.setQty(Integer.valueOf(custArray[10]));
				soInfo.setUnit(custArray[11]);
				data.add(soInfo);
			}
			int count = soInfoSapMapper.insertBatch(data);
			if (count > 0) {
				logger.info("->SAP SOEmail 数据插入完成！成功插入记录数为：" + count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readTxtFileBySoEmailSap(String fileName) {
		List<SoEmailSap> mlist = new ArrayList<SoEmailSap>();
		File file = new File(fileName);
		if (!file.exists()) {
			logger.error("->The file path does not exist => file:{}\", file");
		}
		try {
			LineIterator lineIterator = FileUtils.lineIterator(file, "UTF-8");
			while (lineIterator.hasNext()) {
				String line = lineIterator.nextLine(); // 行数据转换成数组
				String[] custArray = line.split("\\|");
				SoEmailSap soEmail = new SoEmailSap();
				soEmail.setSo(custArray[0]);
				soEmail.setSoItem(custArray[1]);
				soEmail.setPartner(custArray[2]);
				soEmail.setCustomer(custArray[3]);
				soEmail.setEmail(custArray[4]);
				mlist.add(soEmail);
			}
			int count = soEmailSapMapper.InsertList(mlist);
			if (count > 0) {
				logger.info("->SAP SOEmail 数据插入完成！成功插入记录数为：" + count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readTxtFileByDnInfoSap(String fileName) {
		List<DnInfoSap> dlist = new ArrayList<DnInfoSap>();
		File file = new File(fileName);
		if (!file.exists()) {
			logger.error("->The file path does not exist => file:{}\", file");
		}
		try {
			LineIterator lineIterator = FileUtils.lineIterator(file, "UTF-8");
			while (lineIterator.hasNext()) {
				String line = lineIterator.nextLine(); // 行数据转换成数组
				String[] custArray = line.split("\\|");
				DnInfoSap dnInfoSap = new DnInfoSap();
				dnInfoSap.setSo(custArray[0]);
				dnInfoSap.setSoItem(custArray[1]);
				dnInfoSap.setPlant(custArray[2]);
				dnInfoSap.setStorLoc(custArray[3]);
				dnInfoSap.setShippingPoint(custArray[4]);
				dnInfoSap.setDnStatus(Integer.valueOf(custArray[5]));
				dnInfoSap.setDn(custArray[6]);
				dnInfoSap.setDnItem(custArray[7]);
				dnInfoSap.setDeliveryDate(custArray[8]);
				dnInfoSap.setQty(Integer.valueOf(custArray[9]));
				dnInfoSap.setUnit(custArray[10]);
				dlist.add(dnInfoSap);
			}
			int count = dnInfoSapMapper.InsertDnList(dlist);
			if (count > 0) {
				logger.info("->SAP DnInfo 数据插入完成！成功插入记录数为：" + count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
