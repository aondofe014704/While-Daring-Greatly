public class ClassStudentTest{

public static void main(String[] args){

ClassStudent student1 = new ClassStudent("Jack Songu", 93.4);

ClassStudent student2 = new ClassStudent("Mary Clark", 43);

System.out.printf("%s's letterGrade is: %s%n", student1.getName(), student1.getLetterGrade());

System.out.printf("%s's letterGrade is: %s%n", student2.getName(), student2.getLetterGrade());


}


}