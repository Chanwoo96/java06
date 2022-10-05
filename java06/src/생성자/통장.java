package 생성자;

public class 통장 {

	//멤버변수, class 아래에 선언 (class 전체에서 사용가능, 전역변수)
	//global 
	String name;
	String ssn;
	int money;
	
	public 통장(String name,String ssn,int money) {
		// 지역 변수
		this.name= name;
		this.ssn= ssn;
		this.money= money;
	}

}
