package javapractice1.wk5_1;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	public Car() {}
	//Getter 메소드1 (speed)
	public int getSpeed() {
		return speed;
	}
	//Setter 메소드1(Speed)
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	//Getter 메소드2(stop)
	public boolean isStop() {
		return stop;
	}
	//Setter 메소드2(stop)
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
