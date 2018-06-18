package specification;

import bean.User;

public class NotSpecification extends CompositeSpecification {

	private IUserSpecification spec;
	
	public NotSpecification(IUserSpecification spec) {
		this.spec = spec;
	}
	
	@Override
	public boolean isSatisfiedBy(User user) {
		return !spec.isSatisfiedBy(user);
	}

}
