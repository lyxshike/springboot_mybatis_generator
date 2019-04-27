package com.orangesay.mapper;

import com.orangesay.entity.Score;

public interface ScoreMapper {
    int insert(Score record);

    int insertSelective(Score record);
}