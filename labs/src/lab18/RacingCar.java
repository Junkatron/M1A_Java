package lab18;

public class RacingCar extends Car{
	private String driver = "";
	private int turboFactor = 0;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}

	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		int baseSpeed = super.getSpeed();
		int turboSpeed = baseSpeed * this.turboFactor;
		this.setSpeed(turboSpeed);
	}
	
}
