package client;

import java.util.ArrayList;

import bean.User;
import provider.IUserProvider;
import provider.UserProvider;
import specification.IUserSpecification;
import specification.UserByAgeThan;
import specification.UserByNameLike;

public class client {

	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("苏国庆",23));
		userList.add(new User("国庆牛",83));
		userList.add(new User("张国庆三",10));
		userList.add(new User("李四",25));
		
		IUserProvider provider = new UserProvider(userList);
		System.out.println("********** 名字包含国庆的人 *****************");
		IUserSpecification specAge = new UserByAgeThan(0);
		IUserSpecification specName = new UserByNameLike("%国庆%");
		
		for(User u : provider.findUser(specAge.and(specName))) {
			System.out.println(u);
		}
	}
}
