package com.truonghan.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.truonghan.backend.daos.PartDao;
import com.truonghan.backend.model.Part;

@Service
public class PartServiceImpl implements PartService{

	@Autowired
	PartDao dao;
	
	public List<Part> findAll(){
		return dao.findAll();
	}
}
