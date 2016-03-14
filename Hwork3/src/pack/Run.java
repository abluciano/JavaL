package pack;

public class Run {

	public static void main(String[] args) {
		
		Matrix M = new Matrix(2, 2);
		Matrix D = new Matrix (2, 2);
		D.fillMatrix();
		M.fillMatrix();
		M.sum(D);
	//	M.dim(D);
	//	M.invers(D);
	//	M.mult(M.ArrMatrix, 3);
		Matrix.simpMatrix(5);
	}

}
