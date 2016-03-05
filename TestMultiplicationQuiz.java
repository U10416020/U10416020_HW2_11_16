//U10416020

import java.util.*;

public class TestMultiplicationQuiz {
	//Main method
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		//Creat a object of MultiplicationQuiz
		MultiplicationQuiz quiz = new MultiplicationQuiz();
		
		//While loop to ask the quiz until the answer correct
		while(quiz.getCont() == false){
			//Ask the quiz and check the answer
			System.out.println("What is " + quiz.getNum1() + "*" + quiz.getNum2() + "?");
			int ans = input.nextInt();
			quiz.check(ans);
			
			//Display the result
			System.out.print(quiz.getResult());	
		}			
	}
}
