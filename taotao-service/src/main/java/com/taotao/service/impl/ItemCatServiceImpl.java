package com.taotao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.taotao.common.pojo.EasyUIItemTree;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service(timeout = 100000)
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUIItemTree> getItemCat(Long parentId) {
        TbItemCatExample tbItemCatExample = new TbItemCatExample();

        tbItemCatExample.createCriteria().andParentIdEqualTo(parentId);

        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(tbItemCatExample);

        List<EasyUIItemTree> easyUIItemTrees = new ArrayList<>();

        for (TbItemCat tbItemCat: tbItemCats) {
            EasyUIItemTree easyUIItemTree = new EasyUIItemTree();
            easyUIItemTree.setId(tbItemCat.getId());
            easyUIItemTree.setText(tbItemCat.getName());
            easyUIItemTree.setState(tbItemCat.getIsParent()?"closed":"open");

            easyUIItemTrees.add(easyUIItemTree);
        }

        return easyUIItemTrees;
    }
}
