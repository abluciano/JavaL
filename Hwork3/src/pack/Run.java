package pack;

public class Run {

	public static void main(String[] args) {
/*  ������� �������		
		Matrix M = new Matrix(2, 2);
		Matrix D = new Matrix (2, 2);
		D.fillMatrix();
		M.fillMatrix();
		M.sum(D);
		M.dim(D);
		M.invers(D);
		M.mult(M, 3);
		Matrix.simpMatrix(5);
*/		
		Matrix m1 = new Matrix();
		Matrix m2 = new Matrix();
		Streams str1 = new Streams(m1, 10);
		Streams str2 = new Streams(m2, 4);
		str1.start();
		str2.start();
		
	}

}
