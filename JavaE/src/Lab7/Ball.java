package Lab7;

public abstract class Ball {
	private String treadMark;
	public  Ball(String s) {
		treadMark = s;
	}
	public abstract void inflate(double b);
	
	
	public String getTreadMark() {
		return treadMark;
	}
	public void setTreadMark(String treadMark) {
		this.treadMark = treadMark;
	}
	
	
}
