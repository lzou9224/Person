/**
 * /**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public class Student extends Person
{
	private double GPA;
	private String Major;
	private String Guidance;
	
	public Student(int height, String firstName, String familyName, double weight, double GPA, String Major, String Guidance)
	{
		super(height, firstName,familyName, weight); //super constructor
		this.GPA=GPA;
		this.Major=Major;
		this.Guidance=Guidance;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}


	public String getGuidance() {
		return Guidance;
	}

	public void setGuidance(String guidance) {
		Guidance = guidance;
	}
	
	public String toString()
	{
		return this.getFamilyName() + ", " + this.getFirstName();
	}
}

