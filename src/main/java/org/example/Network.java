package org.example;

public class Network {
    private Phone[] numbersUsers;

    public Network() {
        numbersUsers = new Phone[100];
    }

    public Phone[] getNumbersUsers() {
        return numbersUsers;
    }

    public void setNumbersUsers(Phone[] numbersUsers) {
        this.numbersUsers = numbersUsers;
    }

    void addNewUser(Phone newPhone) {
        for (int i = 0; i < numbersUsers.length; i++) {
            if (numbersUsers[i] != null) {
                if (numbersUsers[i].getNumber().equals(newPhone.getNumber())) {
                    System.out.println("This number is in the list of network users");
                    return;
                }
            }
        }
        for (int i = 0; i < numbersUsers.length; i++) {
            if (numbersUsers[i] == null) {
                numbersUsers[i] = newPhone;
                System.out.println("Network number registered successfully");
                return;
            }
        }
    }

    int numberCheck(String number) {
        for (int i = 0; i < numbersUsers.length; i++) {
            if (numbersUsers[i].getNumber().equals(number)) {
                return i;
            }
        }
        return -1;
    }

}
