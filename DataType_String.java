package javapractice1.ch3;

public class DataType_String {

	public static void main(String[] args) {
		String strVar1 = "김준영";
		String strVar2 = "김준영";
		
		if(strVar1 == strVar2)  {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2의 문자열이 같음.");
		}
		
		String strVar3 = new String("김준영");
		String strVar4 = new String("김준영");
		
		if(strVar3 == strVar4)  {
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4의 문자열이 같음.");
		}

	}

}
