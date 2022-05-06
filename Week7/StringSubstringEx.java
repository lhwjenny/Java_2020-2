package javapractice1.wk7;

public class StringSubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "100925-4003219";
		
		String dob = ssn.substring(0, 6);
		System.out.println("Date of birth: " + dob);
		
		String idn = ssn.substring(7);
		System.out.println("Identification number: " + idn);

	}

}
