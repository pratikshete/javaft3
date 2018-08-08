import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputDemo {

	public static void main(String[] args) throws IOException {
		String file = "C:\\Demo/Song.txt";
		FileInputStream iStream = new FileInputStream(file);
		// array of the size of available bytes is stored 
		byte[] bar= new byte[iStream.available()]; 
		iStream.read(bar);
		String content= new String(bar);//converting byte array to  string 
		
	System.out.println(content);
		/*int ch = 0;

	
		while (true) {
			ch = iStream.read(); // reading a byte from the st
			if (ch == -1)
				break; // EOF break the loop
			System.out.println((char)ch); // printing character

		}*/
		iStream.close();
	}

}
