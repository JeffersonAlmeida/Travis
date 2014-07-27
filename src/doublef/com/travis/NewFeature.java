package doublef.com.travis;

public class NewFeature {

	private Travis travis;
	public NewFeature() {
		this.travis = new Travis();
	}
	
	public int method2(){
		return this.travis.method()*2;
	}
	
	public static void main(String[] args) {

	}

}
