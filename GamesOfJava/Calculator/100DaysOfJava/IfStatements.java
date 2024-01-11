public class IfStatements{

public static void main(String[] args){

boolean isAlien = false;

if(isAlien == true){
	System.out.println("It is not an alien!");
	System.out.println("And i am scared of Aliens");
}

int topScore = 100;
if(topScore == 100){
	System.out.println("You got the high Score");

}
int secondTopScore = 95;
if((topScore > secondTopScore) && (topScore < 100)){
System.out.println("Greater than second top score and  less than 100");

}
if((topScore > 90) || (secondTopScore <= 90)){

System.out.println("Either or both of the conditions are true");

}

}



}