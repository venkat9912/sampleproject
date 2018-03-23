package filesStreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DatainputStream {

	public static void main(String[] args) throws IOException {
   
		FileInputStream fis=new FileInputStream("D:\\srinivas\\files\\sample2.txt");
		DataInputStream dis=new DataInputStream(fis);
		 
		int count=dis.available();
		byte[] ary=new byte[count];
		dis.read(ary);
		for(byte bt:ary) {
			char k=(char)bt;
			System.out.print(k);
			
		}
		

	}

}
