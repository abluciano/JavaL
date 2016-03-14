package pack;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	int m;
	int n;
	int ArrMatrix[][];

	public Matrix() {
		m = 3;
		n = 3;
		ArrMatrix = new int[3][3];
	}

	public Matrix(int m, int n) {

		this.m = m;
		this.n = n;
		ArrMatrix = new int[n][m];
	}

	// *********** print matrix
	private void prn(int[][] M) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				System.out.print(M[i][j] + "\t");
			}
			System.out.println();
		}
	}
	// ****************

	public void fillMatrix() {
		Scanner in = new Scanner(System.in);
		int st, col;
		for (int i = 0; i < n; i++) {
			st = i + 1;
			for (int j = 0; j < m; j++) {
				col = j + 1;
				System.out.println("������� ������ " + st + "����� " + col + ":\n");
				ArrMatrix[i][j] = in.nextInt();
			}

		}
		System.out.println("��������� ���� �������: \n");
		prn(ArrMatrix);
	}

	public void sum(Matrix A) {

		int[][] Res = new int[n][m];

		if (A.ArrMatrix.length != ArrMatrix.length) {
			System.out.println("���������� ����� ������ ������� ������ �������!\n");
			System.out.println("�� �������� ������� �������� " + n + "x" + m + " ��������� ����\n");
			return;
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				Res[i][j] = ArrMatrix[i][j] + A.ArrMatrix[i][j];
				
			}

		}
		System.out.println("� ���������� �������� ���������� �������: \n");
		prn(Res);
	}

	public void dim(Matrix A) {

		int[][] Res = new int[n][m];

		if (A.ArrMatrix.length != ArrMatrix.length) {
			System.out.println("�������� ����� ������ ������� ������ �������!\n");
			System.out.println("�� �������� ������� �������� " + n + "x" + m + " ��������� ����\n");
			return;
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				Res[i][j] = ArrMatrix[i][j] + A.ArrMatrix[i][j] * -1;
			}

		}
		System.out.println("� ���������� ��������� ���������� �������: \n");
		prn(Res);
	}

	public void invers(int[][] A) {

		int determ = 0;

		if (A.length != A[0].length) {
			System.out.println("������������� ����� ������ ���������� �������\n");
			return;
		}

		if (A.length > 3) {
			System.out.println("���! ������� ������ �������. � ����� �� ����\n");
			return;
		}

		if (A.length == 2) {
			determ = A[0][0] * A[1][1] - A[1][0] * A[0][1];

			if (determ != 0) {
				int a = A[0][0];
				int b = A[0][1];
				A[0][0] = A[1][1];
				A[0][1] = A[1][0];
				A[1][0] = b;
				A[1][1] = a;
				System.out.println("��������� �������:\n");
				prn(A);
			}

		}

		if (A.length == 3) {
			determ = A[0][0] * A[1][1] * A[2][2] + A[0][0] * A[1][1] * A[2][2] + A[1][0] * A[2][1] * A[0][2]
					- A[2][0] * A[1][1] * A[0][2] - A[0][0] * A[2][1] * A[1][2] - A[1][0] * A[0][1] * A[2][2];
			if (determ != 0) {
				System.out.println("��� ������ ���� �������, �� � ��� �� �����");
				return;
			}
		}

		if (determ == 0) {
			System.out.println("�������� ������� ���");
			return;
		}

	}

	public int getM() {
		return m;

	}

	public int getN() {
		return n;

	}

	public void mult(Matrix A, int x) {

		int[][] Res = new int[n][m];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				Res[i][j] = A.ArrMatrix[i][j] * x;
			}

		}
		System.out.println("� ���������� ��������� ����� ������� �� " + x + " ����������:\n");
		prn(Res);

	}

	public static void simpMatrix(int x) {
		int[][] Res = new int[x][x];

		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x; j++) {

				if (i == j) {
					Res[i][j] = 1;
				}

				System.out.print(Res[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
