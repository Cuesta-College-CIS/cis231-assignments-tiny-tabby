import java.util.ArrayList;
public class Student2 extends Person {
    Integer sid;
    Integer credits;
    ArrayList<Course2> clist;
    String name;
    String dob;


    public Student2( String name, String dob, Integer sid , Integer credits, ArrayList<Course2> clist){
       super(name, dob); // get from person 
       this.sid = sid;
       this.credits = credits;
       this.clist = clist;

    }
    
    public ArrayList<Course2> getCourseList(){
        return clist;
    }

    public String toString(){
        return super.toString() + "\nID:\t" + sid + "\tCredits\t" + credits;
    }
    public void printPerson(){
        System.out.println(super.toString()); 
    }
}
