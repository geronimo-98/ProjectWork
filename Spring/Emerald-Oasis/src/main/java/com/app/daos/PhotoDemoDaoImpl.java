package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.PhotoDemo;

public interface PhotoDemoDaoImpl extends JpaRepository<PhotoDemo, Integer> {

}
