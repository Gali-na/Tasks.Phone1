package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    static Network networkTest;

    @BeforeAll
    static void beforeAll() {
        networkTest = new Network();
        Phone phoneTest = new Phone("0967974964", "Sergey", "Tsivka");
        Phone phoneTest2 = new Phone("0967974965", "Galina", "Tsivka");
        Phone phoneTest3 = new Phone("0967974966", "Nataliy", "Tsivka");
        networkTest.addNewUser(phoneTest);
        networkTest.addNewUser(phoneTest2);
        networkTest.addNewUser(phoneTest3);
    }

    @Test
    void getNumbersUsers_ReturnNetwork_IfNetworkIsntEmpty() {

        Phone phoneTest = new Phone("0967974964", "Sergey", "Tsivka");
        Phone phoneTest2 = new Phone("0967974965", "Galina", "Tsivka");
        Phone phoneTest3 = new Phone("0967974966", "Nataliy", "Tsivka");
        Phone[] testPhone = new Phone[100];
        testPhone[0] = phoneTest;
        testPhone[1] = phoneTest2;
        testPhone[2] = phoneTest3;
        assertArrayEquals(testPhone, networkTest.getNumbersUsers());
    }

    @Test
    void getNumbersUsersReturnNetwork_IfNetworkIsEmpty() {
        Network networkTest = new Network();
        Phone[] testPhone = new Phone[100];
        assertArrayEquals(networkTest.getNumbersUsers(), testPhone);
    }


    @Test
    void addNewUser() {
        Phone phoneTest = new Phone("0967974964", "Sergey", "Tsivka");
        String cousoleOutputStream = "";
        String result = "This number is in the list of network users";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, networkTest.addNewUser(phoneTest));
    }

    @Test
    void numberCheck() {
    }
}