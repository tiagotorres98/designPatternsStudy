package factory;

public class Credit implements IPaymentMethod {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying in Credit");
	}

	@Override
	public PaymentMethodType getType() {
		// TODO Auto-generated method stub
		return PaymentMethodType.CREDIT;
	}

}
