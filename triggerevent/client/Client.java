package client;

import customer.Beggar;
import customer.Commoner;
import customer.Nobleman;
import event.EventDispatch;
import product.Product;
import product.ProductManager;

public class Client {

	public static void main(String[] args) {
		EventDispatch dispatch = EventDispatch.getEventDispatch();
		dispatch.registerCustomer(new Beggar());
		dispatch.registerCustomer(new Commoner());
		dispatch.registerCustomer(new Nobleman());

		ProductManager factory = new ProductManager();
		
		System.out.println("********************* 模拟创建产品事件 *******************");
		System.out.println("创建一个叫小男孩的原子弹");
		Product p = factory.createProduct("小男孩原子弹");
		
		System.out.println("\n********************* 模拟修改产品事件 ********************");
		System.out.println("把小男孩原子弹修改为胖子号原子弹");
		factory.editProduct(p, "胖子号原子弹");
		
		System.out.println("\n********************* 模拟克隆事件 ×××××××××××××××××××××××××");
		System.out.println("克隆胖子号原子弹");
		factory.clone(p);
		
		System.out.println("\n********************* 模拟销毁产品事件 ××××××××××××××××××××××");
		System.out.println("销毁胖子号原子弹");
		factory.abandonProduct(p);
	}
}
