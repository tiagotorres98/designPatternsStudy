package pattern.creational.factory;

public class PIX implements IPaymentMethod {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying in PIX");
	}

	@Override
	public PaymentMethodType getType() {
		// TODO Auto-generated method stub
		return PaymentMethodType.PIX;
	}

}
