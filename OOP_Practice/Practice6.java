
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 7. Password Manager

// Create a class where password cannot be accessed directly.

// Use getter/setter methods carefully.

import java.util.Scanner;
class Practice6 {
    static class pwdmanager{
        private String password;
        
        void setPassword(String password){
            this.password = password;
        }
        String getPassword(){
            return password;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pwdmanager user = new pwdmanager();
        System.out.println("Enter Password : ");
        String pass = sc.nextLine();
        user.setPassword(pass);
        
        System.out.println("Stored Password: " + user.getPassword());
    }
}