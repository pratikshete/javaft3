
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class UltimatrixFastFileCopyDemo {

	static void copyFileUsingFileChannels(File source, File dest) throws IOException {

		FileChannel inputChannel = null;

		FileChannel outputChannel = null;

		try {

			inputChannel = new FileInputStream(source).getChannel();

			outputChannel = new FileOutputStream(dest).getChannel();

			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());

		} finally {

			inputChannel.close();

			outputChannel.close();

		}

	}

}
