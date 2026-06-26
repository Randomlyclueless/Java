/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Rectangle Class

// Create a Rectangle class.

// Input length and breadth
// Calculate area and perimeter
import java.util.Scanner;

public class Practice2
{
    static class Rectangle{
        
        int length;
        int breadth;
        
        Rectangle(int length,int breadth){
            this.length = length;
            this.breadth = breadth;
        }
        
        int area(){
           return length*breadth;
        }
        
        int perimeter() {
            return 2 * (length + breadth);
        }
        void display() {
            System.out.println("Area: " + area());
            System.out.println("Perimeter: " + perimeter());
        }
    }
	public static void main(String[] args) {
		Scanner shape = new Scanner(System.in);
		System.out.println("Enter the Length:");
        int length = shape.nextInt();
        System.out.println("Enter the Breadth:");
        int breadth = shape.nextInt();

        Rectangle r = new Rectangle(length, breadth);

        r.display();
		
	}
}