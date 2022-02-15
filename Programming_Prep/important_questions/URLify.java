package important_questions;

public class URLify {
	
	static void replaceSpaces(char[] ar, int trueLength) {
		int spaceCount = 0;
		int index = 0;
		for(int i=0; i<trueLength; i++) {
			if(ar[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		for(int i=trueLength-1; i>=0; i--) {
			if(ar[i] == ' ') {
				ar[index - 1] = '0';
				ar[index - 2] = '2';
				ar[index - 3] = '%';
				index = index - 3;
			} else {
				ar[index - 1] = ar[i];
				index--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		char[] str = new char[] {'M','r',' ','J','h','o','n',' ','S','m','i','t','h',' ',' ',' ',' ',' '};
		replaceSpaces(str, 13);
		System.out.println(str);

	}

}
