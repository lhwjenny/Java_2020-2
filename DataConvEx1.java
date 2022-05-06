package javapractice1.ch3;

public class DataConvEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '°¡';
		intValue = charValue;
		System.out.println("°¡'s unicode: " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}
}
