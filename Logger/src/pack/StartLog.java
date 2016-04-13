package pack;

import java.io.IOException;

public class StartLog {

	public static void main(String[] args) throws IOException {

		String st;
		int j;
		// int wait;
		WarningLevel wl = WarningLevel.INFO;
		Logger[] log = new Logger[3];
		for (int a = 0; a < 3; a++) {
			st = Generator.genStr();
			j = Generator.genType();
			// wait = j*1000;
			// if(wait > 5000){wait = 5000;}
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
			log[a] = new Logger(lb);
			log[a].start();
		}
	}

}
