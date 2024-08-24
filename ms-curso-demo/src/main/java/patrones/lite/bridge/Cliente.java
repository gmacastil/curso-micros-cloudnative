package patrones.lite.bridge;

public class Cliente {
	public static void main(String[] args) {
		Square sq = new Square(new Blue());
		System.out.println(sq.draw());
		
		Triangle tr = new Triangle(new Red());
		System.out.println(tr.draw());
		
	}
}
