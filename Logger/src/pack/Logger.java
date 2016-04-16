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

public class Logger extends Thread {

	LogBody logB;
	double wait;
	private boolean isActive = true;

	public Logger(LogBody logB, double wait) {

		this.logB = logB;
		this.wait = wait;
	}

	@Override
	public void run() {

		try {
			// BufferedWriter wrLog = new BufferedWriter(new
			// FileWriter("C:/Loggs/log.txt"));
			FileWriter wrLog = new FileWriter("C:\\Loggs\\log.txt", true);
			LocalDateTime ld = LocalDateTime.now();
			String cTime = ld.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));

			String logStr = cTime + "\t" + logB.type.name() + "\t" + logB.textLog + "\n";

			while (isActive = true) {
				wrLog.write(logStr);
				wrLog.close();
				try {
					sleep((long) wait);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void stopWork() {
		isActive = false;
	}

}
