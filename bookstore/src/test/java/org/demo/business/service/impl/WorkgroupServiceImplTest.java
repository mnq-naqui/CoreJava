/*
 * Created on 10 Jan 2017 ( Time 18:00:09 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.demo.bean.Workgroup;
import org.demo.bean.jpa.WorkgroupEntity;
import java.util.Date;
import java.util.List;
import org.demo.business.service.mapping.WorkgroupServiceMapper;
import org.demo.data.repository.jpa.WorkgroupJpaRepository;
import org.demo.test.WorkgroupFactoryForTest;
import org.demo.test.WorkgroupEntityFactoryForTest;
import org.demo.test.MockValues;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Test : Implementation of WorkgroupService
 */
@RunWith(MockitoJUnitRunner.class)
public class WorkgroupServiceImplTest {

	@InjectMocks
	private WorkgroupServiceImpl workgroupService;
	@Mock
	private WorkgroupJpaRepository workgroupJpaRepository;
	@Mock
	private WorkgroupServiceMapper workgroupServiceMapper;
	
	private WorkgroupFactoryForTest workgroupFactoryForTest = new WorkgroupFactoryForTest();

	private WorkgroupEntityFactoryForTest workgroupEntityFactoryForTest = new WorkgroupEntityFactoryForTest();

	private MockValues mockValues = new MockValues();
	
	@Test
	public void findById() {
		// Given
		Short id = mockValues.nextShort();
		
		WorkgroupEntity workgroupEntity = workgroupJpaRepository.findOne(id);
		
		Workgroup workgroup = workgroupFactoryForTest.newWorkgroup();
		when(workgroupServiceMapper.mapWorkgroupEntityToWorkgroup(workgroupEntity)).thenReturn(workgroup);

		// When
		Workgroup workgroupFound = workgroupService.findById(id);

		// Then
		assertEquals(workgroup.getId(),workgroupFound.getId());
	}

	@Test
	public void findAll() {
		// Given
		List<WorkgroupEntity> workgroupEntitys = new ArrayList<WorkgroupEntity>();
		WorkgroupEntity workgroupEntity1 = workgroupEntityFactoryForTest.newWorkgroupEntity();
		workgroupEntitys.add(workgroupEntity1);
		WorkgroupEntity workgroupEntity2 = workgroupEntityFactoryForTest.newWorkgroupEntity();
		workgroupEntitys.add(workgroupEntity2);
		when(workgroupJpaRepository.findAll()).thenReturn(workgroupEntitys);
		
		Workgroup workgroup1 = workgroupFactoryForTest.newWorkgroup();
		when(workgroupServiceMapper.mapWorkgroupEntityToWorkgroup(workgroupEntity1)).thenReturn(workgroup1);
		Workgroup workgroup2 = workgroupFactoryForTest.newWorkgroup();
		when(workgroupServiceMapper.mapWorkgroupEntityToWorkgroup(workgroupEntity2)).thenReturn(workgroup2);

		// When
		List<Workgroup> workgroupsFounds = workgroupService.findAll();

		// Then
		assertTrue(workgroup1 == workgroupsFounds.get(0));
		assertTrue(workgroup2 == workgroupsFounds.get(1));
	}

	@Test
	public void create() {
		// Given
		Workgroup workgroup = workgroupFactoryForTest.newWorkgroup();

		WorkgroupEntity workgroupEntity = workgroupEntityFactoryForTest.newWorkgroupEntity();
		when(workgroupJpaRepository.findOne(workgroup.getId())).thenReturn(null);
		
		workgroupEntity = new WorkgroupEntity();
		workgroupServiceMapper.mapWorkgroupToWorkgroupEntity(workgroup, workgroupEntity);
		WorkgroupEntity workgroupEntitySaved = workgroupJpaRepository.save(workgroupEntity);
		
		Workgroup workgroupSaved = workgroupFactoryForTest.newWorkgroup();
		when(workgroupServiceMapper.mapWorkgroupEntityToWorkgroup(workgroupEntitySaved)).thenReturn(workgroupSaved);

		// When
		Workgroup workgroupResult = workgroupService.create(workgroup);

		// Then
		assertTrue(workgroupResult == workgroupSaved);
	}

	@Test
	public void createKOExists() {
		// Given
		Workgroup workgroup = workgroupFactoryForTest.newWorkgroup();

		WorkgroupEntity workgroupEntity = workgroupEntityFactoryForTest.newWorkgroupEntity();
		when(workgroupJpaRepository.findOne(workgroup.getId())).thenReturn(workgroupEntity);

		// When
		Exception exception = null;
		try {
			workgroupService.create(workgroup);
		} catch(Exception e) {
			exception = e;
		}

		// Then
		assertTrue(exception instanceof IllegalStateException);
		assertEquals("already.exists", exception.getMessage());
	}

	@Test
	public void update() {
		// Given
		Workgroup workgroup = workgroupFactoryForTest.newWorkgroup();

		WorkgroupEntity workgroupEntity = workgroupEntityFactoryForTest.newWorkgroupEntity();
		when(workgroupJpaRepository.findOne(workgroup.getId())).thenReturn(workgroupEntity);
		
		WorkgroupEntity workgroupEntitySaved = workgroupEntityFactoryForTest.newWorkgroupEntity();
		when(workgroupJpaRepository.save(workgroupEntity)).thenReturn(workgroupEntitySaved);
		
		Workgroup workgroupSaved = workgroupFactoryForTest.newWorkgroup();
		when(workgroupServiceMapper.mapWorkgroupEntityToWorkgroup(workgroupEntitySaved)).thenReturn(workgroupSaved);

		// When
		Workgroup workgroupResult = workgroupService.update(workgroup);

		// Then
		verify(workgroupServiceMapper).mapWorkgroupToWorkgroupEntity(workgroup, workgroupEntity);
		assertTrue(workgroupResult == workgroupSaved);
	}

	@Test
	public void delete() {
		// Given
		Short id = mockValues.nextShort();

		// When
		workgroupService.delete(id);

		// Then
		verify(workgroupJpaRepository).delete(id);
		
	}

}
