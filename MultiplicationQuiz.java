//U10416020
import java.security.SecureRandom;
import java.util.*;

public class MultiplicationQuiz {
	ArrayList<Integer> answerList = new ArrayList<>();
	SecureRandom random = new SecureRandom();
	
	int num1 = random.nextInt(10);
	int num2 = random.nextInt(10);
	int answer = num1 * num2;
	String result;
	boolean cont = false;
	
	MultiplicationQuiz(){		
	}
	
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
	
	public String getResult(){		
		return result;
	}
	
	public boolean getCont(){
		return cont;
	}
	
	public int getNum1(){
		return num1;
	}
	
	public int getNum2(){
		return num2;
	}
	
}
