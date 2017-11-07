package com.prj.bean;

import java.util.List;

public class Page<T> {
	
	private int currentPage=1;
	private int maxResult=5;
	private int firstCount;
	private int count;
	private int allPage;
	private List<T> pageList;
	private String loc;
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAllPage() {
		return count%maxResult==0?count/maxResult:count/maxResult+1;
	}
	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}
	public List<T> getPageList() {
		return pageList;
	}
	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getFirstCount() {
		return (currentPage-1)*maxResult;
	}
	public void setFirstCount(int firstCount) {
		this.firstCount = firstCount;
	}
	
	
}
