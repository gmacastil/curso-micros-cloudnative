package patrones.lite.singleton;

public class Cliente {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance("diego");
		
		
		
		Singleton anotherSingleton = Singleton.getInstance("alex");
		
		
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
	}

}
