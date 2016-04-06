package Inject;

public class Inject {
	
	public String name;
	public ClassToBeMocked ctbm ;
	
	public Inject(){
		this.ctbm = new ClassToBeMocked();
	}
	
	public String manageRequest(int num){
		return ctbm.returnString(num);
	}
}
