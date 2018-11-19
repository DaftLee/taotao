package com.taotao.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.EasyUIItemTree;
import com.taotao.service.ItemCatService;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
    @Reference
    ItemCatService itemCatService;

    @ResponseBody
    @RequestMapping("/item/cat/list")
    public List<EasyUIItemTree> getItemCat(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<EasyUIItemTree> itemCat = itemCatService.getItemCat(parentId);
        return itemCat;
    }
}
