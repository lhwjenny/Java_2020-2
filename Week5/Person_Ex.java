package javapractice1.wk5_1;

public class Person_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 nn2 = new Cat2();
		Cat2 nn3 = (Cat2)nn2;
		nn2.eat();
		nn2.sleep();
		nn2.walk();
		nn2.tellOff();
		nn3.meow();
		nn3.wash();
		System.out.println();
		
		Animal2 dd2 = new Dog2();
		Dog2 dd3 = (Dog2)dd2;
		dd2.eat();
		dd2.sleep();
		dd2.walk();
		dd2.tellOff();
		dd3.bark();
		dd3.bath();
	}
}
