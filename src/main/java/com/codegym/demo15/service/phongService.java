package com.codegym.demo15.service;

import com.codegym.demo15.model.Phong;
import com.codegym.demo15.repository.IPhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class phongService implements IPhongService{
@Autowired
private IPhongRepository iPhongRepository;
    @Override
    public Iterable<Phong> findAll() {
        return iPhongRepository.findAll();
    }

    @Override
    public Optional<Phong> findById(Long id) {
        return iPhongRepository.findById(id);
    }

    @Override
    public void save(Phong phong) {
        iPhongRepository.save(phong);
    }

    @Override
    public void delete(Long id) {
        iPhongRepository.deleteById(id);
    }
}
