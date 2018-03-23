package filesStreams;

import java.io.*;

public class JdbcSteps {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\srinivas\\files\\jdbc.txt");
		int i=0;
		while((i=fis.read())!=(-1)) {
			System.out.print((char)i);
		}
	}
}
