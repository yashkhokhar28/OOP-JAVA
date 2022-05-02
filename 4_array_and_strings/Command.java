public class Command {
	public static void main(String[] args) {

		for (int i = 0; i <= args[0].length(); i++) {

			if (args[0].charAt(0) >= 'A' && args[0].charAt(0) <= 'Z') {
				System.out.println(args[0]);
				break;
			} else {
				System.out.println("terminated");
				break;
			}
		}
	}
}