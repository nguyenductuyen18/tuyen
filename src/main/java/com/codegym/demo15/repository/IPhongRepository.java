package com.codegym.demo15.repository;

import com.codegym.demo15.model.Phong;
import org.springframework.data.repository.CrudRepository;

public interface IPhongRepository extends CrudRepository<Phong,Long> {
}
