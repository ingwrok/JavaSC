package Lab7;

public class DebitCard extends Card{
	public DebitCard(String password) {
		super(password);
	}
	//	private String newPassword;
//	public DebitCard(String password) {
//		String[] value = password.split("-");
//        String[] temp = new String[value.length];
//        // สร้าง newPassword หลังจากลูปเสร็จสิ้น
//        for (int i = 0; i < value.length; i++) {
//            if (i != 2) {
//                temp[i] = "xxx";  // เปลี่ยนค่าเป็น "xxx" สำหรับหมายเลขส่วนที่ไม่ต้องการแสดง
//            } else {
//                temp[i] = value[i];  // แสดงหมายเลขส่วนที่ต้องการ
//            }
//        }
//        newPassword = String.join("-", temp);
//	}
//	public String getNewPassword() {
//		return newPassword;
//	}
//	public void setNewPassword(String newPassword) {
//		this.newPassword = newPassword;
//	}
	public String type() {
		return "visa";
	}
	public double discount() {
	 return 2.5;
	}
	public boolean withdraw(double amount) {
		return true;
	}
	public String getCard() {
		return "CARD TYPE:"+type()+"\nCARD NUMBER:"+super.getNewPassword();
	}
	
}
