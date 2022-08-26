package com.kmm.app.bean

import com.kmm.app.bean.DataBean


/**
 * @author: xiaxueyi
 * @date: 2022-08-23
 * @time: 11:14
 * @说明:
 */
class StocksBean {
    public var symbol:String?="";
    public var pc:String?="";
    public var interval:String?="";
    public var maxPeriod:String?="";
    public var tradingDate:MutableList<String>?=null;
    public var data:MutableList<DataBean>?=null;

}