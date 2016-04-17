package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Net {

	public static void main(String[] args) throws IOException {
		
		String seeker = "http://yandex.ru:80/search?text=";
		String query = "car";

		File flog = new File("C:/Loggs/log.txt");
		if (!flog.exists()) {
			Path cpath = Paths.get("C:/Loggs/");
			try {
				Files.createDirectories(cpath);
				flog.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		FileWriter wrLog = new FileWriter("C:\\Loggs\\log.txt", false);

		
		   URL url = new URL(seeker+query+"&lr=213");
		   System.out.println("Отправляем запрос");
	        BufferedReader reader = new BufferedReader( new InputStreamReader(url.openConnection().getInputStream(), "UTF-8"));
	        while (true) {
	            String line = reader.readLine();
	            if (line == null){break;}
	            wrLog.write(line+"\n");
	        }
	        wrLog.close();
	        System.out.println("Данные загружены");
	}

}
