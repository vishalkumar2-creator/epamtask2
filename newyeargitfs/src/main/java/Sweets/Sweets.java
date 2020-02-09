package Sweets;

public abstract class Sweets {
	private int weight;
	private String name;
	public Sweets(int weight,String name) {
		this.weight=weight;
		this.name=name;
	}
	public int getweight() {
		return weight;
	}
	public String tostring() {
		return "name="+name+", weight="+weight;
		
	}

}
