package Yixin.Taoche.TestScripts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0.6万";

    	String reg = "[\u4e00-\u9fa5]";

    	Pattern pat = Pattern.compile(reg);  

    	Matcher mat=pat.matcher(str); 

    	String repickStr = mat.replaceAll("");

    	System.out.println("去中文后:"+repickStr);
	}

}
