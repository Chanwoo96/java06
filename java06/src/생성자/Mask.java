package 생성자;

public class Mask {
	//멤버변수(역할), 전역변수(범위), 인스턴스변수(객체생성후실제)
	
	public String color;//"",참조형변수(저장타입)
	public int price;//0, 기본형변수
	public int count;
	//멤버변수는 전역변수, 전역변수는 자동초기화가 된다.
	
	
	//생성자가 하나도 없는 경우, 자동으로 입력값 없는 생성작를 만들어 준다.
	//묵시적으로 생성자가 만들어진다.
	//기본생성자(default constructor)
	//다른 생성자가 만들어져 있을 경우 기본생성자는 만들어지지 않는다.
	//파라메터없는 생성자를 만들고싶은 경우 직접 만들어주어야 한다.
	public Mask() {
		
	}
	
	//객체생성시, 멤버변수값을 바로 넣는 경우
	//넣을 데이터를 파라메터로 해서 생성자를 반드시 만들어준다.
	//다른 생성자
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
