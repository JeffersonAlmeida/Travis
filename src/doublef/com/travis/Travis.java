package doublef.com.travis;

public class Travis {
	
	public int method(){
		return 10; 
	}
	
	public static void main(String[] args) {
		System.out.println("Travis First Project");
		System.out.println("method return:" + new Travis().method());
	}

}
