package event;

import java.util.Observable;

import product.Product;

public class ProductEvent extends Observable {

	private Product source;
	
	private ProductEventType type;
	
	public ProductEvent(Product p) {
		this(p,ProductEventType.NEW_PRODUCT);
	}
	
	public ProductEvent(Product p,ProductEventType type) {
		this.source = p;
		this.type = type;
		
		notifyEventDispatch();
	}
	
	public Product getSource() {
		return this.source;
	}
	
	
	public ProductEventType getEventType() {
		return this.type;
	}
	
	private void notifyEventDispatch() {
		super.addObserver(EventDispatch.getEventDispatch());
		super.setChanged();
		super.notifyObservers(source);
	}
}
