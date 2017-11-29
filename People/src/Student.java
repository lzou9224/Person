/**
 * /**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public class Student extends Person
{
	private double GPA;
	private String Major;
	private int OSIS;
	
	public Student(int height, String firstName, String familyName, double weight, double GPA, String Major, int OSIS)
	{
		super(height, firstName,familyName, weight); //super constructor
		this.GPA=GPA;
		this.Major=Major;
		this.OSIS=OSIS;
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


	public int getOSIS() {
		return OSIS;
	}

	public void setOSIS(int oSIS) {
		OSIS = oSIS;
	}
	
	public String toString()
	{
		return this.getFamilyName() + ", " + this.getFirstName();
	}
}

