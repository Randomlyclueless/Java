/******************************************************************************

    Encapsulation Example using Rectangle Class

*******************************************************************************/

class Rectangle {

    // Private variables
    // These variables cannot be accessed directly outside the class
    private int length;
    private int width;

    // Constructor
    // Used to initialize object values
    Rectangle(int length, int width) {

        // 'this.length' refers to class variable
        // 'length' refers to constructor parameter
        this.length = length;
        this.width = width;
    }

    // Setter method for length
    // Used to update length safely
    void setLength(int l) {
        if (l > 0) {
            length = l;
        }
    }

    // Setter method for width
    void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    // Getter method for length
    int getLength() {
        return length;
    }

    // Getter method for width
    int getWidth() {
        return width;
    }

    // Method to calculate area
    int getArea() {
        return length * width;
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating object
        Rectangle r = new Rectangle(10, 5);

        // Accessing values using getter methods
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());

        // Calling area method
        System.out.println("Area: " + r.getArea());

        // Updating values using setter methods
        r.setLength(20);
        r.setWidth(4);

        // New area after updating values
        System.out.println("New Area: " + r.getArea());
    }
}