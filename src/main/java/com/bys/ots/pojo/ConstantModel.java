/**
 * 配置文件注入
 */
package com.bys.ots.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author pangyong
 *
 */
@Component
@ConfigurationProperties(prefix = "model")
public class ConstantModel
{
//    @Value("${model.buleBoxPartnered}")
    private String buleBoxPartnered;
    
    private String verificationEmailHeader;
    
    private String verificationEmailBody;

    public String getVerificationEmailHeader()
    {
        return verificationEmailHeader;
    }

    public void setVerificationEmailHeader(String verificationEmailHeader)
    {
        this.verificationEmailHeader = verificationEmailHeader;
    }

    public String getVerificationEmailBody()
    {
        return verificationEmailBody;
    }

    public void setVerificationEmailBody(String verificationEmailBody)
    {
        this.verificationEmailBody = verificationEmailBody;
    }

    public String getBuleBoxPartnered()
    {
        return buleBoxPartnered;
    }

    public void setBuleBoxPartnered(String buleBoxPartnered)
    {
        this.buleBoxPartnered = buleBoxPartnered;
    }
}
