package com.sist.web.entity;

import javax.persistence.Entity;
/*
CNO int 
TITLE text 
SUBTITLE text 
POSTER text 
INFO text 
CEND text 
INTRO text 
CLIST text 
PRICE int
 */
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity(name = "video")
@Getter
@Setter
public class VideoEntity {
	@Id
	private int cno;
	private String title,subtitle,poster,info,cend,intro,clist,price;
}
