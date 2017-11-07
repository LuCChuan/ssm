package com.prj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prj.bean.Dept;
import com.prj.bean.Page;
import com.prj.biz.IDeptBiz;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private IDeptBiz deptBiz;
	
	@RequestMapping(value="method")
	public String method(HttpServletRequest request,Page<Dept> deptPage){
		//当前显示的集合
		List<Dept> deptList = deptBiz.showDeptByPage(deptPage);
		int count = deptBiz.showAllDept().size();
		
		deptPage.setPageList(deptList);
		deptPage.setCount(count);
		
		request.setAttribute("deptPage", deptPage);
		
		return "/show.jsp";
	}

	public IDeptBiz getDeptBiz() {
		return deptBiz;
	}
	
	@Resource
	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}
	
	
}
