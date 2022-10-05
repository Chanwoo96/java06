package 생성자;

public class MaskUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mask m = new Mask();
		m.color="흰색";
		m.count=1;
		m.price=1000;
	
		Mask m2 = new Mask("흰색",1000,1);
		System.out.println(m+"\n"+m2);
	}

}
