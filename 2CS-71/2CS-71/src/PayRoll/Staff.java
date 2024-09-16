package PayRoll;

abstract class Staff {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void computePay();
	
	public abstract void formatInfo(String info);
}
