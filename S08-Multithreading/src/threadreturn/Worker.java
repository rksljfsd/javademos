package threadreturn;

import java.util.concurrent.Callable;

public class Worker implements Callable<Integer> {
	
	int num;
	
	Worker(int userinput) {
		this.num = userinput;
	}
	
	int getNum() {
		return num;
	}

	@Override
	public Integer call() throws Exception {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Calculation begin for " + num);
		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		Thread.sleep(1000);
		System.out.println(tname + ": Calculation end");
		return total;
	}

}
