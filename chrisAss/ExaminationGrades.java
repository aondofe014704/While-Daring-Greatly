import java.util.Scanner;

public class ExaminationGrades{

public static void main(String[] args){

Scanner grade = new Scanner(System.in);

for(int i = 1; i <= 5; i++){
	System.out.print("Enter a mark: ");
	int mark = grade.nextInt();

	if(mark >= 90){
	System.out.println("Grade A");
	}
	
	else if(mark >= 80){
	System.out.println("Grade B");
	}
	
	else if(mark >= 70){
	System.out.println("Grade C");
	}
	
	else if(mark >= 60){
	System.out.println("Grade D");
	}
	
	else if(mark >= 40){
	System.out.println("Grade E");
	}
	
	else if(mark <40){
	System.out.println("Grade F");
	}
}
}

}