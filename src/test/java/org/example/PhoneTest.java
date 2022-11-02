package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneTest {
    static Phone phoneTest;
    static Phone phoneTest2;

    @BeforeAll
    static void beforeAll() {
        phoneTest = new Phone();
        phoneTest.setNumber("0967974964");
        phoneTest.setUserName("Galina");
        phoneTest.setUserSurname("Tsivka");
        phoneTest2 = new Phone();
    }

    @Test
    void getNumbe_ReturnNumberPhone_IfPhoneExist() {
        assertEquals("0967974964", phoneTest.getNumber());
    }

    @Test
    void getNumbe_ReturnNull_IfPhoneIsNotExit() {
        Phone phoneTest2 = new Phone();
        assertEquals(null, phoneTest2.getNumber());
    }

    @Test
    void setNumber() {
        phoneTest2.setNumber("0967974964");
        assertEquals("0967974964", phoneTest2.getNumber());
    }

    @Test
    void getUserName_ReturnUserName_IfPhoneExist() {
        assertEquals("Galina", phoneTest.getUserName());
    }

    @Test
    void getUserName_ReturnNull_IfPhoneIsNotExist() {
        assertEquals(null, phoneTest2.getUserName());
    }

    @Test
    void setUserName_SetUpUserName_IfPhoneExist() {
        phoneTest2.setUserName("Galina");
        assertEquals("Galina", phoneTest2.getUserName());
    }

    @Test
    void getUserSurname_ReturnSurname_IfPhoneIsExist() {
        assertEquals("Tsivka", phoneTest.getUserSurname());
    }

    @Test
    void getUserSurname_ReturNull_IfPhoneIsNotExist() {
        assertEquals(null, phoneTest2.getUserSurname());
    }

    @Test
    void setUserSurname() {
        phoneTest2.setUserName("Tsivka");
        assertEquals("Tsivka", phoneTest.getUserSurname());
    }

    @Test
    void getNetwork() {
        Phone phoneTest3 = new Phone();
        phoneTest3.setNumber("0967974964");
        phoneTest3.setUserName("Galina");
        phoneTest3.setUserSurname("Tsivka");
        assertEquals(phoneTest3.getNetwork(), phoneTest.getNetwork());
    }

    @Test
    void onlineRegistration() {
        Network network = new Network();
        network.addNewUser(phoneTest);
        Phone phoneTest3 = new Phone();
        phoneTest3.setNumber("0967974964");
        phoneTest3.setUserName("Galina");
        phoneTest3.setUserSurname("Tsivka");
        phoneTest3.onlineRegistration();
        assertEquals(network, phoneTest3.getNetwork());
    }

    @Test
    void call() {

        String cousoleOutputStream = "";
        String result = "Subscriber call";

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
        phoneTest.onlineRegistration();
        assertEquals(result, phoneTest.call("0967974964"));
    }
}