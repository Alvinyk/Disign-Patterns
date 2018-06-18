package specification;

import bean.User;

public class UserByNameLike extends CompositeSpecification{

	private final static String LIKE_FLAG = "%";
	
	private String likeStr;
	
	public UserByNameLike(String likeStr) {
		this.likeStr = likeStr;
	}
	
	@Override
	public boolean isSatisfiedBy(User user) {
		boolean result = false;
		
		String name = user.getName();
		String str = likeStr.replace("%", "");
		
		if(likeStr.endsWith(LIKE_FLAG) && !likeStr.startsWith(LIKE_FLAG)) {
			result = name.startsWith(str);
		}else if(likeStr.startsWith(LIKE_FLAG) && !likeStr.endsWith(LIKE_FLAG)) {
			result = name.endsWith(str);
		}else {
			result = name.contains(str);
		}
		return result;
	}

}
