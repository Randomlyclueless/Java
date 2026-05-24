// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Create a Car class.

// Variables:

// brand
// model
// speed

// Methods:

// accelerate()
// brake()
// displaySpeed()
import java.util.Scanner;

class Practice4 {
    static class Car{
        String brand;
        String model;
        int Currspeed;
        Car(String brand,String model,int Currspeed){
            this.Currspeed = Currspeed;
            this.brand = brand;
            this.model = model;
        }
        void accelerate(int speed){
            Currspeed += speed;
            System.out.println("Speed Increased to "+ Currspeed);
        }
        void brake(int speed){
            Currspeed -= speed;
            if(Currspeed<0){
                Currspeed = 0;
            }
            System.out.println("Speed Decreased to "+ Currspeed);
        }
        void DisplaySpeed(){
            System.out.println("Current Speed: " + Currspeed); 
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Car car1 = new Car("Dinoco","Dinoco AE9",80);
        boolean car = true;
        while(car){
            System.out.println("Enter the Action you want to perform : ");
            System.out.println("1.Accelerate");
            System.out.println("2.Break");
            System.out.println("3.DisplaySpeed");
            System.out.println("4.Exit");
            int choice = myObj.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Speed you want to Accelerate : ");
                    int speed = myObj.nextInt();
                    car1.accelerate(speed);
                    break;
                case 2:
                    System.out.println("Enter Speed you want to Deccelerate : ");
                    int speed2= myObj.nextInt();
                    car1.brake(speed2);
                    break;
                case 3:
                    System.out.println("current Speed : ");
                    car1.DisplaySpeed();
                    break;
                case 4:
                    car = false;
                    System.out.println("Program Ended");
                    break;
                default:
                System.out.println("Invalid Choice");
            }   
        }
        myObj.close();
    }
}