package javaPracticeQuestions;

//How will you remove junk/unwanted/special characters from a particular string?

public class removeJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "#$Java special @@@%^&&&*!! and Junk!!!!";
		System.out.println(s);
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
				
	}

}
