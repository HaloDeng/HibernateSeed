package com.halo.seed.service;

import com.halo.seed.dao.IndexDAO;
import com.halo.seed.entity.IndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDAO indexDAO;

    public IndexEntity getOne(Integer id) {
        return indexDAO.querySingle(id);
    }

    public void addOne(IndexEntity entity) {
        indexDAO.add(entity);
    }
}
