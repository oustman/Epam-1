package checklist;

import asimpleclass.AccountDetails;

public interface Dataaccessobj {

	public abstract boolean isLognUser(AccountDetails user);
	public abstract boolean Validation(AccountDetails user);
}
