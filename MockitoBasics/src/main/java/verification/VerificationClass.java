package verification;

import java.util.LinkedList;
import java.util.List;

public class VerificationClass {
	public String verificationMethod(){
		System.out.println("verification method 1");
		return "Method1";
	};
	public String verificationMethod(Object o){
		System.out.println("verification method 2");
		return "Method2";
	};
	public int verificationMethod(Object o ,int num){
		System.out.println("verification method 3");
		return 0;
	};
	public List<?> verificationMethod( Object arg1, Object arg2){
		System.out.println("verification method 4");
		return  new LinkedList();
	}

}
