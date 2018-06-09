package practice.selenium.xpathPractice;

public class ConvertUpperAndLowerCase {

	public static void main(String args[]) {
		String convertCase = "AbCdEf gHIjKLmm";
		int length = convertCase.length();
		
		StringBuilder outputString = new StringBuilder(convertCase.length());
		
		
		char a,b = 0;
		for(int i = 0; i<length;i++) {
			a = convertCase.charAt(i);
			if(a>=65 && a<=90) {
				b = (char)(a+32);
			}
			else if(a >=97 && a<=122) {
				b = (char)(a-32);
			}
			else if(a == 32) {
				b = a;
			}
			
			outputString = outputString.append(b);
		}
		System.out.println(outputString);
		
	}

}
