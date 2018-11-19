package com.taotao.service;

import com.taotao.common.pojo.EasyUIItemTree;

import java.util.List;

public interface ItemCatService {
    public List<EasyUIItemTree> getItemCat(Long parentId);
}
