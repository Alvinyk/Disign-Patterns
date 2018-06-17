package customer;

import java.util.Vector;

import event.ProductEvent;

public abstract class EventCustomer {

	private Vector<EventCustomType> customType = new Vector<EventCustomType>();
	
	public EventCustomer(EventCustomType type) {
		customType.add(type);
	}
	
	public void addCustomType(EventCustomType type) {
		customType.add(type);
	}
	
	public boolean hasEvent(ProductEvent event) {
		for(EventCustomType type : customType) {
			if(type.getValue() == event.getEventType().getValue()) {
				return true;
			}
		}
		
		return false;
	}
	
	public abstract void exec(ProductEvent event);
}
