import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.StdJDBC;
import com.student.StudentData;

public class StudentM {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome To Student Application");
		BufferedReader oReader=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 for add");
			System.out.println("press 2 for delete");
			System.out.println("press 3 for display");
			System.out.println("press 4 for exit");
			
			int c= Integer.parseInt(oReader.readLine());
			
			if (c==1) {
				System.out.println("enter u name");
				String name=oReader.readLine();
				
				System.out.println("enter u phone no");
				String phone=oReader.readLine();
				
				System.out.println("enter u city");
				String city=oReader.readLine();
				
				//creating object of main class
				StudentData oM=new StudentData(name, phone, city);
				boolean anns= StdJDBC.stdDB(oM);
				
				if (anns) {
					System.out.println("student addeded suceessfully...");
				}
				else {
					System.out.println("wrong try again...");
				}
				
				System.out.println(oM);
				
			}else if (c==2) {
				
			}else if (c==3) {
				
			}else if (c==4) {
				break;
			}else {
				System.out.println("ntg");
			}
		}
		System.out.println("thank u!!!");
	}

}
