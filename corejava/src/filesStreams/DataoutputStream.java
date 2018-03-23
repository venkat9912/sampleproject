package filesStreams;

import java.io.*;

public class DataoutputStream {

	public static void main(String[] args) throws IOException  {
		
		FileOutputStream fis=new FileOutputStream("D:\\srinivas\\files\\sample2.txt");
		DataOutputStream dos=new DataOutputStream(fis);
		dos.writeInt(123);
		dos.writeFloat(65.2f);
		dos.writeUTF("srinivas");
		

	}

}
