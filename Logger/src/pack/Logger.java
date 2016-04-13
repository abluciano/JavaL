package pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger extends Thread{

	LogBody logB;



	public Logger(LogBody logB) {
	
		this.logB = logB;
	}


	@Override
	public void run() {

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

		try {
			// BufferedWriter wrLog = new BufferedWriter(new FileWriter("C:/Loggs/log.txt"));
			FileWriter wrLog = new FileWriter("C:\\Loggs\\log.txt", true);
			LocalDateTime ld = LocalDateTime.now();
			String cTime = ld.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
			
			String logStr = cTime + "\t" + logB.type.name() + "\t" + logB.textLog + "\n";
			
	//		while(true){
			wrLog.write(logStr);
			wrLog.close();
	//		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
