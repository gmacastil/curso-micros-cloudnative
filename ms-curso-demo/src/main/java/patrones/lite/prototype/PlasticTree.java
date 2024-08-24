package patrones.lite.prototype;

public class PlasticTree extends Tree {
	   
    public PlasticTree(String name, int height) {
		super(name, height);
	}

	@Override
    public Tree copy() {
        return new PlasticTree(this.name, this.height);
    }

}
