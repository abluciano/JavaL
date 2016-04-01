package pack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Run {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
	
//		Class infoMatrix = Class.forName("Hwork3.src.pack.Matrix");
		
		Class infoMatrix = Matrix.class;
		try {
			Object matr = infoMatrix.newInstance();
			Matrix m1 = (Matrix)matr;
			
			Matrix m2 = new Matrix(3,3);
			m2.fillMatrix();
			m1.sum(m2);
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("������ ������:");
		
		for(Method meth: infoMatrix.getDeclaredMethods()){
			
			System.out.println(meth.getReturnType()+" "+meth.getName()+"("+meth.getParameters()+");");
			
		}
		
		

		System.out.println("\n���� ������:");
		for(Field field: infoMatrix.getDeclaredFields()){
			
			System.out.println(field.getType()+": "+field.getName());
			
		}
		
	
		System.out.println("\n������������ ������:");
		for(Constructor con: infoMatrix.getDeclaredConstructors()){
			
			System.out.println(con.getName()+"("+con.getParameters()+");");
			
		}


	}

}
