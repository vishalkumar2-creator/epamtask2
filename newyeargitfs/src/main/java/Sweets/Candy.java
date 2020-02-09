package Sweets;

public class Candy extends Sweets {
    private int candyid;
    public Candy(int weight,String name,int candyid) {
    	super(weight,name);
    	this.candyid=candyid;
    }
    public String tostring() {
    	return "id"+candyid+": "+super.tostring();
    }
}
