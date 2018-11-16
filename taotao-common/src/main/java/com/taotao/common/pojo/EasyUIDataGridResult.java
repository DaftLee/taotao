package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult implements Serializable {
    private Integer total;
    private List rows;

    public EasyUIDataGridResult(Integer total,List rows){
        this.rows = rows;
        this.total = total;
    }

    public EasyUIDataGridResult(){};

    public Integer getTotal() {
        return total;
    }

    public List getRows() {
        return rows;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
