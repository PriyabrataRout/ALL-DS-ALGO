package com.priya.CrackingTheCodingInterview;

public class FindIfANumberIsAPerfectSquare {

	private static int find(int num, int min, int max){
		if(min>max)
			return -1;
		int guess= (min+max)/2;
		
		if(guess*guess==num)
			return guess;
		if(guess*guess>num)
			return find(num, min, guess-1);
		else
			return find(num, guess+1, max);
		
	}
	
	
	private static void initiate(int num){
		System.out.println(find(num, 0, num));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 initiate(AcceptInputs.acceptInputsAsNumber());

	}

}
