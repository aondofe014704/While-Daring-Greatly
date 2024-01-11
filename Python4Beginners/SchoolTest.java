public class SchoolTest{
public static void main(String[] args){
School school =  new School();


school.setSchoolName("Wantor Model College Adikpo");
school.setNumberOfStudents(67);

int schoolNo = school.getNumberOfStudents();
String nameOTheSchool = school.getSchoolName();

System.out.println(schoolNo);
System.out.println(nameOTheSchool);


}


}