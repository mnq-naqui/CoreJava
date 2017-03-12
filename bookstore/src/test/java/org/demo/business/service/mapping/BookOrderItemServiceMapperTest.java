/*
 * Created on 10 Jan 2017 ( Time 18:00:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.BookOrderItem;
import org.demo.bean.jpa.BookOrderItemEntity;
import org.demo.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class BookOrderItemServiceMapperTest {

	private BookOrderItemServiceMapper bookOrderItemServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		bookOrderItemServiceMapper = new BookOrderItemServiceMapper();
		bookOrderItemServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'BookOrderItemEntity' to 'BookOrderItem'
	 * @param bookOrderItemEntity
	 */
	@Test
	public void testMapBookOrderItemEntityToBookOrderItem() {
		// Given
		BookOrderItemEntity bookOrderItemEntity = new BookOrderItemEntity();
		bookOrderItemEntity.setQuantity(mockValues.nextInteger());
		bookOrderItemEntity.setPrice(mockValues.nextBigDecimal());
		
		// When
		BookOrderItem bookOrderItem = bookOrderItemServiceMapper.mapBookOrderItemEntityToBookOrderItem(bookOrderItemEntity);
		
		// Then
		assertEquals(bookOrderItemEntity.getQuantity(), bookOrderItem.getQuantity());
		assertEquals(bookOrderItemEntity.getPrice(), bookOrderItem.getPrice());
	}
	
	/**
	 * Test : Mapping from 'BookOrderItem' to 'BookOrderItemEntity'
	 */
	@Test
	public void testMapBookOrderItemToBookOrderItemEntity() {
		// Given
		BookOrderItem bookOrderItem = new BookOrderItem();
		bookOrderItem.setQuantity(mockValues.nextInteger());
		bookOrderItem.setPrice(mockValues.nextBigDecimal());

		BookOrderItemEntity bookOrderItemEntity = new BookOrderItemEntity();
		
		// When
		bookOrderItemServiceMapper.mapBookOrderItemToBookOrderItemEntity(bookOrderItem, bookOrderItemEntity);
		
		// Then
		assertEquals(bookOrderItem.getQuantity(), bookOrderItemEntity.getQuantity());
		assertEquals(bookOrderItem.getPrice(), bookOrderItemEntity.getPrice());
	}

}