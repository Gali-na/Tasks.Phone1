package org.example;

import java.util.Arrays;

public class Network {
    private Phone[] numbersUsers;

    public Network() {
        numbersUsers = new Phone[100];
    }

    public Phone[] getNumbersUsers() {
        return numbersUsers;
    }

    String addNewUser(Phone newPhone) {
        for (int i = 0; i < numbersUsers.length; i++) {
            if (numbersUsers[i] != null) {
                if (numbersUsers[i].getNumber().equals(newPhone.getNumber())) {
                    return "This number is in the list of network users";

                }
            }
        }
        for (int i = 0; i < numbersUsers.length; i++) {
            if (numbersUsers[i] == null) {
                numbersUsers[i] = newPhone;
                return "Network number registered successfully";
            }
        }
        return null;
    }

    int numberCheck(String number) {
        for (int i = 0; i < numbersUsers.length; i++) {
            if (numbersUsers[i] != null) {
                if (numbersUsers[i].getNumber().equals(number)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Network network = (Network) o;
        return Arrays.equals(getNumbersUsers(), network.getNumbersUsers());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getNumbersUsers());
    }
}
