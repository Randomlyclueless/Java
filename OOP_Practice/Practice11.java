// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 17. Library Management System

// Classes:

// Book
// Member
// Library

// Features:

// issueBook()
// returnBook()
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Practice11 {

    // Book Class
    static class Book {

        String bookName;
        boolean isIssued = false;

        Book(String bookName) {
            this.bookName = bookName;
        }
    }

    // Member Class
    static class Member {

        String memberName;

        Member(String memberName) {
            this.memberName = memberName;
        }
    }

    // Library Class
    static class Library {

        // Issue Book
        void issueBook(Book b, Member m) {

            if(b.isIssued == false) {

                b.isIssued = true;

                System.out.println(
                    m.memberName +
                    " issued the book: " +
                    b.bookName
                );
            }
            else {

                System.out.println(
                    "Book already issued"
                );
            }
        }

        // Return Book
        void returnBook(Book b, Member m) {

            b.isIssued = false;

            System.out.println(
                m.memberName +
                " returned the book: " +
                b.bookName
            );
        }
    }

    public static void main(String[] args) {

        // Objects
        Book b1 = new Book("Java Programming");

        Member m1 = new Member("Raj");

        Library lib = new Library();

        // Issue Book
        lib.issueBook(b1, m1);

        // Return Book
        lib.returnBook(b1, m1);
    }
}