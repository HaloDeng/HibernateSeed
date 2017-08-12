package com.halo.seed.dao;

import com.halo.seed.entity.IndexEntity;

public interface IndexDAO {
    public void add(IndexEntity entity);
    public IndexEntity querySingle(Integer id);
}
