package com.halo.seed.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class IndexEntity {
    private Integer id;
    private String indexDesc;
    private Date createDate;

    public IndexEntity() {
    }

    public IndexEntity(Integer id, String indexDesc, Date createDate) {
        this.id = id;
        this.indexDesc = indexDesc;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndexDesc() {
        return indexDesc;
    }

    public void setIndexDesc(String indexDesc) {
        this.indexDesc = indexDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
