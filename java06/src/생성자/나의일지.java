package 생성자;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("run",1,"센텀");
		System.out.println(day1);
		System.out.println(day1.count);
		System.out.println(day1.total);
		System.out.println(day1.getAvg());
		Day day2 = new Day("driving",9,"기장");
		System.out.println(day2);
		System.out.println(day2.count);
		System.out.println(day2.total);
		System.out.println(day2.getAvg());
		Day day3 = new Day("study",8,"집");
		System.out.println(day3);
		System.out.println(day3.count);
		System.out.println(day3.total);
		System.out.println(day3.getAvg());
		Day.getAvg();
	}

}
