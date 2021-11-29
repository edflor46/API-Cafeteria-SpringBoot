package com.edflor.cafeteria.entity.dao;

import com.edflor.cafeteria.entity.Cafe;
import org.springframework.data.repository.CrudRepository;

public interface ICafeDao extends CrudRepository<Cafe, Long> {
}
