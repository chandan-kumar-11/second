package mypack;

public class StringConcat {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=("chandan" + ("kumar"));
		System.out.println(s1);
		String s2=50+10+"chandan"+10+10;
		System.out.println(s2);
		
		String s3=new String ("kundan ");
		String s4=new String ("kumar");
		System.out.println(s3.concat(s4));
	    System.out.println(String.join(("::"),s3,s4));
		

	}
}


