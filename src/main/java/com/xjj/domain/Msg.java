package com.xjj.domain;

/**
 * SpringBootDemo
 * Created by xian.juanjuan on 2017-6-28 09:03.
 */
public class Msg {

    private String title;
    private String content;
    private  String etraInfo;

    public Msg(String title, String content, String etraInfo) {
        super();
        this.content = content;
        this.etraInfo = etraInfo;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEtraInfo() {
        return etraInfo;
    }

    public void setEtraInfo(String etraInfo) {
        this.etraInfo = etraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
