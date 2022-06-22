import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class dem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		//arraylist
		ArrayList b= new ArrayList();
		ArrayList<String> s= new ArrayList<String>();
		s.add("ABCD");
		s.add("DD");
		
		System.out.println(s.get(0));
		
		String d="Welcome Good Morning ";
		String[] splittedString = d.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);

		
		
	}

}
