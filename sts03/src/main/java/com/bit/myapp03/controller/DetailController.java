package com.bit.myapp03.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.myapp03.model.GuestDao;
import com.bit.myapp03.model.entity.GuestVo;

@Controller
public class DetailController {

	Logger log=Logger.getLogger(getClass());
	
	@Autowired
	private GuestDao guestDao;

	@RequestMapping(value="/guest/{idx}",method=RequestMethod.GET)
	public String detail(@PathVariable int idx,Model model) throws Exception {
		model.addAttribute("bean",guestDao.selectOne(idx));
		return "detail";
	}
	
	//PUT,delete method 사용방법
	//form-> <input type="hidden" name="_method" value="put"/>
	//web.xml -><filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	//pattern -> /* 
	
	@RequestMapping(value="/guest/{idx}",method=RequestMethod.PUT)
	public String edit(@PathVariable int idx,@ModelAttribute GuestVo bean) throws Exception {
		//guestDao.updateOne(bean);
		log.debug("PUT"+bean);
		return "redirect:/guest/"+idx;
	}
	
}
