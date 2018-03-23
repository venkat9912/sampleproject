package myprojects;

class Bike extends Vehicle{  
void run(){
	System.out.println("Bike is running");
	}  
public static void stop() {
	System.out.println("Vehicle");
}
  
public static void main(String args[]){
	Vehicle.stop();
Bike obj = new Bike();  
obj.run();  
}
}
