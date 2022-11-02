package org.example;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

        Phone phoneOne = new Phone();
        phoneOne.setNumber("0967974964");
        phoneOne.setUserName("Galina");
        phoneOne.setUserSurname("Tsivka");

        Phone phoneTwo = new Phone();
        phoneOne.setNumber("0967974965");
        phoneOne.setUserName("Anton");
        phoneOne.setUserSurname("Zolotan");

        phoneOne.onlineRegistration();
        System.out.println(phoneOne.call("0967974965"));
        System.out.println(phoneOne.call("09679749656"));
    }
}
