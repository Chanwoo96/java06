package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 c1 = new 컴퓨터(10000, "삼성", 24);
		컴퓨터 c2 = new 컴퓨터(12000, "애플", 26);
		System.out.println(c1);
		System.out.println(c2);


	}
}
