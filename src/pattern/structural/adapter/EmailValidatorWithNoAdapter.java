package pattern.structural.adapter;

public class EmailValidatorWithNoAdapter {

	public Boolean validate(String email) {
		return email.contains("@");
	}
	
}
