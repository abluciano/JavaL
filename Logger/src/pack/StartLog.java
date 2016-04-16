package pack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StartLog {

	public static void main(String[] args) throws IOException {

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

		String st;
		int j;
		double wait;
		Logger[] log = new Logger[3];
		WarningLevel wl = WarningLevel.INFO;
		final long WORK_TIME = 60000;

		for (int i = 0; i < 3; i++) {

			st = Generator.genStr();
			j = Generator.genType();
			wait = Math.round(Math.random() * 10000);

			if (wait > 5000) {
				wait = 5000;
			}

			if (j < 3) {
				wl = WarningLevel.CRITICAL;
			}
			if (j > 3 && j < 5) {
				wl = WarningLevel.INFO;
			}
			if (j > 5 && j < 7) {
				wl = WarningLevel.TRACE;
			}
			if (j > 7) {
				wl = WarningLevel.WARN;
			}

			LogBody lb = new LogBody(st, wl);
			log[i] = new Logger(lb, wait);
			log[i].start();

		}

		long timeStart = System.currentTimeMillis();
		long currTime;

		while (true) {
			currTime = System.currentTimeMillis();
			if (currTime - timeStart >= WORK_TIME) {
				for (int i = 0; i < 3; i++) {
					log[i].stopWork();
				}
				break;
			}

		}
		System.out.println("Its true!");
	}
}
