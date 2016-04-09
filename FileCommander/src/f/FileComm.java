package f;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileComm {
	

	public static void main(String[] args) throws IOException {
		final String PATH = "C:/I/";
		final String FNAME = "a.txt";
		
		File f = new File(PATH+FNAME);
		if(!f.exists()) {
			Path cpath = Paths.get(PATH);
			Files.createDirectories(cpath);
			f.createNewFile();
		}
		File[] files = f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File path) {
				System.out.println(path.getName());
				return true;
			}
		});
	}

}
