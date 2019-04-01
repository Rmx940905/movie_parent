package com.mailuo.service.impl;

import com.mailuo.dao.VideoTypeMapper;
import com.mailuo.entity.VideoType;
import com.mailuo.service.VideoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoTypeServiceImpl implements VideoTypeService {

    @Autowired
    private VideoTypeMapper videoTypeMapper;

    public List<VideoType> getVideoType(VideoType videoType){

        return  videoTypeMapper.selectList(videoType);
    }
}
