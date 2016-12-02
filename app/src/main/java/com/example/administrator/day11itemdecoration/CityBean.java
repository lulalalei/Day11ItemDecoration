package com.example.administrator.day11itemdecoration;

import com.example.administrator.day11itemdecoration.bean.BaseIndexPinyinBean;

/**
 * Created by Administrator on 2016/12/2.
 */

public class CityBean extends BaseIndexPinyinBean{

    private String city;

    public CityBean() {
    }

    public CityBean(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getTarget() {
        return city;
    }
}
