

package com.truonghan.backend.test;



import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.truonghan.backend.daos.PartDao;
import com.truonghan.backend.model.Part;
import com.truonghan.backend.service.PartService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/backend-context.xml")
@TransactionConfiguration(defaultRollback=true)
public class DaoTest {

	@Autowired
	PartService service;
	
	@Test
	public void test() {
		List<Part> parts = service.findAll();
		assertTrue(parts.size()>0);;
	}

}
