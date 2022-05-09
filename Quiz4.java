import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Quiz4 {

//test data + output-------------:

//3 1001 John 3 CIS01 C++ 3 A+ CIS02  Python 3 A0 CIS231 Java 3 A+ 1002 Kurt 4 CIS01 C++ 3 A0 CIS02 Python 3 A CIS232 Java2 3 A+ CNT02 Cisco 3 A0 1003 Kim 2 CIS01 C++ 3 A0 CIS232 Java2 3 A+

//output;

/*Student: 1001 John
Course: CIS01 C++ 3 A+

Course: CIS02 Python 3 A0

Course: CIS231 Java 3 A+

Total credits 9

Student: 1002 Kurt
Course: CIS01 C++ 3 A0

Course: CIS02 Python 3 A

Course: CIS232 Java2 3 A+

Course: CNT02 Cisco 3 A0

Total credits 12

Student: 1003 Kim
Course: CIS01 C++ 3 A0

Course: CIS232 Java2 3 A+

Total credits 6

 The student who has the greatest credits:
Student: 1002 Kurt
Course: CIS01 C++ 3 A0

Course: CIS02 Python 3 A

Course: CIS232 Java2 3 A+

Course: CNT02 Cisco 3 A0

Total credits 12
*/




//errors and troubleshooting-------------
    //i was doing good with the coding, though i dont know how to test my code at all.  For two hours I hava been trying to get the file to work but I keep getting errors
    // Now there is a input mismatch exception but I dont know where it is referring to... I think I might just put the input in a single line and use system.in
    //the findStudent method was not printing for a while, even though the input id matched at some point during the iteration through the students. 
    //I had to use .equals instead of == in order for it to work.  I assume this might be because we are using 'Integer' and not int
    //I had to set total creds to zero in the beginning of getTotalCreds method since when it was called again for the student with the greateset creds,
    // it showed 48, so I think the total += kept on adding up.

    public static ArrayList<Student> fillupStudent() throws IOException {
       


        ArrayList<Student> slist = new ArrayList<Student>(); //arraylist for students



/*
         FileInputStream fileByteStream = null;
        Scanner sc = null;

       fileByteStream = new FileInputStream("C:\\Users\\tinyt\\OneDrive\\Desktop\\AbbyF\\cis231-assignments-tiny-tabby\\studentinfo.txt");
        sc = new Scanner(fileByteStream); */
        //file input attempt 

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // number of students

            for( int j = 0; j< num; j ++){
            int sid = sc.nextInt();
            String sname = sc.next();
            int coursenum = sc.nextInt(); //number of courses

            ArrayList<Course> clist = new ArrayList<Course>(); //arraylist for courses

            for(int i = 0; i < coursenum; i ++){
                String cid = sc.next();
                String cname = sc.next();
                Integer credit = sc.nextInt();
                String grade = sc.next();
                Course c = new Course(cid, cname, credit, grade); //fill in course constructor
                clist.add(c);//add to the arraylist
            }
            Student s = new Student(sid, sname, clist); //fill in student constructor
            slist.add(s); //add to the arraylist
            }

     sc.close();

        //in this method, read all user data below and then construct the list of student object
        //return the arraylist<Student>
        return slist;
        
    }

    public static void printStudent(ArrayList<Student> slist){ 
        
        for(int i = 0; i < slist.size(); i++){
            System.out.println( "\n" + slist.get(i).toString()); //print the tostring 
            ArrayList <Course> clist = slist.get(i).getCourseList(); //just for easier access to the courseList

            for( int j = 0; j < clist.size(); j++) //go through course list for the student at i and print all the classes
            System.out.println(clist.get(j).toString());

            System.out.println("Total credits " + slist.get(i).getTotalCredits()); //print their credits
        
        }
        
        //print all students information
    }
    public static void printStudent(ArrayList<Student> slist, Integer id){ 
        System.out.println("\n The student who has the greatest credits: "); 


        for( int i = 0; i < slist.size(); i++){ //go through all students

            if( slist.get(i).getId().equals(id)){ // if the id matches to the student with the most creds
                System.out.println( slist.get(i).toString()); 
                //print the name

                ArrayList <Course> clist = slist.get(i).getCourseList();
                for( int j = 0; j < clist.size(); j++){
                    System.out.print(clist.get(j).toString() + "\n"); //printing the courses too
                }
                
                System.out.println("Total credits " + slist.get(i).getTotalCredits()); //similar to the other printStudent
                
            }

                
            
        }
        /*
        
        //print the student information with the "id"
        */
    }



    public static Integer findStudent(ArrayList<Student> slist){
        int max = slist.get(0).getTotalCredits(); //highest number of creds
        int id = 0; //the students id who has the highest number of creds

        for( int i = 1; i < slist.size(); i ++){
            if( slist.get(i).getTotalCredits() > max){
                max = slist.get(i).getTotalCredits();
                id = slist.get(i).getId(); //keep track of the students id to return 
            }
        }
        return id;
    }

public static void main(String[] args) throws IOException
{
    Integer sid;
    ArrayList< Student> slist = new ArrayList<Student>();
    slist = fillupStudent(); // make arraylist of students with the input
    printStudent(slist); //print all students

    sid = findStudent(slist); //id of student with highest creds
    printStudent(slist, sid); //using the id to print that specific student
}
/*
input
3 1001 John 3 CIS01 C++ 3 A+ CIS02  Python 3 A0 CIS231 Java 3 A+ 1002 Kurt 4 CIS01 C++ 3 A0 CIS02 Python 3 A CIS232 Java2 3 A+ CNT02 Cisco 3 A0 1003 Kim 2 CIS01 C++ 3 A0 CIS232 Java2 3 A+
*/

//explaination:
//we have the fillsupstudent method to take all the input and organize it into an arraylist of students called slist.  
//there are two similar void methods printstudent, however one takes two parameters.  The printstudent with one parameter prints all students when called.
// the printstudent with two parameters prints the student with the highest credits ( identified by Integer id).
//the method findStudent returns the id for the student with the most creds, which is important because the student's id is needed to call printstudent(with two parameters)
//the main method calls the other methods.  it makes a new student arraylist called slist and fills it up with the fillupstudent method.
//all students are then printed from the printStudent(slist) call
//sid equals the student with the highest creds from the new student arraylist.
//the number returned from the findstudent(slist) call is used to print the student with the highest number of credits.
}
