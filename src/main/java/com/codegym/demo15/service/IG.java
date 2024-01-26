package com.codegym.demo15.service;

import java.util.Optional;

public interface IG <T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void delete(Long id);
}
