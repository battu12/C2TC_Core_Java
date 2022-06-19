package multithread;

public class TestForImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ImplementThread());
		t.start();
	}

	
}
