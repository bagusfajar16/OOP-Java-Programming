package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setName("Kaori Miyazono");
//		System.out.println(std1.getName());
		
		std1.setAddress("Inazuma");
//		System.out.println(std1.getAddress());
		
		std1.printAllInfo();
		
		Student std2 = new Student(
			"1234",
			"Raiden Ei",
			"Inazuma",
			false,
			"Computer Science",
			"Informatics",
			"FTK"
		);
		std2.printAllInfo();
		
		Lecturer lec1 = new Lecturer(
			"1234",
			"Raiden Ei",
			"Inazuma",
			false,
			"Computer Science",
			"Informatics",
			"FTK"	
		);
		lec1.printAllInfo();
		
		Staff stf1 = new Staff (
			"00000",
			"Shogun",
			"Blue Lock",
			false,
			"Archon"
		);
		stf1.printAllInfo();
		
	}

}
