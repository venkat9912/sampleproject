package filesStreams;

import java.io.*;
public class FileinputStream {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis=new FileInputStream("D:\\srinivas\\files\\sample.txt");
		int i=0;
		
		while((i=fis.read())!=(-1)) {
			System.out.print((char)i);
			
		}
		

	}


}
