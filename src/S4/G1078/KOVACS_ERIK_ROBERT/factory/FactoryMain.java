package S4.G1078.KOVACS_ERIK_ROBERT.factory;

import S4.G1078.KOVACS_ERIK_ROBERT.sources.IClient;

public class FactoryMain {
	public static void main(String[] args) {
		// Create three different class instances
		IClient client1 = ClientFactory.getClient(ClientType.CUSTOMER);
		IClient client2 = ClientFactory.getClient(ClientType.LOYAL_CLIENT);
		IClient client3 = ClientFactory.getClient(ClientType.VIP_CLIENT);
		
		// Then make sure they are the right class
		System.out.println(String.format("Client 1 is %s and is of type `%s`", client1.getName(), client1.getClass()));
		System.out.println(String.format("Client 2 is %s and is of type `%s`", client2.getName(), client2.getClass()));
		System.out.println(String.format("Client 3 is %s and is of type `%s`", client3.getName(), client3.getClass()));
	}
}
