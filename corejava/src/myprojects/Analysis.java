package myprojects;

import java.util.Scanner;

public class Analysis {
	
	public void processExamResult() {
		
		Scanner in=new Scanner(System.in);
		
		int passes=0;
		int failures=0;
		int studentCounter=1;
		int result;
	
	
	while(studentCounter<=10) {
		System.out.println("Enter Result(1=passes,1=failures) :");
		
		result=in.nextInt();
		
		if(result==1) 
		
			passes=passes+1;
			else
				failures=failures+1;
		
		studentCounter=studentCounter+1;
		}
	System.out.printf("Passed=%d\nFailed=%d\n",passes,failures);
	
	if(passes>8) {
		System.out.println("Raise Tuition");
	}
		
	}

	}

