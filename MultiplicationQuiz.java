//U10416020

import java.security.SecureRandom;
import java.util.*;

public class MultiplicationQuiz {
	//Data field
	ArrayList<Integer> answerList = new ArrayList<>();
	
	SecureRandom random = new SecureRandom();	
	int num1 = random.nextInt(10);
	int num2 = random.nextInt(10);
	int answer = num1 * num2;
	
	String result;
	boolean cont = false;
	
	//Non-argument constructor
	MultiplicationQuiz(){		
	}
	
	//Method to check the answer
	public void check(int ans){
		if(ans == answer){
			result = "You got it!";
			cont = true;
		}
			
		else{
			cont = false;
			if(answerList.contains(ans))
				result = "You already entered " + ans + "\nWrong answer. Try again. ";
			else
				result = "Wrong answer. Try again. ";
			
		}
		answerList.add(ans);
	}
	
	//Method to return result
	public String getResult(){		
		return result;
	}
	
	//Method to return cont
	public boolean getCont(){
		return cont;
	}
	
	//Method to return num1
	public int getNum1(){
		return num1;
	}
	
	//Method to return num2
	public int getNum2(){
		return num2;
	}
	
}
