package com.ifenqu.test.mock.pay.models;

/**
 * Created by shi on 2017/1/4.
 * 通联支付请求post数据
 */
public class AllinRequestModel {
    private String method;
    private String timestamp;
    private String channel;
    private String order_id;
    private String amount;
    private String trade_date;
    private String trade_time;
    private String nper;
    private String unalter;
    private String pdno;
    private String description;
    private String return_url;
    private String notify_url;
    private String creditName;
    private String cetitype;
    private String idno;
    private String phoneNo;
    private String creditNo;


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }

    public String getTrade_time() {
        return trade_time;
    }

    public void setTrade_time(String trade_time) {
        this.trade_time = trade_time;
    }

    public String getNper() {
        return nper;
    }

    public void setNper(String nper) {
        this.nper = nper;
    }

    public String getUnalter() {
        return unalter;
    }

    public void setUnalter(String unalter) {
        this.unalter = unalter;
    }

    public String getPdno() {
        return pdno;
    }

    public void setPdno(String pdno) {
        this.pdno = pdno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public String getCetitype() {
        return cetitype;
    }

    public void setCetitype(String cetitype) {
        this.cetitype = cetitype;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }
}
