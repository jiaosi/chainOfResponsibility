package cn.fqy.designpattern.filter;

public class SensetiveWordsFilter implements Filter {

	@Override
	public String doFilter(String str) {
		String r = str.replace("被就业", "就业");
		r = r.replace("敏感", "");
		return r;
	}

}
