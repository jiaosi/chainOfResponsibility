package cn.fqy.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链:用以存放一系列过滤规则
 * 用arrayList存储
 * @author acer
 *
 */
public class FilterChain {
	/*
	 * 存放一系列过滤规则
	 */
	List<Filter> listFilters = new ArrayList<Filter>();
	/*
	 * 返回自身
	 */
	public FilterChain addFilter(Filter filter){
		this.listFilters.add(filter);
		return this;
	}

	public String doFilter(String string){
		String r = "";
		for(Filter f : listFilters){
			r = f.doFilter(string);
		}
		return r;
	}
}
