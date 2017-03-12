/*
 * Created on 10 Jan 2017 ( Time 18:00:09 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.Workgroup;
import org.demo.bean.jpa.WorkgroupEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class WorkgroupServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public WorkgroupServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'WorkgroupEntity' to 'Workgroup'
	 * @param workgroupEntity
	 */
	public Workgroup mapWorkgroupEntityToWorkgroup(WorkgroupEntity workgroupEntity) {
		if(workgroupEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Workgroup workgroup = map(workgroupEntity, Workgroup.class);

		return workgroup;
	}
	
	/**
	 * Mapping from 'Workgroup' to 'WorkgroupEntity'
	 * @param workgroup
	 * @param workgroupEntity
	 */
	public void mapWorkgroupToWorkgroupEntity(Workgroup workgroup, WorkgroupEntity workgroupEntity) {
		if(workgroup == null) {
			return;
		}

		//--- Generic mapping 
		map(workgroup, workgroupEntity);

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}