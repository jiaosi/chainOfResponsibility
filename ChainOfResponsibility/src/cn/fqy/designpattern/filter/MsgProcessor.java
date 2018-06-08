package cn.fqy.designpattern.filter;

public class MsgProcessor {
	
	private String string;
	
	Filter[] filters = {new HTMLFilter(), new SensetiveWordsFilter()};

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public String process(){
//		//process the html tag <>
//		String r = string.replace("<", "[").replace(">", "]");
//		
//		//process the sensitive words
//		r = r.replace("被就业", "就业");
//		r = r.replace("敏感", "");
		String r = "";
		for(Filter f : filters){
			r = f.doFilter(string);
		}
		
		return r;
	}

}
