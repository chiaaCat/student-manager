import java.util.Scanner;
import java.util.InputMismatchException;

public class School {

	private static int integerInput(Scanner s, String question) {
		int input = 0;
		boolean wrongInput = true;
		while (wrongInput) {
			System.out.print(question);
			try {
				input = s.nextInt();
				wrongInput = false;	
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please enter an integer number.");
				s.nextLine();
			}
		}
		return input;
	}
	
	private static double doubleInput(Scanner s, String question) {
		double input = 0.0;
		boolean wrongInput = true;
		while (wrongInput) {
			System.out.print(question);
			try {
				input = s.nextDouble();
				wrongInput = false;	
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please enter a number.");
				s.nextLine();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		StudentManager school = new StudentManager();
		System.out.println("**Student Manager**\n");
		 
		Scanner scanner = new Scanner(System.in);
		int studentsToAdd = integerInput(scanner, "How many students would you like to add? ");
		
		Student[] s = new Student[studentsToAdd];
		for (int i = 0; i < studentsToAdd; i++) {
			System.out.println("\nFill out the following information for Student #" + (i + 1));
			int id = integerInput(scanner, "What is their ID#? ");
			System.out.print("What is their first name? ");
			String f = scanner.next();
			System.out.print("Does this student have a middle name? (y/n) ");
			String q = scanner.next();
			String m = null;
			if (q.equals("y")) {
				System.out.print("What is their middle name? ");
				m = scanner.next();
			}
			System.out.print("What is their last name? ");
			String l = scanner.next();
			double gpa = doubleInput(scanner, "What is their current gpa? ");
			s[i] = new Student(id, f, m, l, gpa);			
		}
		
		System.out.println();
		for (Student student : s) {
			school.addStudent(student);
		}
		
		System.out.println(school.getNumStudents() + " students have been added.");
		System.out.println("Average student GPA - " + school.getAvgGpa());
		
		System.out.println();
		int id1 = integerInput(scanner, "Input an ID# to check if a student is using it: ");
		school.studentExists(id1);
		
		System.out.print("\nWould you like to remove a student? (y/n) ");
		String q1 = scanner.next();
		if (q1.equals("y")) {
			int id2 = integerInput(scanner, "What is their ID#? ");
			school.removeStudent(id2);
		}
		
		System.out.print("\nWould you like to view a student's full information? (y/n) ");
		String q2 = scanner.next();
		if (q2.equals("y")) {
			int id3 = integerInput(scanner, "What is their ID#? ");
			System.out.println(school.getStudentInfo(id3));
		}
			
	}

}
