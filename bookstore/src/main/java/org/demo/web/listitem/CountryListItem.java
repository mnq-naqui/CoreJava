/*
 * Created on 10 Jan 2017 ( Time 17:58:53 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.web.listitem;

import org.demo.bean.Country;
import org.demo.web.common.ListItem;

public class CountryListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public CountryListItem(Country country) {
		super();

		this.value = ""
			 + country.getCode()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = country.toString();
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
