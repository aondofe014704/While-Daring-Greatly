public class Methodssssssssssss{

public static void main(String[] args){

calculateScore(true, 800, 5, 100);
calculateScore(true, 1000, 8, 200);

}

public static void calculateScore(boolean gameOver, int levelCompleted, int bonus){
	if(gameOver){
	int flashScore = score + (levelCompleted * bonus);
	finalScore += 2000;
	System.out.println("Your final score was " + 	finalScore);

}

}

}