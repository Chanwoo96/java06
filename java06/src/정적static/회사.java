package 정적static;

public class 회사 {

	public static void main(String[] args) {
		직원정보 work1 = new 직원정보("홍길동",25,'여');
		직원정보 work2 = new 직원정보("홍길동",24,'남');
		직원정보 work3 = new 직원정보("홍길동",26,'여');
		System.out.println("직원수는 "+직원정보.member+"입니다.");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("평균연령: "+직원정보.getAvg());
	}

}
