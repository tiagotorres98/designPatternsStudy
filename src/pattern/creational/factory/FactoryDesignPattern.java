package pattern.creational.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethodFactory factory = new PaymentMethodFactory();
		IPaymentMethod method = factory.get(PaymentMethodType.CREDIT);
		method.pay();
	}

}
