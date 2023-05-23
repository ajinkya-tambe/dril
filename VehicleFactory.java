import java.util.*;

abstract class Vehicle 
{
	public abstract void move();
}

class Helicopter extends Vehicle 
{
	public void move() 
	{
		System.out.println("\n\nThe Helicopter Flies in Air.");
    	}
}

class Car extends Vehicle 
{
	public void move() 
	{
		System.out.println("\n\nThe Car Drives on Road.");
    	}
}

class Train extends Vehicle 
{
	public void move()
	{
		System.out.println("\n\nThe Train Runs on Track.");
    	}
}

public class VehicleFactory 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the type of vehicle (Helicopter, Car, Train): ");
		String vehicleType = input.next();
		
		Vehicle vehicle = null;

            switch(vehicleType) 
		{
			case "Helicopter":
				vehicle = new Helicopter();
                 		break;
               
			case "Car":
                 		vehicle = new Car();
                 		break;
               
			case "Train":
                 		vehicle = new Train();
                 		break;
              		
			default:
                 		System.out.println("Invalid vehicle type.");
                 		return;
           	}
		vehicle.move();
    	}
}
