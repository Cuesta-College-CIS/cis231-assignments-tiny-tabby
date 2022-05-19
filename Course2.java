

public class Course2 implements CourseActivity{
    String cid;
    String coursename;
    int score;
    String grade;

    public Course2( String cid, String coursename, int score){
        this.cid = cid;
        this.coursename = coursename;
        this.score = score;
      
    }
    
    public Integer getScore(){
        return score; 
    }

   

   
    public void decideGrade(){
        if( score >= 90 ){
            grade = "A";
        }
        else if( score >= 80){
            grade = "B";
        }
        else if( score >= 70){
            grade = "C";
        }
        else if( score >= 60){
            grade = "D";
        }
        else{
            grade = "F";
        }
    }

    public void printCourseinfo(){
        decideGrade();//turns null if i dont call it
        System.out.println( "Course ID: \t" + cid + "\tName: " + coursename + "\tScore: " + score + "\tGrade:\t" + grade);
    }
}
