package mypack;

public class StringCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=("INDIA");
		String s2=equalsIgnoreCase(s1);
		int c=0;
		int c1=0;
		
		char a[]=s1.toCharArray();
		int l=a.length;
		for (int i=0;i<l;i++) {
			if(a[i]=='a'||a[i]=='i'||a[i]=='e'||a[i]=='0'||a[i]=='u') {
				c++;	
			}
			else {
				c1++;
			}
		}
		System.out.println("no of vowel:- "+c);
		System.out.println("no of constannt:- "+c1);
		

	}

	private static String equalsIgnoreCase(String s1) {
		// TODO Auto-generated method stub
		return null;
	}

}
