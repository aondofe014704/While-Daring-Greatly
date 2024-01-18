import java.util.Scanner;

public class StudentGrade{

public static void main(String[] args){

Scanner scores = new Scanner(System.in);

System.out.println("Enter number of Students");
int numberOfStudents = scores.nextInt(); 

System.out.println("Enter number of Subjects");
int numberOfSubjects = scores.nextInt();

int [][] myArray = new int [numberOfStudents][numberOfSubjects];

int counter = 0;

for(int i = 0; i < numberOfStudents; i++){
counter++;
System.out.printf("Entering score for student %d%n", i+1);
for(int j = 0; j < numberOfSubjects; j++){
counter++;
System.out.printf("Entering score for student %d%n", j+1);
myArray[i][j] = scores.nextInt();

}
	
} 

 


}

}