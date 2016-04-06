package spyBasic;

public class MyBaseClass {

	public String Method1(){
		return "Method 1";
	}
	public String Method2(){
		return "Method 2";
	}
	public String Method3(){
		return Method2();
	}
	public String Method4(){
		return "";
	}
	
}
