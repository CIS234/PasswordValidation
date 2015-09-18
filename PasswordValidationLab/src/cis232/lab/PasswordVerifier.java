package cis232.lab;

public class PasswordVerifier {

	public static void main(String[] args) {
		
		System.out.println(validatePassword("testEr1!"));
	}
	
	public static boolean validatePassword(String password){
		boolean meetsLengthRequirement = false;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasSpecial = false;
		
		meetsLengthRequirement = password.length() <= 20 && password.length() >= 8;
	
		for(int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			if(Character.isUpperCase(c)){
				hasUpperCase = true;
			} else if (Character.isLowerCase(c)){
				hasLowerCase = true;
			} else if (Character.isDigit(c)){
				hasDigit = true;
			} else if(!Character.isWhitespace(c)){
				hasSpecial = true;
			}
		}
		
		return meetsLengthRequirement && hasUpperCase && hasLowerCase 
				&& hasDigit && hasSpecial;
	}

}
