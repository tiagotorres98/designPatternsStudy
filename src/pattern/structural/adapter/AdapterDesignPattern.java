package pattern.structural.adapter;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		
		//Code coupled to the class
		EmailValidatorWithNoAdapter validator1 = new EmailValidatorWithNoAdapter();
		Boolean result  = validator1.validate("test@test.com");
		System.out.println(result);
				
		//Code decoupled from class
		result = validadeWithAdapter(new EmailValidatorAdapter(),"test@test.com");
		System.out.println(result);
	}
	
	public static Boolean validadeWithAdapter(IEmailValidateAdapter validator, String email) {
		return validator.validate(email);
	}
	
}
