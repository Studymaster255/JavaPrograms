package YoutubePeictise;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="java   Programming    and   Selenium";
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
