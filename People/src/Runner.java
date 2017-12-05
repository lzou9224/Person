/**
 * /*
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public class Runner {
	public static void main(String[]args)
	{
		private static String[] firstNames() ={"Sara", "Lingli", "Tabassum", "Sam", "Alex", "John",
				"Nicole", "Vivian", "Ming", "Kelly", "Jenny", "Daniel", "Tanvir", "Amy", "David",
				"Dustin", "Sam", "Mimi", "Fanny", "Bob", "Sherry", "Michelle", "Toby", "Felix", 
				"Tammy", "William", "Thomas", "Allen", "Kenny", "Kevin"};
		
		private static String[] familyNames()={"Zou", "Taylor", "Brooks", "Williams", "Smith", "Johnson", "Jones",
				"Lin", "Thompson", "Brown", "Davis", "Lee", "Hill", "Scott", "Lopez", "Mitchell", "Perez",
				"Roberts", "Turner", "Edwards", "Morris", "Rogers", "Reed", "Cooper", "Cox", "Torres", "James",
				"Bhuiyan", "Wood", "Chen"};
		
		private static String[] Subject()={"Math", "Science", "Technology", "Computer Sciences", "Calculus", "Algebra",
				"English", "Art", "Drama", "Language", "Physical Education", "Band", "Anatomy", "Genetics"};
		
		private static String[] Major()={"Biological Science", "Math", "College Prep", "Gateway to Medicine", 
				"Electrical Engineering", "Civil Engineering", "Chemical Engineering", "Industrial Design", 
				"Physics","Architecture", "Aerospace Engineering"};
		
		private static String[] Guidance()={"Blain", "Taub", "Ambroise", "Barone", "Bosco", "Chan", "Blankson",
				"Cuesta", "Holland", "Corsby", "Jordan", "Lam", "Lulov", "Paulson"};
		
		private static Teacher teacher;
		private static Student[] students;
		
		Teacher teacher1 = new Teacher (10, "Tom", "Moore", 91.3, "science", "Mr.");
		
	    Student student1 = new Student (3, "Lisa", "Smith", 97.2, 208644062, 9);
	    
	    Classroom classroom1 = new Classroom (students, teacher, subject );
		
	    public static void main (String [] args) 
	    {
			 firstNames=new String [4];
			 
			 familyNames=new String [4];
			 
			 firstNames [0] ="Eliza";
			 
			 familyNames [0]="Marie";
			 
			 firstNames [1]="Annie";
			 
			 familyNames [1]="Mac";
			 
			 firstNames [2]="Loura";
			 
			 familyNames [2]="Johnson";
			 
			 firstNames [3]="Brady";
			 
			 familyNames [3]="Williams";
	    }

	}
	public Student randomStudent()
    {
    	
    }	
}
