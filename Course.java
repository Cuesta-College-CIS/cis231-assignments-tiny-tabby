public class Course {
    String cid;
    String cname;
    Integer credit;
    String grade;


    public Course(String id, String name, Integer c, String g){
        cid = id;
        cname = name;
        credit = c;
        grade = g;


    }//end constructor

    public Integer getCredit(){
        return credit; //to access credits in other classes
    }

    public String toString(){

         return "Course: " + cid + " " + cname + " " + credit + " " +grade + "\n"; //printing format

        //ovverride the tostring to print the object instance
        //return the string to print all information of the course object
    }
    //explaination
    //class course stores the information of a single course.
    //it is constructed with the variables, cid, cname, credit, and grade.  Most of these are just for printing, although we do need access to credit
    //in both the Student and main class so an accessor method is used for credit
}
