package homework04;

public class Bmi {
	private String name;
	private double height;
	private double weight;
	
	Bmi(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight= weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double result() {
		return weight / (height * height);
	}
	

}
