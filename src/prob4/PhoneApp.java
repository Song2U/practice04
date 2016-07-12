package prob4;

public class PhoneApp extends MusicPhone {

	public static void main(String[] args) {

		Phone phone = new SmartPhone();

		phone.execute("음악");
		phone.execute("통화");
		phone.execute("앱");
	}
}