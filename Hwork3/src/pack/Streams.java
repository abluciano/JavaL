package pack;

public class Streams extends Thread {

	private Matrix A;
	private int numMult;

	public Streams(Matrix A, int numMult) {

		this.A = A;
		this.numMult = numMult;
		setName("neo");
	}

	@Override
	public void run() {
		long initTime = System.currentTimeMillis();

		while (System.currentTimeMillis() - initTime < 5000) { // TTL = 5 sec
			
			A.mult(A, numMult);
			
		}
		return;
	}

}
