package customer;

import event.ProductEvent;
import event.ProductEventType;
import product.Product;

public class Nobleman extends EventCustomer {

	public Nobleman() {
		super(EventCustomType.EDIT);
		super.addCustomType(EventCustomType.CLONE);
	}
	@Override
	public void exec(ProductEvent event) {
		Product p = event.getSource();
		
		ProductEventType type = event.getEventType();
		
		if(type.getValue() == EventCustomType.CLONE.getValue()) {
			System.out.println("贵族处理事件: "+ p.getName() + "克隆,事件类型 = "+ type);
		}else {
			System.out.println("贵族处理事件: "+ p.getName() + "克隆,事件类型 = "+ type);
		}
	}

}
