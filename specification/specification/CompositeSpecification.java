package specification;

import bean.User;

public abstract class CompositeSpecification implements IUserSpecification {

	@Override
	public abstract boolean isSatisfiedBy(User user);

	@Override
	public IUserSpecification and(IUserSpecification spec) {
		return new AndSpecification(this,spec);
	}

	@Override
	public IUserSpecification or(IUserSpecification spec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUserSpecification not() {
		// TODO Auto-generated method stub
		return null;
	}

}
