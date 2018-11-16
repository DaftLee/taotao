package com.taotao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(timeout = 100000)
public class ItemServiceImpl implements ItemService {
    @Autowired
    TbItemMapper tbItemMapper;
    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        if (page==null){ page = 1; }
        if (rows==null){ rows = 30; }
        PageHelper.startPage(page,rows);
        List<TbItem> tbItemsList = tbItemMapper.selectByExample(new TbItemExample());
        PageInfo pageInfo = new PageInfo(tbItemsList);
        EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult((int)pageInfo.getTotal(),pageInfo.getList());
        return easyUIDataGridResult;
    }
}
