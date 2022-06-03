package mypack;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("india");
		s1.replace(1, 3, "java");
		System.out.println(s1);
		System.out.println(s1.replace(3,3,"ss"));

	}

}
