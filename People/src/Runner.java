/**
 * /*
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.2 Person
 */

public class Runner {
	{  
		public static void main(String[] args)
		{
			   Classroom NewClass = new Classroom(student, teacher);
			   NewClass.printClass();
			   System.out.println(NewClass.classAverage());
		}
		public static Student randomStudent()	
		{
			Random Student = new Random(); 
			String firstName = firstNames[Student.nextInt(firstNames.length)];
			String familyName = familyNames[Student.nextInt(familyNames.length)];
			double GPA = Student.nextDouble()*4.0;
			String Major = Majors[Student.nextInt(Majors.length)];
			String Guidance = Guidance[Student. nextInt(Guidance.length)];
			
			return new Student(firstName, familyName, major, guidance, GPA);
			
			}
		 //List of variables of a student
		 String lastName[]= {"Sara", "Lingli", "Tabassum", "Sam", "Alex", "John",
				"Nicole", "Vivian", "Ming", "Kelly", "Jenny", "Daniel", "Tanvir", "Amy", "David",
				"Dustin", "Sam", "Mimi", "Fanny", "Bob", "Sherry", "Michelle", "Toby", "Felix", 
				"Tammy", "William", "Thomas", "Allen", "Kenny", "Kevin"};
		
		 String firstName[]= {"Zou", "Taylor", "Brooks", "Williams", "Smith", "Johnson", "Jones",
				"Lin", "Thompson", "Brown", "Davis", "Lee", "Hill", "Scott", "Lopez", "Mitchell", "Perez",
				"Roberts", "Turner", "Edwards", "Morris", "Rogers", "Reed", "Cooper", "Cox", "Torres", "James",
				"Bhuiyan", "Wood", "Chen"};
		
		 String Subject[] = {"Math", "Science", "Technology", "Computer Sciences", "Calculus", "Algebra",
				"English", "Art", "Drama", "Language", "Physical Education", "Band", "Anatomy", "Genetics"};
		
		 String Major[] = {"Biological Science", "Math", "College Prep", "Gateway to Medicine", 
				"Electrical Engineering", "Civil Engineering", "Chemical Engineering", "Industrial Design", 
				"Physics","Architecture", "Aerospace Engineering"};
		
		 String Guidance[] = {"Blain", "Taub", "Ambroise", "Barone", "Bosco", "Chan", "Blankson",
				"Cuesta", "Holland", "Corsby", "Jordan", "Lam", "Lulov", "Paulson"};
		
		public Teacher, randomTeacher(Teacher, teacher)
		{
		     String subject[] = {"Anatomy","Genetics","Biology","Interpretive Dance","AP Studio Art","Linguistics","Underwater Basket Weaving","History of String","Manderin","AP Human Geo"};
		     String title[] = {"Mr.","Mrs.","Dr.","Prof."};
		     String lastName[] = {"Morri","Davis","Lina","Amato","Shuman","Rogers","Weiss"};
		     String firstName[] = {"Lia","Nancy","Jessica","Amora","Jellisa","Damon","Stefan"};
		    Teacher teacherx= new Teacher(3,firstName[new Random().nextInt(firstName.length)],
		    		        lastName[new Random().nextInt(lastName.length)],91.0,subject[new Random().nextInt(subject.length)],title[new Random().nextInt(title.length)]);
		     return teacherx ;
		    }
		public static void main(String[] args) 
		{
			Person teacher = new Teacher(91, "Lisa", "Damato", "Anatomy", "Ms", 100);
			Person[] studentArr;
			studentArr = new Person[32];
			for (int i=0 ; i< studentArr.length;i++)	
			{
				studentArr[i]= randomStudent();	
			}
		
        Classroom NewClass = new Classroom(studentArr, teacher);
        
		System.out.println(NewClass.printClass());
		System.out.println(NewClass.classAverage());

		}
}
