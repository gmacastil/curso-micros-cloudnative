package patrones.lite.prototype;

public class Cliente {
	
	public static void main(String[] args) {
		PlasticTree pt = new PlasticTree("pino", 10);
		pt.setColor("blue");
		
		
		
		PlasticTree pt2 = (PlasticTree) pt.copy();
		pt2.setColor("black");
		
		
		PlasticTree pt3 = (PlasticTree) pt.copy();	
		pt3.setColor("red");
		
		
		System.out.println(pt.color);
		System.out.println(pt2.color);
		System.out.println(pt3.color);
	}

}
