/**
 * /**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public abstract class Teacher extends Person 
{
	private String Subject;
	private String Title; //Mr, Ms, Mx, Mrs
	
	public Teacher(int height, String firstName, String familyName, double weight, String Subject, String Title)
	{
		super(height, firstName, familyName, weight); //super constructor
		this.Subject=Subject;
		this.Title=Title;
	}

	public String getSubject() {
		return Subject;
	}

	public String getTitle() {
		return Title;
	}

	public String toString;
	{
		return this.getTitle() + "." + this.getFamilyName();
	
	}
}
