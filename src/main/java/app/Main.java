package app;

import models.LocalDirectory;
import models.LocalFile;

import java.io.File;

/**
 * @author dzimiks
 * Date: 13-04-2019 at 15:33
 */
public class Main {

	public static void main(String[] args) {
		LocalDirectory storage = new LocalDirectory();
		storage.create("storage", "/Users/dzimiks/Desktop/projects/file-storage-local-app/src/main/java");
		String storagePath = storage.getPath().toString();

		LocalDirectory localDirectory = new LocalDirectory();

		localDirectory.create(
				"UUP2018-januar",
				storagePath
		);

		localDirectory.create(
				"grupa1",
				storagePath + File.separator + "UUP2018-januar"
		);

		localDirectory.create(
				"grupa2",
				storagePath + File.separator + "UUP2018-januar"
		);

		LocalFile localFile = new LocalFile();

		localFile.create(
				"storage.txt",
				storagePath
		);

		localFile.create(
				"grupa1.txt",
				storagePath + File.separator + "UUP2018-januar" + File.separator + "grupa1"
		);

		localFile.create(
				"grupa2.txt",
				storagePath + File.separator + "UUP2018-januar" + File.separator + "grupa2"
		);
	}
}
