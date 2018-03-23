package filesStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStream {
	
	
	private static String name;
	private static String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		FileoutputStream f=new FileoutputStream();
		f.setName("srinivas ");
		f.setId("123");
		int a=65;
		
		
		FileOutputStream fis=new FileOutputStream("D:\\srinivas\\files\\sample1.txt");
		 byte b[]=name.getBytes();
		fis.write(b);
		byte c[]=id.getBytes();
		fis.write(c);
		fis.write((int)a);
		
		
		System.out.println("success");
		

	}


}
