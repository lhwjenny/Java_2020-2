package javapractice1.wk5_1;

public class Cat extends Animal {
	String meow;
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		this.meow = meow;
	}
	void eat() {
		this.name = name;
		if(name == "�����") {
			System.out.println(this.name + "(��)��" + " ����� �������� �Խ��ϴ�.");
		}
	}
	void meow() {
		this.name = name;
		if(name == "�����") {
			System.out.println(this.name + "(��)��" + " �߿�~ ��ϴ�.");		
	    }
	}
	void printAge() {
		this.age = age;
		System.out.println(this.name + "(��)��" + this.age +"���Դϴ�.");
	}
}
