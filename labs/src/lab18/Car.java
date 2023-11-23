package lab18;

public class Car {
	private String model = "";
	private int speed = 0;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public void getToSixty() {
		this.speed = 60;
	}
	
	public void accelerate(int seconds) {
		int speed = this.getSpeed() + (5 * seconds); 
		this.setSpeed(speed);
	}
}
