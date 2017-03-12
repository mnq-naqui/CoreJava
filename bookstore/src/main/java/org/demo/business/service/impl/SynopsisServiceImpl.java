/*
 * Created on 10 Jan 2017 ( Time 18:00:09 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.demo.bean.Synopsis;
import org.demo.bean.jpa.SynopsisEntity;
import org.demo.business.service.SynopsisService;
import org.demo.business.service.mapping.SynopsisServiceMapper;
import org.demo.data.repository.jpa.SynopsisJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of SynopsisService
 */
@Component
@Transactional
public class SynopsisServiceImpl implements SynopsisService {

	@Resource
	private SynopsisJpaRepository synopsisJpaRepository;

	@Resource
	private SynopsisServiceMapper synopsisServiceMapper;
	
	@Override
	public Synopsis findById(Integer bookId) {
		SynopsisEntity synopsisEntity = synopsisJpaRepository.findOne(bookId);
		return synopsisServiceMapper.mapSynopsisEntityToSynopsis(synopsisEntity);
	}

	@Override
	public List<Synopsis> findAll() {
		Iterable<SynopsisEntity> entities = synopsisJpaRepository.findAll();
		List<Synopsis> beans = new ArrayList<Synopsis>();
		for(SynopsisEntity synopsisEntity : entities) {
			beans.add(synopsisServiceMapper.mapSynopsisEntityToSynopsis(synopsisEntity));
		}
		return beans;
	}

	@Override
	public Synopsis save(Synopsis synopsis) {
		return update(synopsis) ;
	}

	@Override
	public Synopsis create(Synopsis synopsis) {
		SynopsisEntity synopsisEntity = synopsisJpaRepository.findOne(synopsis.getBookId());
		if( synopsisEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		synopsisEntity = new SynopsisEntity();
		synopsisServiceMapper.mapSynopsisToSynopsisEntity(synopsis, synopsisEntity);
		SynopsisEntity synopsisEntitySaved = synopsisJpaRepository.save(synopsisEntity);
		return synopsisServiceMapper.mapSynopsisEntityToSynopsis(synopsisEntitySaved);
	}

	@Override
	public Synopsis update(Synopsis synopsis) {
		SynopsisEntity synopsisEntity = synopsisJpaRepository.findOne(synopsis.getBookId());
		synopsisServiceMapper.mapSynopsisToSynopsisEntity(synopsis, synopsisEntity);
		SynopsisEntity synopsisEntitySaved = synopsisJpaRepository.save(synopsisEntity);
		return synopsisServiceMapper.mapSynopsisEntityToSynopsis(synopsisEntitySaved);
	}

	@Override
	public void delete(Integer bookId) {
		synopsisJpaRepository.delete(bookId);
	}

	public SynopsisJpaRepository getSynopsisJpaRepository() {
		return synopsisJpaRepository;
	}

	public void setSynopsisJpaRepository(SynopsisJpaRepository synopsisJpaRepository) {
		this.synopsisJpaRepository = synopsisJpaRepository;
	}

	public SynopsisServiceMapper getSynopsisServiceMapper() {
		return synopsisServiceMapper;
	}

	public void setSynopsisServiceMapper(SynopsisServiceMapper synopsisServiceMapper) {
		this.synopsisServiceMapper = synopsisServiceMapper;
	}

}
