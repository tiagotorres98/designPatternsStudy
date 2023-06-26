package pattern.structural.adapter;

public class EmailValidatorAdapter implements IEmailValidateAdapter{

	public Boolean validate(String email) {
		EmailValidatorWithNoAdapter validate = new EmailValidatorWithNoAdapter();
		return validate.validate(email);
	}
	
}
