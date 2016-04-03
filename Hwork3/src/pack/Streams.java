package pack;

public class Streams extends Thread {

	private Matrix A;
	private Matrix B;
	private int numMult;

	public Streams(Matrix A, Matrix B) {

		this.A = A;
		this.B = B;
		setName("summa");
	}

	public Streams(Matrix A, int numMult) {

		this.A = A;
		this.numMult = numMult;
		setName("multy");
	}

	@Override
	public void run() {
		long initTime = System.currentTimeMillis();

		while (System.currentTimeMillis() - initTime < 5000) { // TTL = 5 sec
			if (numMult != 0) {
				A.mult(A, numMult);
			} else {
				A.sum(B);
			}
		}
		return;
	}

}
