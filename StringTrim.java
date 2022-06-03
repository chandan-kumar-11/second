package mypack;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="    Tahmahal    ";
		System.out.println(name);
	
		System.out.println(name.trim());
		
		if (name.trim().length()==0)
		System.out.println("name is empty");
		else
			System.out.println("name is valid");
		
		

	}

}
