package com.truonghan.backend.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truonghan.backend.model.Part;

public interface PartDao extends JpaRepository<Part	, Integer> {

	List<Part> findByBrand(String brand);
}
