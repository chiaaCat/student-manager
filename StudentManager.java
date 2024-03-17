import java.util.HashMap;
import java.util.Map;

public class StudentManager {
	HashMap<Integer, Student> students;
	
	public StudentManager() {
		students = new HashMap<>();
	}
	
	public void addStudent(Student newStudent) {
		int idNum = newStudent.getId();
		students.put(idNum, newStudent);
		System.out.println("Student with ID# " + idNum + " has been added.");
	}
	
	public void removeStudent(int idNum) {
		students.remove(idNum);
		System.out.println("Student with ID# " + idNum + " has been removed.");
	}
	
	public String getStudentInfo(int idNum) {
		Student s = students.get(idNum);
		return s.toString();
	}
	
	public void studentExists(int idNum) {
		boolean exists = students.containsKey(idNum);
		if (exists) {
			System.out.println("ID# currently in use.");
		} else {
			System.out.println("ID# not currently in use.");
		}
	}
	
	public int getNumStudents() {
		return students.size();
	}
	
	public double getAvgGpa() {
		double avg = 0.0;
		for (Map.Entry<Integer, Student> entry : students.entrySet()) {
			int idNum = entry.getKey();
			Student s = students.get(idNum);
			avg += s.getGpa();	
		}
		avg /= getNumStudents();
		return avg;
	}

}