import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		StudentManager school = new StudentManager();
		System.out.println("**Student Manager**\n");
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many students would you like to add? ");
		int studentsToAdd = scanner.nextInt();
		
		Student[] s = new Student[studentsToAdd];
		for (int i = 0; i < studentsToAdd; i++) {
			System.out.println("\nFill out the following information for Student #" + (i + 1));
			System.out.print("What is their ID#? ");
			int id = scanner.nextInt();
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
			System.out.print("What is their current gpa? ");
			double gpa = scanner.nextDouble();
			s[i] = new Student(id, f, m, l, gpa);			
		}
		
		System.out.println();
		for (Student student : s) {
			school.addStudent(student);
		}
		
		System.out.println(school.getNumStudents() + " students have been added.");
		System.out.println("Average student GPA - " + school.getAvgGpa());
		
		System.out.print("\nInput an ID# to check if a student is using it: ");
		int id1 = scanner.nextInt();
		school.studentExists(id1);
		
		System.out.print("\nWould you like to remove a student? (y/n) ");
		String q1 = scanner.next();
		if (q1.equals("y")) {
			System.out.print("What is their ID#? ");
			int id2 = scanner.nextInt();
			school.removeStudent(id2);
		}
		
		System.out.print("\nWould you like to view a student's full information? (y/n) ");
		String q2 = scanner.next();
		if (q2.equals("y")) {
			System.out.print("What is their ID#? ");
			int id3 = scanner.nextInt();
			System.out.println(school.getStudentInfo(id3));
		}
			
	}

}