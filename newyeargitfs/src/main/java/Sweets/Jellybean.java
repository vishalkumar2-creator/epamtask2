package Sweets;

public class Jellybean extends Sweets{
	private int jellybeanid;
	public Jellybean(int weight,String name,int jellybeanid)
	{
	super(weight,name);
	this.jellybeanid=jellybeanid;
	}
	public String tostring() {
		return "id"+jellybeanid+":"+super.tostring();
	}
	

}
