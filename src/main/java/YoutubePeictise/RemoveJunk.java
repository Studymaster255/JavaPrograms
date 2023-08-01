package YoutubePeictise;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="!@#$%^&*( latin String 1234567890";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
