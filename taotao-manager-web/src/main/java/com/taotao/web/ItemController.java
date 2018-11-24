package com.taotao.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Reference
    ItemService itemService;

    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page , Integer rows){
        System.out.println(itemService);
        return itemService.getItemList(page, rows);
    }

    @RequestMapping("/item/save")
    @ResponseBody
    public TaotaoResult saveItem(TbItem tbItem,String desc){
        TaotaoResult taotaoResult = itemService.saveItem(tbItem, desc);
        return taotaoResult;
    }
}
