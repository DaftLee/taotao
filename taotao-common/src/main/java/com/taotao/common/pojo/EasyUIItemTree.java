package com.taotao.common.pojo;

import java.io.Serializable;

public class EasyUIItemTree implements Serializable {
    private Long id;
    private String text;
    private String state;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getState() {
        return state;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "EasyUIItemTree{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
