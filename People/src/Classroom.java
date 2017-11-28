/**
 * /**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public class Classroom {
	private Student[]student;
	private Teacher teacher;

	public Classroom (Student [] student, Teacher teacher, String subject)
	{
		this.student = student;
		this.teacher = teacher;
	}

	public String getSubject() {
		return this.teacher.getSubject();
	}

	public double classAverage()
	{
		double sum = 0;
		for (int x = 0; x <= student.length; x++) {
			sum = sum + student[x].getGpa();
		}
		return sum / student.length;
	}
}