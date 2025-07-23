package patrones.lite.chain;

public class Cliente {

	public static void main(String[] args) {
		AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
		AuthenticationProcessor authProcessorChain = new UsernamePasswordProcessor(oAuthProcessor);
		//
		
		
		
		
		System.out.println(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
		//
		System.out.println(authProcessorChain.isAuthorized(new SamlTokenProvider()));
	}

}
