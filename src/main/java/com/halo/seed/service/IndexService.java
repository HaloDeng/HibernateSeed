package com.halo.seed.service;

import com.halo.seed.entity.IndexEntity;

public interface IndexService {
    IndexEntity getOne(Integer id);

    void addOne(IndexEntity entity);
}
