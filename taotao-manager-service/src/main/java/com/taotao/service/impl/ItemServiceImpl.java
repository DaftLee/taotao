package com.taotao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbItemDescMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import com.taotao.util.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service(timeout = 100000)
public class ItemServiceImpl implements ItemService {
    @Autowired
    TbItemMapper tbItemMapper;
    @Autowired
    TbItemDescMapper tbItemDescMapper;
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

    @Override
    public TaotaoResult saveItem(TbItem item, String desc) {
        Date date = new Date();
        Long itemId = IDUtils.genItemId();
        Byte status = (byte)1;//上架1，下架2，删除3

        //补全并插入item
        item.setUpdated(date);
        item.setCreated(date);
        item.setSellPoint(desc);
        item.setId(itemId);
        item.setStatus(status);
        tbItemMapper.insert(item);
        System.out.println(item.getTitle());

        //新建并插入itemDesc
        TbItemDesc tbItemDesc = new TbItemDesc();
        tbItemDesc.setCreated(date);
        tbItemDesc.setUpdated(date);
        tbItemDesc.setItemDesc(desc);
        tbItemDesc.setItemId(itemId);
        tbItemDescMapper.insert(tbItemDesc);

        TaotaoResult taotaoResult = new TaotaoResult();
        return TaotaoResult.ok();

    }


}
