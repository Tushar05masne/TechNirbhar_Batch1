package sept_Java;

public class Nested_ifelse_study {

	// UN---TM1234
	// PW---TM@888
	// Captcha---xyz
	// Login-success---logged in success

	static String UN = "TM12341223";
	static String PW = "TM@888";
	static String Captcha = "xyz";
	static String login_status = "Success";

	public static void main(String[] args) {

		if (UN.equals("TM1234")) {
			System.out.println("UN is correct, please enter PW");

			if (PW.equals("TM@888")) {
				System.out.println("PW is correct, please enter captcha");

				if (Captcha.equals("xyz")) {
					System.out.println("Captcha is correct, please hit login button");

					if (login_status.equalsIgnoreCase("Success")) {
						System.out.println("Login successful!");
					} else {
						System.out.println("Login failed, please contact system administrator");
					}

				} else {
					System.out.println("Captcha is incorrect, please enter correct captcha");
				}

			} else {
				System.out.println("PW is incorrect, please enter correct PW");
			}

		} else {
			System.out.println("UN is incorrect, please enter correct UN");
		}
	}
}
