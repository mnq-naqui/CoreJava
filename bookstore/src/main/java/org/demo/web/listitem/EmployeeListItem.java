/*
 * Created on 10 Jan 2017 ( Time 17:58:53 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.web.listitem;

import org.demo.bean.Employee;
import org.demo.web.common.ListItem;

public class EmployeeListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public EmployeeListItem(Employee employee) {
		super();

		this.value = ""
			 + employee.getCode()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = employee.toString();
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getLabel() {
		return label;
	}

}