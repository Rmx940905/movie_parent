package com.mailuo.dao;

import com.mailuo.entity.VideoType;

import java.util.List;

public interface VideoTypeMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(VideoType record);

	int insertSelective(VideoType record);

	VideoType selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(VideoType record);

	int updateByPrimaryKey(VideoType record);

	List<VideoType> selectList(VideoType record);
}