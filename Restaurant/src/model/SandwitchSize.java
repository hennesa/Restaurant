package model;

public enum SandwitchSize {
	LARGE ("Large"),
	MEDIUM ("Medium"),
	SMALL ("Small"),
	WRAP ("Wrap");
	
	private final String name;
	
	private SandwitchSize (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
