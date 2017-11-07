package com.prj.dao;

import java.util.List;

import com.prj.bean.Dept;
import com.prj.bean.Page;

public interface IDeptDao {
	
	public List<Dept> queryDeptByPage(Page<Dept> deptPage);
	public List<Dept> queryAllDept();
	public Dept queryDeptById(int id);
	public boolean addDept(Dept dept);
	public boolean updDept(Dept dept);
	public boolean delDept(int id);
	
}
