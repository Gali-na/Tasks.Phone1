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
        phoneOne.call("0967974965");
        phoneOne.incomingCall("0967974965");

    }
}
