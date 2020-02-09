package Sweets;

public class Marshmallow extends Sweets{

	private int marshmallowid;
	public Marshmallow(int weight,String name,int marshmallowid)
	{
	super(weight,name);
	this.marshmallowid=marshmallowid;
	}
	public String tostring() {
		return "id"+marshmallowid+":"+super.tostring();
	}
	
}
