package S4.G1078.KOVACS_ERIK_ROBERT.factory;

import S4.G1078.KOVACS_ERIK_ROBERT.sources.IClient;

public class ClientFactory {
	public static IClient getClient(ClientType clientType) {
		// Return a subclass based on enum offset passed
		IClient client = null;
		switch(clientType) {
			case CUSTOMER:
				client = new Customer();
				break;
			case LOYAL_CLIENT:
				client = new LoyalClient();
				break;
			case VIP_CLIENT:
				client = new VIPClient();
				break;
		}
		return client;
	}
}
