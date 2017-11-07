package com.prj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prj.bean.Dept;
import com.prj.bean.Page;
import com.prj.biz.IDeptBiz;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context  =  new ClassPathXmlApplicationContext("applicationContext.xml");
		IDeptBiz deptBiz = (IDeptBiz) context.getBean("deptBiz");
		
		Page<Dept> deptPage= new Page<Dept>();
		deptPage.setLoc(null);
		
		for(Dept dept : deptBiz.showDeptByPage(deptPage)){
			System.out.println(dept.getName()+" "+dept.getLoc());
		}
		
		
	}
}
