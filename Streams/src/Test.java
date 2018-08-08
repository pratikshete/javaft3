import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws InterruptedException,

			IOException {

		File source = new File("D:/io.exe");

		File dest = new File("D:/io3.exe");

		long start = System.currentTimeMillis();

		UltimatrixFastFileCopyDemo.copyFileUsingFileChannels(source, dest);

		long end = System.currentTimeMillis();

		System.out.println("Time taken by FileChannels Copy = " + (end - start));

	}
}