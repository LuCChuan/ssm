package com.prj.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.prj.bean.Dept;
import com.prj.bean.Page;
import com.prj.biz.IDeptBiz;
import com.prj.dao.IDeptDao;

@Service
public class DeptBiz implements IDeptBiz{
	
	@Resource
	private IDeptDao deptDao;
	
	public List<Dept> showAllDept() {
		return deptDao.queryAllDept();
	}

	public List<Dept> showDeptByPage(Page<Dept> deptPage) {
		return deptDao.queryDeptByPage(deptPage);
	}
	
	public IDeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}



}
