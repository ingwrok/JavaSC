package Lab7; 

public class TestBall {

	static void TestBall(Ball b,double a) {
		System.out.println(b.getTreadMark()+" is a tradeMark of "+b.getClass().getSimpleName());
		((RollAble) b).roll(); //ball not link rollable
		b.inflate(a);
	}
	public static void main(String[] args) {
		Ball b1 = new BallA("Zentia");
		Ball b2 = new BallB("Zapphire");
		Ball b3 = new BallC("Zenith");
		
		TestBall(b1,1.0);
		TestBall(b2,1.1);
		TestBall(b3,1.2);
		
	}

}
