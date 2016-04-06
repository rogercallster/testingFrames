package captor;

public class CaptorClass{
	private final ParentClass pc;
	
	public CaptorClass(ParentClass pc){
		this.pc = pc;
	}
	
	public int save(String name){
		return pc.save(name);
	}
	


}
