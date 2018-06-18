package provider;

import java.util.ArrayList;

import bean.User;
import specification.IUserSpecification;

public interface IUserProvider {

	public ArrayList<User> findUser(IUserSpecification userSpec);
}
