package patrones.lite.interpreter;

public class Cliente {
	public static void main(String[] args) {
		Expression person1 = new TerminalExpression("alex");
		Expression person2 = new TerminalExpression("castillo");
		Expression buscaOr = new OrExpression(person1, person2);

		Expression casa = new TerminalExpression("Casa");
		Expression carro = new TerminalExpression("Carro");
		Expression buscaAnd = new AndExpression(casa, carro);

		System.out.println(buscaOr.interpreter("alex"));
		System.out.println(buscaOr.interpreter("castillo"));
		System.out.println(buscaOr.interpreter("gustavo"));

		System.out.println(buscaAnd.interpreter("Casa, Carro"));
		System.out.println(buscaAnd.interpreter("Techo, Olla"));

	}
}
