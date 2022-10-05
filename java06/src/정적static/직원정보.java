package 정적static;

public class 직원정보 {
	String name;
	int age;
	char gen;
	static int member;
	static int total;
	static double getAvg() {
		return	total/(double)member;
	}
	public 직원정보(String name, int age, char gen) {
		member++;
		total+=age;
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "직원정보 [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
}
