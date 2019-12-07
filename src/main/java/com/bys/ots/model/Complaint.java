/**
 * 投诉表
 */
package com.bys.ots.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author bairuihua
 * 2019/12/03
 */
public class Complaint implements Serializable
{
    private static final long serialVersionUID = 1L;
    //投诉描述
    private String description;
    //投诉唯一标识号
    private String descriptionId;
    //投诉种类
    private Integer catalogId;
    //投诉作者Id
    private String authorId;
    //投诉时间
    private Date describeTime;
    //投诉是否被删除
    private Integer isDeleted;
 
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescriptionId()
    {
        return descriptionId;
    }
    public void setDescriptionId(String descriptionId)
    {
        this.descriptionId = descriptionId;
    }
    public Integer getCatalogId()
    {
        return catalogId;
    }
    public void setCatalogId(Integer catalogId)
    {
        this.catalogId = catalogId;
    }
    public String getAuthorId()
    {
        return authorId;
    }
    public void setAuthorId(String authorId)
    {
        this.authorId = authorId;
    }
    public Date getDescribeTime()
    {
        return describeTime;
    }
    public void setDescribeTime(Date describeTime)
    {
        this.describeTime = describeTime;
    }
    public Integer getIsDeleted()
    {
        return isDeleted;
    }
    public void setIsDeleted(Integer isDeleted)
    {
        this.isDeleted = isDeleted;
    }
    
}
