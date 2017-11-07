package com.prj.biz;

import java.util.List;

import com.prj.bean.Dept;
import com.prj.bean.Page;

public interface IDeptBiz {
	
	public List<Dept> showAllDept();
	public List<Dept> showDeptByPage(Page<Dept> deptPage);
	
}
