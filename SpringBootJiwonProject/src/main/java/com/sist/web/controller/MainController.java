package com.sist.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.dao.VideoDAO;
import com.sist.web.entity.VideoEntity;


@Controller
public class MainController {
	@Autowired
	  private VideoDAO dao;
	  
	  @GetMapping("/main")
	  public String main_page(String page,Model model)
	  {
		  if(page==null)
			  page="1";
		  int curpage=Integer.parseInt(page);
		  int rowSize=12;
		  int start=(rowSize*curpage)-rowSize;
		  List<VideoEntity> list=dao.videoListData(start);
		  
		  model.addAttribute("list", list);
		  model.addAttribute("main_content", "main/home");
		  return "main";
	  }
}
