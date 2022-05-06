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
		if(name == "길냥이") {
			System.out.println(this.name + "(이)가" + " 고양이 통조림을 먹습니다.");
		}
	}
	void meow() {
		this.name = name;
		if(name == "길냥이") {
			System.out.println(this.name + "(이)가" + " 야옹~ 웁니다.");		
	    }
	}
	void printAge() {
		this.age = age;
		System.out.println(this.name + "(은)는" + this.age +"살입니다.");
	}
}
