// **********************************************************************************************
// Program: .java
// Name: Ricardo Jose Sandoval
// VUnetID: sandovrj
// Section: 02
// Email: ricardo.j.sandoval@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// 12/23/2018 
// Honor statement: I attest that I understand the honor code for this class and have neither given 
//                  nor received any unauthorized aid on this assignment.
//
// Program Description:
//      
//
// **********************************************************************************************

public class TestingClient {

    public static void main(String[] args) {
        User user1 = new User();

        System.out.println(user1 + "\n");

        User user2 = new User("Ricardo", "Sandoval", 9983456,
                "2301 Vanderbilt Place");

        System.out.println(user2 + "\n");

        User user3 = new User("", "Sandoval", -2,
                "null");

        System.out.println(user3 + "\n");
    }
}
