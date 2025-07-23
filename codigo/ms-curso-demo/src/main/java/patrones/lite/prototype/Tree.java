package patrones.lite.prototype;

public abstract class Tree {

	public String name;
	public int height;
	public String color;
	
	public Tree(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract Tree copy();

}