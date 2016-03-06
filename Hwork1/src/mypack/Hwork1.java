package mypack;

public class Hwork1 {

	public static void main(String[] args) {
	
		int simple = Integer.decode(args[0]);
		int res;
		// ********** уравнения**********
		Sqr uravnenie1 = new Sqr(1, 20, 3);
		uravnenie1.SqrUr();
		//********************************
	
		 
		//**************** простые числа ***********
		 for (int ch=3; ch<=simple; ch++){ // начинаем с 3, т.к. 0 делится на все, а 1 и 2 простые
			for(int x=2;x<ch;x++){         // начинаем с 2, т.к. на 0 делить нельзя, а на 1 делится все
				res = ch%x;
				if(res==0){break;}  
                if (res!=0 & x==ch-1){
                System.out.println(ch);
                break;
                }
                if (res!=0){continue;}
                  }
                }
	//**************************************************
		
		
	
}

}
