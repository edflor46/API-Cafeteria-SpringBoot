package com.edflor.cafeteria.services;

import com.edflor.cafeteria.entity.Cafe;
import com.edflor.cafeteria.entity.dao.ICafeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements ICafeService{

    @Autowired
    private ICafeDao cafeDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cafe> findAll() {
        return (List<Cafe>) cafeDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cafe findById(Long id) {
        return cafeDao.findById(id).orElse(null);
    }

}
