package cn.fqy.designpattern.filter;

public class MsgProcessor {
	
	private String string;
	
	private FilterChain filterChain;
	
	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public String process(){
		
		return filterChain.doFilter(string);
	}

}
