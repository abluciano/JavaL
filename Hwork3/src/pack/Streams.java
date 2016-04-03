package pack;

public class Streams extends Thread {

	private Matrix A;
	private Matrix B;
	private int numMult;

	public Streams(Matrix A, Matrix B, int numMult) {

		this.A = A;
		this.B = B;
		this.numMult = numMult;
		setName("neo");
	}

	@Override
	public void run() {
		long initTime = System.currentTimeMillis();

		while (System.currentTimeMillis() - initTime < 5000) { // TTL = 5 sec

			A.mult(A, numMult);
			A.sum(B);

		}
		return;
	}

}
