public class Student {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private double gpa;
	
	public Student(int id, String firstName, String middleName, String lastName, double gpa) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gpa = gpa;
	}

	public Student(int id, String firstName, String lastName, double gpa) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = null;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newName) {
		firstName = newName;
	}
	
	public String getMiddleName() {
		return middleName; 
	}
	
	public void setMiddleName(String newName) {
		middleName = newName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newName) {
		lastName = newName;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double newGpa) {
		gpa = newGpa;
	}
	
	@Override
	public String toString() {
		String str = firstName + " ";
		if (middleName != null) {
			str += middleName + " "; 
		}
		str += lastName + ", ID# " + id + ", GPA: " + gpa;
		return str;
	}
	
}