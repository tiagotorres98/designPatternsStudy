package pattern.creational.factory;

public interface IPaymentMethod {

	public void pay();
	
	public PaymentMethodType getType();
	
}
