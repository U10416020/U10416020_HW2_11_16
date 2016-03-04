//U10416020

import java.util.*;

public class TestMultiplicationQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MultiplicationQuiz quiz = new MultiplicationQuiz();
		while(quiz.getCont() == false){
			System.out.println("What is " + quiz.getNum1() + "*" + quiz.getNum2() + "?");
			int ans = input.nextInt();
			quiz.check(ans);
			System.out.print(quiz.getResult());	
		}
			
	}
}
