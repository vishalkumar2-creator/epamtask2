package Sweets;

public class Cookie extends Sweets{
	private int cookieid;
	public Cookie(int weight,String name,int cookieid)
	{
	super(weight,name);
	this.cookieid=cookieid;
	}
	public String tostring() {
		return "id"+cookieid+":"+super.tostring();
	}
}
