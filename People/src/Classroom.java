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
		double total  = 0.0;
		for (person p: this.students)
		{
			if (p instanceof student)
			{
				if (p instanceof student)
				{
					total += (student)p.getGPA(); //casting to a type
					{
						return total/this.student.length;
					}
				}
			}
		}