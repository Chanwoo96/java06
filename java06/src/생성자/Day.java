package 생성자;

public class Day {
	//객체생성시, 힙영역에 복사도리 변수들
	//변수들에 해당 실제값이 들어감(실제변수, 인스턴스변수)
	String doing;
	int time;
	String location;
	static int count;
	static int total;
	
	//객체생성시, 3개 데이터 반드시 넣어서 객체 생성하세요
	public Day(String doing, int time, String location) {
		count++;
		total=total+time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	//일반메서드는 객체생성후 주소로 접근해서 호출해야한다.
	public static double getAvg() {
		return total/(double)count;
	}
	//객체 생성후 그 변수에 든 값을 주소가 아니라 스트링으로 보여주세요 
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
