package com.awt2;
//20161107
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//replaceAll
public class Test8 {
	public static String replaceAll(String str, String oldStr, String newStr){
		if(str==null)
			return null;
		Pattern p = Pattern.compile(oldStr);
		Matcher m = p.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		
		//¥Î«—πŒ±π ¥Î«—πŒ±π
		while (m.find()) 
			m.appendReplacement(sb, newStr);
		m.appendTail(sb);//<-æ¯¿∏∏È ∏∂¡ˆ∏∑ "πŒ±π"¿Ã æ»≥™ø»
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "øÏ∏Æ≥™∂Û ¥Î«—πŒ±π ¥Î«—πŒ±π";
		String s = Test8.replaceAll(str, "¥Î«—", "”ﬁ˘€");
		
		System.out.println(s);
	}
}
