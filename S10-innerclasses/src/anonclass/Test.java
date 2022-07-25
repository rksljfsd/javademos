package anonclass;

public class Test {

	public static void main(String[] args) {
		

		
		IConnection newcon = new IConnection() {
			
			@Override
			public void connect(String connectionDetails) {
				System.out.println("New connection established using anonymous class - " + connectionDetails);
			}
		};
		
		newcon.connect("ProductionServer");
		
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous worker in a separate thread");
			}
		});
		t1.start();
		
	}
	
}
