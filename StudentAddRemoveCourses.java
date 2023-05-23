import java.util.*;

class Student {
    private String name;
    private int grade;
    private List<String> courses;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(String course) {
        courses.add(course);
    }
    
    public void removeCourse(String course) {
        courses.remove(course);
    }
    
    public void displayInfo() {
	  System.out.print("\nStudent details:\n");
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

public class StudentAddRemoveCourses {
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter following student details: ");
	  System.out.print("Enter student name: ");
	  String name = sc.nextLine();
	  System.out.print("Enter grade: ");
	  int grade = sc.nextInt();

        Student student = new Student(name, grade);

	  System.out.print("Enter how many subjects you want to add: ");
	  int sub = sc.nextInt();
	  sc.nextLine();
	
	  for(int i = 0; i < sub; i++)
	  {
	  	System.out.print("Enter subject-" +(i+1)+ " : ");
		String course = sc.nextLine();
		student.addCourse(course);
  	  }
        
        student.displayInfo();
        
        System.out.println();
	  System.out.print("\nEnter the subject you want to remove: ");
	  String removeSub = sc.nextLine();
        
        student.removeCourse(removeSub);
        
        student.displayInfo();
    }
}
