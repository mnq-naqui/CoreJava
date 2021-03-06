/*
 * Created on 10 Jan 2017 ( Time 17:58:55 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.web.listitem;

import org.demo.bean.Synopsis;
import org.demo.web.common.ListItem;

public class SynopsisListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public SynopsisListItem(Synopsis synopsis) {
		super();

		this.value = ""
			 + synopsis.getBookId()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = synopsis.toString();
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
