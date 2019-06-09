package S4.G1078.KOVACS_ERIK_ROBERT.factory;

import S4.G1078.KOVACS_ERIK_ROBERT.sources.IClient;

public class Customer implements IClient{

	@Override
	public String getName() {
		return "Customer";
	}

}
