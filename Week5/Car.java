package javapractice1.wk5_1;

public class Car {
	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	public Car() {}
	//Getter �޼ҵ�1 (speed)
	public int getSpeed() {
		return speed;
	}
	//Setter �޼ҵ�1(Speed)
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	//Getter �޼ҵ�2(stop)
	public boolean isStop() {
		return stop;
	}
	//Setter �޼ҵ�2(stop)
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
