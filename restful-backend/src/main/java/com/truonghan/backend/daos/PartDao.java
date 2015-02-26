package com.truonghan.backend.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truonghan.backend.model.Part;

public interface PartDao extends JpaRepository<Part	, Integer> {

}
