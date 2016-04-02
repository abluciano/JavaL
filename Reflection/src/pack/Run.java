package pack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Run {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	
//		Class infoMatrix = Class.forName("Hwork3.src.pack.Matrix");
		
		Class infoMatrix = Matrix.class;
		try {
			Object matr = infoMatrix.newInstance();
			Matrix m1 = (Matrix)matr;
			
			Constructor m2 = infoMatrix.getDeclaredConstructor(int.class, int.class);
			Object matr2 = m2.newInstance(3, 3);
			Matrix m3 = (Matrix)matr2;
			m3.fillMatrix();
			m1.sum(m3);
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Методы класса:");
		
		for(Method meth: infoMatrix.getDeclaredMethods()){
			
			System.out.println(meth.getReturnType()+" "+meth.getName()+"("+meth.getParameters()+");");
			
		}
		
		

		System.out.println("\nПоля класса:");
		for(Field field: infoMatrix.getDeclaredFields()){
			
			System.out.println(field.getType()+": "+field.getName());
			
		}
		
	
		System.out.println("\nКонструкторы класса:");
		for(Constructor con: infoMatrix.getDeclaredConstructors()){
			
			System.out.println(con.getName()+"("+con.getParameters()+");");
			
		}


	}

}
