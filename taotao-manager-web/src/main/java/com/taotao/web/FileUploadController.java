package com.taotao.web;

import com.taotao.util.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FileUploadController {
    @Value("${TAOTAO_IMAGE_SERVER_URL}")
    String TAOTAO_IMAGE_SERVER_URL;

    @ResponseBody
    @RequestMapping(value = "/pic/upload")
    //***,produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8" *** 将application/json;charset=UTF-8替换为text/plain;charset=UTF-8解决浏览器兼容问题
    public Map fileUpload(@RequestParam MultipartFile uploadFile){
        Map resultMap = new HashMap<>();
        try {
            //获取文件原始名
            String fileOriginName = uploadFile.getOriginalFilename();
            //获取后缀名
            String extName = fileOriginName.substring(fileOriginName.lastIndexOf(".")+1);

            //初始化FastDFS客户端
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:FastDFSclient.conf");

            //上传文件并返回地址
            String path = fastDFSClient.uploadFile(uploadFile.getBytes(),extName);

            //拼接域名+返回地址
            String url = TAOTAO_IMAGE_SERVER_URL+path;
            resultMap.put("error",0);
            resultMap.put("url",url);
            return resultMap;
        }
        catch (Exception e){
            e.printStackTrace();
            resultMap.put("error",1);
            resultMap.put("message","图片上传失败");
            return resultMap;
        }

    }
}
