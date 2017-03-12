/*
 * Created on 10 Jan 2017 ( Time 17:58:51 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.rest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.demo.bean.Author;
import org.demo.business.service.AuthorService;
import org.demo.web.listitem.AuthorListItem;

/**
 * Spring MVC controller for 'Author' management.
 */
@Controller
public class AuthorRestController {

	@Resource
	private AuthorService authorService;
	
	@RequestMapping( value="/items/author",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<AuthorListItem> findAllAsListItems() {
		List<Author> list = authorService.findAll();
		List<AuthorListItem> items = new LinkedList<AuthorListItem>();
		for ( Author author : list ) {
			items.add(new AuthorListItem( author ) );
		}
		return items;
	}
	
	@RequestMapping( value="/author",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Author> findAll() {
		return authorService.findAll();
	}

	@RequestMapping( value="/author/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Author findOne(@PathVariable("id") Integer id) {
		return authorService.findById(id);
	}
	
	@RequestMapping( value="/author",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Author create(@RequestBody Author author) {
		return authorService.create(author);
	}

	@RequestMapping( value="/author/{id}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Author update(@PathVariable("id") Integer id, @RequestBody Author author) {
		return authorService.update(author);
	}

	@RequestMapping( value="/author/{id}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("id") Integer id) {
		authorService.delete(id);
	}
	
}
