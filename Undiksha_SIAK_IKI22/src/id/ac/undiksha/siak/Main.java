package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setName("Kaori Miyazono");
//		System.out.println(std1.getName());
		
		std1.setAddress("Inazuma");
//		System.out.println(std1.getAddress());
		
		std1.printAllInfo();
		
//		Student std2 = new Student(
//			"1234",
//			"Raiden Ei",
//			"Inazuma",
//			false,
//			"Computer Science",
//			"Informatics",
//			"FTK"
//		);
//		std2.printAllInfo();
//		
//		Lecturer lec1 = new Lecturer(
//			"1234",
//			"Raiden Ei",
//			"Inazuma",
//			false,
//			"Computer Science",
//			"Informatics",
//			"FTK"	
//		);
//		lec1.printAllInfo();
//		
//		Staff stf1 = new Staff (
//			"00000",
//			"Shogun",
//			"Blue Lock",
//			false,
//			"Archon"
//		);
//		stf1.printAllInfo();
//		
		Student std2 = new Student(
				"Sung Jin-woo", 
				"South Korea", 
				true, 
				"1234567890", 
				"Ilmu Komputer", 
				"TI", 
				"FTK");
		
		Staff stf1 = new Staff(
				"Kim Dok-ja", 
				"South Korea", 
				true, 
				"9787296", 
				"Division 1");
		
		Lecturer lect1 = new Lecturer(
				"Arlecchino", 
				"Fatui", 
				false, 
				"55555", 
				"ILKOM", 
				"TI", 
				"FTK");
		std2.printAllInfo();
		stf1.printAllInfo();
		lect1.printAllInfo();
//		Person personA = new Person;
//		person1.setName("Ratih");
//		person1.setAddress("Seririt");
//		Student std1 = new Student();
//		std1.setName("Raiden");
//		std1.setAddress("Inazuma");
//		std1.printAllInfo();
//		System.out.println(std1.getAddress());
//		System.out.println(std1.getName());
		//overidding
	}

}
