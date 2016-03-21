package pack;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.omg.CORBA.portable.InputStream;

public class Run {

	public static void main(String[] args) {
	
		 String txt="";
		 String s="";
		 String[] ftext;
		 int wordcount=0;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("введите текст 'end' - для завершения");
	        while (!s.equals("end")){
	        	try {
	        		txt += s;
	        		s = br.readLine();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	        }
	        
	        ftext = txt.split("[^0-9a-zA-Zа-яА-Я]+");
	        for (String str : ftext){
	        	wordcount += 1;
			}
	        
	        System.out.println("По мнению методов класса String в вашем тексте "+wordcount+" слов");
	       
	        wordcount = 0;
	        
	        StringTokenizer token = new StringTokenizer(txt, " \t\n\r,.");
	        
	        while(token.hasMoreTokens()){
	        	
	            System.out.println(token.nextToken()) ; 
	        	wordcount += 1;
					
				}
	        
	        System.out.println("По мнению методов класса StringTokinizer в вашем тексте "+wordcount+" слов");
	
	}

}
