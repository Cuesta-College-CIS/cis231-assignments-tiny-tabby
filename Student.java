import java.util.ArrayList;
public class Student{
    Integer sid;
    String sname;
    ArrayList<Course> clist;
    Integer total = 0;


    Student(Integer id, String name, ArrayList<Course> c){
        sid = id;
        sname = name;
        clist = c;
    }//constructor

    public int getTotalCredits(){
        total = 0; //reset since this keeps on adding each time it is called
        for ( int i = 0; i < clist.size(); i ++){

            total += clist.get(i).getCredit();
        }
        return total;
    }   
        //return the total credits of the courses

    public Integer getId(){
        return sid;
    }

    public ArrayList<Course> getCourseList(){
        return clist;
    }

    
    public String toString(){
        return "Student: " + sid + " " + sname;
        //override the toString() to print the object instance
        //return the string to print all information of the Student object
    }

    //explaination: the class student has the variables sid, sname, and clist to keep track of each student's name, id and the list of courses they are taking
    //we only need access to their total credits, id, and courselist, so there are only accessor methods for those variables
    //in getTotalCredits() we iterate through the students entire arraylist of courses and add each credit to the total by using clist.get(i).getCredit()

}