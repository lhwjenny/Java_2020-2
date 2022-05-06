package javapractice1.wk4;

public class MyCat2_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCat2 onsoon = new MyCat2("온순이", "한누리관 주변", "흰바탕에 검정무늬", 5);
		MyCat2 nabi = new MyCat2("나비", "옆집 창고", "황금빛", 1);
		
		System.out.println(onsoon.name +"는 " + onsoon.address + 
				"에 살고, " + onsoon.color + "이며 " + onsoon.age + "살 입니다.");
		System.out.println(nabi.name +"는 " + nabi.address + 
				"에 살고, " + nabi.color + "이며 " + nabi.age + "살 입니다.");


	}

}
