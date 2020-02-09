package Sweets;

	public class Chocolate extends Sweets {
		private int chocolateid;
	    public Chocolate(int weight,String name,int chocolateid) {
	    	super(weight,name);
	    	this.chocolateid=chocolateid;
	    }
	    public String tostring() {
	    	return "id"+chocolateid+":"+super.tostring();
	    }

	}

