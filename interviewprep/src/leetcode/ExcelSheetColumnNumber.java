package leetcode;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
			System.out.println("Result	:	["+i+"]	:"+result+"	:	s.charAt(i) - 'A'"+(s.charAt(i) - 'A'));
		}
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(new ExcelSheetColumnNumber().titleToNumber("AZA"));
		System.out.println();
		

	}

}
