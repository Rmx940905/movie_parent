package com.mailuo.controller;

import com.mailuo.entity.VideoType;
import com.mailuo.service.VideoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * @Description:
 * @Param:
 * @return:
 * @Author: 冉茂旭
 * @Date: 2019/3/28
**/
@Controller
public class TestController {
    //跳转到测试页面
    private static final String TEST = "test";

    @Autowired
    private VideoTypeService videoTypeService;

    @RequestMapping("/hello")
    public String hello(){
        return TEST;
    }

    @ResponseBody
    @RequestMapping("/getVideoTypeList")
    public List<VideoType> getvideotypelist(){
        List<VideoType> videoTypes = videoTypeService.getVideoType(null);
        for (int i = 0; i <videoTypes.size() ; i++) {
            System.out.println(videoTypes.get(i));
        }
        return videoTypes;
    }
}
