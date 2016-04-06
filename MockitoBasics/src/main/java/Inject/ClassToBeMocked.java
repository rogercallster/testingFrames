package Inject;

public class ClassToBeMocked {
	
	public String string = "String1";
	
	public String returnString(int num){
		if (num > 0) return string;
		return " got 0";
	}
	
}
