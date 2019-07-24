package classProject;

public class HomeWork {
	

	
	public static void main(String[] args) {
		
		int state1 = 753749;
		int state2 = 9875;
		int state3 = 7958;
		int state4 = 1132;
		
		int countrypopulation = addNumbers(state1, state2, state3, state4);
		
		System.out.println(countrypopulation);
		
		boolean answer = equallnumbers(state1, state2);
		System.out.println(answer);
		
		int answer2 = multnumbers(state4, state3);
		System.out.println(answer2);
	}

	public static int addNumbers(int a, int b, int c, int d) {
		
		int countrypopulation = a+b+c+d;
		return countrypopulation;
	}
	public static boolean equallnumbers(int x, int y) {
		if (x==y) return true;
		
		else return false;
	}
	
	public static int multnumbers(int s, int t){
		int answer2 = s * t;
		return answer2;
		
	}
	{
	}
}
	

