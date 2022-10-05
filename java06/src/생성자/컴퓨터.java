package 생성자;

public class 컴퓨터 {
	int price;
	String make;
	int size;

	public 컴퓨터(int price ,String make,int size) {
		this.price=price;
		this.make=make;
		this.size=size;
	}
	public String toString() {
		return "컴퓨터 [price="+price+", make="+make+", size="+size;
	}
	
}
