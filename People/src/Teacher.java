/**
 * /**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public class Teacher extends Person 
{
	private String Subject;
	private String Title; //Mr, Ms, Mx, Mrs
	
	public Teacher(String Subject, String Title)
	{
		super(Subject, Title); //super constructor
		this.Subject=Subject;
		this.Title=Title;
	}
	public abstract String toString();


	/**
	 * @param person the person to set
	 */
	public void setPerson(Extends person) {
		Person = person;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return Subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		Subject = subject;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	public abstract String toString()
	{
		return "
	}
}
