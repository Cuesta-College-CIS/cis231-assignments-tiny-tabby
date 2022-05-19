 abstract class Person {
    String name;
    String dob;
 public Person (String name, String dob){
    this.name = name;
    this.dob = dob;
}
 abstract void printPerson();

 public String toString(){
     return "Name:\t" + name + "\tDOB:\t" + dob;
 }
}

