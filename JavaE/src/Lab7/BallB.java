package Lab7;

public class BallB extends BallA {

	public BallB(String s) {
		super(s);
	}

	public void inflate(double a) {
		System.out.println(super.getTreadMark() + " ball is inflate " + a + " cu.ft.");
	}

	public void roll() {
		System.out.println(super.getTreadMark()+" roll smoothly.");
	}

}
