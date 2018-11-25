package com.taotao.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.QureyNowMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

public class PageHelperTest {

    @Test
    public void PageHelperT(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        TbItemMapper tbItemMapper = classPathXmlApplicationContext.getBean(TbItemMapper.class);
        PageHelper.startPage(3,3);

//        System.out.println(qureyNowMapper);
        List<TbItem> tbItems =  tbItemMapper.selectByNum(99999);

        PageInfo<TbItem> tbItemPageInfo = new PageInfo<>(tbItems);
        for (TbItem tbitem: tbItems
             ) {
            System.out.println(tbitem.getId()+"*****"+tbitem.getTitle());
        }
    }
}
