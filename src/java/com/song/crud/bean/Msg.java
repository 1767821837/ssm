package com.song.crud.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回json数据
 */
public class Msg {
    //    状态码
    private int code;
    //    提示信息
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    private Map<String, Object> extend = new HashMap<String, Object>();

    public Msg Success() {
        Msg msg = new Msg();
        msg.code = 100;
        msg.msg = "处理请求成功！";
        return msg;
    }

    public Msg fail() {
        Msg msg = new Msg();
        msg.code = 200;
        msg.msg = "处理请求失败！";
        return msg;
    }
    public Msg add(String key, Object val) {
        this.getExtend().put(key, val);
        return this;
    }
}
