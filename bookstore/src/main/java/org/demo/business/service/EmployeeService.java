/*
 * Created on 10 Jan 2017 ( Time 18:00:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service;

import java.util.List;

import org.demo.bean.Employee;

/**
 * Business Service Interface for entity Employee.
 */
public interface EmployeeService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param code
	 * @return entity
	 */
	Employee findById( String code  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Employee> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Employee save(Employee entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Employee update(Employee entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Employee create(Employee entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param code
	 */
	void delete( String code );


}
