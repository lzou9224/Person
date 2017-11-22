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
	
	public Student(double GPA, String Major, int OSIS)
	{
		super(GPA, Major, OSIS); //super constructor
		this.GPA=GPA;
		this.Major=Major;
		this.OSIS=OSIS;
	}

	/**
	 * @return the person
	 */
	public extends getPerson() {
		return Person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(extends person) {
		Person = person;
	}   

	/**
	 * @return the gPA
	 */
	public double getGPA() {
		return GPA;
	}

	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(double gPA) {
		GPA = gPA;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return Major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		Major = major;
	}

	/**
	 * @return the oSIS
	 */
	public int getOSIS() {
		return OSIS;
	}

	/**
	 * @param oSIS the oSIS to set
	 */
	public void setOSIS(int oSIS) {
		OSIS = oSIS;
	}
}

