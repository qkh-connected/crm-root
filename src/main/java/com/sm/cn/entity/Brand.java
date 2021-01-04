package com.sm.cn.entity;

import com.sm.cn.entity.base.BaseEntity;

import java.io.Serializable;

public class Brand extends BaseEntity<Long> implements Serializable {


    private String brandName;

    private String brandSite;

    private String brandDesc;

    private String brandLogo;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandSite() {
        return brandSite;
    }

    public void setBrandSite(String brandSite) {
        this.brandSite = brandSite == null ? null : brandSite.trim();
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }


}