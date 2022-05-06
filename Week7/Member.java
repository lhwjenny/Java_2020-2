package javapractice1.wk7;

public class Member { 
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			if(this.id.equals(((Member)obj).id)) {
				return true;
			}
		}
		return false;
	}

}
