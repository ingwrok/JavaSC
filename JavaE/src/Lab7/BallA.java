package Lab7;

public class BallA extends Ball implements RollAble {
	public BallA(String s) {
		super(s);
	}

	public void inflate(double a) {
		System.out.println(super.getTreadMark() + " ball is inflate " + a + " cu.ft.");
	}

	public void roll() {
		System.out.println(super.getTreadMark()+" roll rather smoothly.");
	}

}
