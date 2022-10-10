package com.sist.web.entity;

import javax.persistence.Entity;
/*
NO int 
TITLE text 
POSTER text 
CONTENT text 
AUTHOR text 
PRICE text 
REGDATE text 
ISBN text 
TAGS text
 */
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity(name = "book")
@Getter
@Setter
public class BookEntity {
	@Id
	private int no;
	private String title,poster,content,author,price,regdate,isbn,tags;
}
