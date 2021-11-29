package com.edflor.cafeteria.services;

import com.edflor.cafeteria.entity.Cafe;
import com.edflor.cafeteria.entity.dao.ICafeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ClienteServiceImpl implements ICafeService{

    @Autowired
    private ICafeDao cafeDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cafe> findAll() {
        return (List<Cafe>) cafeDao.findAll();
    }
}
