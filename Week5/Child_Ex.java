package javapractice1.wk5_1;

public class Child_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
		((Child)parent).method3();
		child.method3();

	}

}
