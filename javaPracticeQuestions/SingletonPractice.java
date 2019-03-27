package javaPracticeQuestions;
// To design singleton class:
//make constructor private
//write a public static method that has return type of object of this singleton class

public class SingletonPractice {

	private static SingletonPractice singleton_instance = null;
	public String str;
	
	private SingletonPractice(){
		str = "This is a singleton class.";
	}
	
	public static SingletonPractice getInstance(){
		if (singleton_instance == null)
				singleton_instance = new SingletonPractice();
		return singleton_instance;
	}
		
	
	public static void main(String[] args) {
	SingletonPractice x = SingletonPractice.getInstance();	
	SingletonPractice y = SingletonPractice.getInstance();
	SingletonPractice z = SingletonPractice.getInstance();
	
	x.str = x.str.toUpperCase();
	System .out.println(x.str);
	System .out.println(y.str);
	System .out.println(y.str);
	
	System .out.println();
	
	z.str = z.str.toLowerCase();
	
	System .out.println(x.str);
	System .out.println(y.str);
	System .out.println(y.str);

	}

}
