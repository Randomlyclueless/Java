/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Student Class

// Create a Student class with:

// name
// roll number
// marks

// Add methods to:

// display details
// calculate grade
public class Practice1
{
    
static class student{
    String name;
    int roll_num;
    int marks;
    
    student(String name,int roll_num,int marks){
        this.name = name;
        this.roll_num=roll_num;
        this.marks=marks;
    }
    
    void Display(){
        System.out.println("Name : "+name);
        System.out.println("Roll_num : "+roll_num);
        System.out.println("Marks : "+marks);
    }
    

}
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		student s = new student("karan",12,55);
		s.Display();
	}
}

