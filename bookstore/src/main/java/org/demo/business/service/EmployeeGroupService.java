/*
 * Created on 10 Jan 2017 ( Time 18:00:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service;

import java.util.List;

import org.demo.bean.EmployeeGroup;

/**
 * Business Service Interface for entity EmployeeGroup.
 */
public interface EmployeeGroupService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param employeeCode
	 * @param groupId
	 * @return entity
	 */
	EmployeeGroup findById( String employeeCode, Short groupId  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<EmployeeGroup> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	EmployeeGroup save(EmployeeGroup entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	EmployeeGroup update(EmployeeGroup entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	EmployeeGroup create(EmployeeGroup entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param employeeCode
	 * @param groupId
	 */
	void delete( String employeeCode, Short groupId );


}
