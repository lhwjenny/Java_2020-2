package javapractice1.wk7;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");
		sb.append("is fun to learn!");
		System.out.println(sb.toString());
		
		sb.insert(7, " so");
		System.out.println(sb.toString());
		
		sb.setCharAt(0, 'J');
		System.out.println(sb.toString());
		
		sb.replace(8, 10, "SO");
		System.out.println(sb.toString());
		
		sb.delete(8, 11);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("ÃÑ ¹®ÀÚ¼ö : " + length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
