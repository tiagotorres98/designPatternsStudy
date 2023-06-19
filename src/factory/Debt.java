package factory;

public class Debt implements IPaymentMethod {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying in Debt");
	}

	@Override
	public PaymentMethodType getType() {
		// TODO Auto-generated method stub
		return PaymentMethodType.DEBT;
	}

}
