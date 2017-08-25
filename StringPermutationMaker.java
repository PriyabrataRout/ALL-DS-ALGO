package com.priya.CrackingTheCodingInterview;

public class StringPermutationMaker {

	private static void permutationmaker(String input, String result) {
		if (input == "" || input.isEmpty()) {
			System.out.println(result);
		} else {
			/**
			 * Remove one charecter from string and rest as reminder. Add the
			 * selected value and result. You will get the ans
			 **/
			for (int i = 0; i < input.length(); i++) {
				String reminder = input.substring(0, i) + input.substring(i + 1);
				permutationmaker(reminder.trim(), result + input.charAt(i));
			}

		}

	}

	private static void initiatePermutationMaker(String string) {
		permutationmaker(string, "");

	}

	public static void main(String[] args) {

		String value = AcceptInputs.acceptInputsAsString();
		initiatePermutationMaker(value);

	}

}
