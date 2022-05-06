package javapractice1.wk5_1;

public class Dog extends Animal{
	String bark;
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.bark = bark;
	}
	void eat() {
		this.name = name;
		if(name=="´ó´óÀÌ")
			System.out.println(this.name + "(ÀÌ)°¡" + " °­¾ÆÁö »ç·á¸¦ ¸Ô½À´Ï´Ù.");
	}
	void bark() {
		this.bark = bark;
		if(name == "´ó´óÀÌ") {
			System.out.println(this.name + "(ÀÌ)°¡" + " ¸Û¸Û Â¢½À´Ï´Ù.");
		}
	} void printAge() {
		this.age = age;
		if(name == "´ó´óÀÌ") {
			System.out.println(this.name + "(Àº)´Â" + this.age + "»ìÀÔ´Ï´Ù.");
		}
	}

}
