package quoter;

public class BashQuoter implements IQuoter {

	private static BashQuoter instance = null;

	static {
		instance = new BashQuoter();
	}

	public static BashQuoter getInstance() {
		return instance;
	}

	@Override
	public String getQuote(int num) {
		return BashParser.parseQuote(num);
	}

}
