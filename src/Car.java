public class Car {

	private int speed;

	public Car () {
		speed = 30;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int numSpeed) {
		speed = numSpeed;
	}

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Speed of Car: " + c.getSpeed());

		c.setSpeed(100);
		System.out.println("Speed of Car after Speed Limit: " + c.getSpeed());
	}
}
