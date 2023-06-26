package pattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodFactory {

	public IPaymentMethod get(PaymentMethodType type) {
		return getList().stream().filter(f-> f.getType().equals(type)).findFirst().get();
	}
	
	private List<IPaymentMethod> getList(){
		List<IPaymentMethod> result = new ArrayList<IPaymentMethod>();
		result.add(new Credit());
		result.add(new Debt());
		result.add(new PIX());
		return result;
	}
}
