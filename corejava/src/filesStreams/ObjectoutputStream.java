package filesStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectoutputStream implements Serializable {
	
	private String studentName;
	private String studentId;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectoutputStream os=new ObjectoutputStream();
		os.setStudentName("prashanth");
		os.setStudentId("12r11a0488");
		
		ObjectoutputStream os1=new ObjectoutputStream();
		os1.setStudentName("sanjay");
		os1.setStudentId("12r11a04a6");
		
		FileOutputStream fos=new FileOutputStream("D:\\srinivas\\files\\sample3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(os);
		oos.writeObject(os1);
		
	
		System.out.println("success");
		
		
		FileInputStream fis=new FileInputStream("D:\\srinivas\\files\\sample3.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ObjectoutputStream o=(ObjectoutputStream)ois.readObject();
		ObjectoutputStream o1=(ObjectoutputStream)ois.readObject();
		
	
		System.out.println(o.getStudentName());
		System.out.println(o.getStudentId());
		System.out.println(o1.getStudentName());
		System.out.println(o1.getStudentId());


	}

}
