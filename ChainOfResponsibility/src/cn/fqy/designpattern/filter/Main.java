package cn.fqy.designpattern.filter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "大家好:)，<<script>，敏感，被就业，今天的风，甚是喧嚣啊";
		MsgProcessor msgProcessor = new MsgProcessor();
		msgProcessor.setString(str);
		str = msgProcessor.process();
		System.out.println(str);
	}

}
