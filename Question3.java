import java.util.ArrayList;
import java.util.Scanner;
public class Question3 {
	public static ArrayList<Student2> fillupStudent() {

		
        ArrayList<Student2> slist = new ArrayList<Student2>(); //arraylist for students
        /*
         FileInputStream fileByteStream = null;
        Scanner sc = null;

       fileByteStream = new FileInputStream("C:\\Users\\tinyt\\OneDrive\\Desktop\\AbbyF\\cis231-assignments-tiny-tabby\\studentinfo.txt");
        sc = new Scanner(fileByteStream); */
        //file input attempt 

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // number of students

            for( int j = 0; j < num; j ++){
            int sid = sc.nextInt();
            String sname = sc.next();
            int creds =sc.nextInt();
            String dob = sc.next();

            int coursenum = sc.nextInt(); //number of courses

            ArrayList<Course2> clist = new ArrayList<Course2>(); //arraylist for courses

            for(int i = 0; i < coursenum; i ++){
                String cid = sc.next();
                String cname = sc.next();
                int score = sc.nextInt();
                Course2 c = new Course2(cid, cname, score); //fill in course constructor
                clist.add(c);//add to the arraylist
            }
            Student2 s = new Student2(sname, dob, sid, creds, clist); //fill in student constructor
            slist.add(s); //add to the arraylist
            }

     sc.close();

        //in this method, read all user data below and then construct the list of student object
        //return the arraylist<Student>
        return slist;
	}

	public static void printStudent(ArrayList<Student2> slist) {
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
            ArrayList <Course2> clist = slist.get(i).getCourseList(); //just for easier access to the courseList

            for( int j = 0; j < clist.size(); j++) //go through course list for the student at i and print all the classes
            clist.get(j).printCourseinfo();

		}
	}

	public static void main(String[] args) {

        ArrayList< Student2> slist = new ArrayList<Student2>();
		slist = fillupStudent();
		printStudent(slist);
		// More code to test the methods in each Class Object
        System.out.println("Testing other methods...");
        slist.get(0).printPerson();
        System.out.println(slist.get(2));
        slist.get(0).getCourseList().get(1).printCourseinfo();
	}
    //input: 3 1001 John 9 03/01/2002 3 CIS01 C++ 90 CIS02 Python 80 CIS231 Java 90 1002 Kurt 12 05/01/2002 4 CIS01 C++ 100 CIS02 Python 100 CIS232 Java2 90 CNT02 Cisco 80 1003 Kim 6 01/01/1990 2 CIS01 C++ 100 CIS232 Java2 80
    /*output:
Name:   John    DOB:    03/01/2002
ID:     1001    Credits 9
Course ID:      CIS01   Name: C++       Score: 90       Grade:  A
Course ID:      CIS02   Name: Python    Score: 80       Grade:  B
Course ID:      CIS231  Name: Java      Score: 90       Grade:  A
Name:   Kurt    DOB:    05/01/2002
ID:     1002    Credits 12
Course ID:      CIS01   Name: C++       Score: 100      Grade:  A
Course ID:      CIS02   Name: Python    Score: 100      Grade:  A
Course ID:      CIS232  Name: Java2     Score: 90       Grade:  A
Course ID:      CNT02   Name: Cisco     Score: 80       Grade:  B
Name:   Kim     DOB:    01/01/1990
ID:     1003    Credits 6
Course ID:      CIS01   Name: C++       Score: 100      Grade:  A
Course ID:      CIS232  Name: Java2     Score: 80       Grade:  B
Testing other methods...
Name:   John    DOB:    03/01/2002
Name:   Kim     DOB:    01/01/1990
ID:     1003    Credits 6
Course ID:      CIS02   Name: Python    Score: 80       Grade:  B


    */
    

}
