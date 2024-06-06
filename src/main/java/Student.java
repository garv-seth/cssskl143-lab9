import java.io.Serializable;

public class Student implements Comparable<Student>, Cloneable, Serializable {
	private String name;
	private double GPA;

	public Student(String name, double GPA) {
		this.name = name;
		this.GPA = GPA;
	}

	@Override
	public int compareTo(Student other) {
		return Double.compare(this.GPA, other.GPA);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Student(this.name, this.GPA);
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', GPA=" + GPA + "}";
	}
}
