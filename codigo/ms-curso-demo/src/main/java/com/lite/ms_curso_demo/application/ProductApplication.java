package com.lite.ms_curso_demo.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lite.ms_curso_demo.domain.Product;

public interface ProductApplication extends JpaRepository<Product, Long> {

    List<Product> findByNameContaining(String name); 



}