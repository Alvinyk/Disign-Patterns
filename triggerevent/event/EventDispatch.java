package event;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import customer.EventCustomer;
import product.Product;

public class EventDispatch implements Observer{

	private final static EventDispatch dispatch = new EventDispatch();
	
	private Vector<EventCustomer> customers = new Vector<EventCustomer>();
	
	private EventDispatch() {}
	
	public static EventDispatch getEventDispatch() {
		return dispatch;
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		Product product = (Product)arg;
		ProductEvent event = (ProductEvent)o;
		
		for(EventCustomer c :customers) {
			if(c.hasEvent(event)) {
				c.exec(event);
			}
		}
	}
	
	public void registerCustomer(EventCustomer customer) {
		this.customers.add(customer);
	}
	

}
