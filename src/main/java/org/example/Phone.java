package org.example;

import java.util.Objects;

public class Phone {
    private static Network network;
    private String number;
    private String userName;
    private String userSurname;

    public Phone() {
        network = new Network();
    }

    public Phone(String number, String userName, String userSurname) {
        this.number = number;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {

        return userSurname;
    }

    public void setUserSurname(String userSurname) {

        this.userSurname = userSurname;
    }

    public Network getNetwork() {

        return network;
    }

    void onlineRegistration() {

        network.addNewUser(this);
    }

    String call(String number) {
        String rezult = "";
        if (network.numberCheck(number) != -1) {
            rezult = "Subscriber call";
        } else {
            rezult = "Subscriber does not exist";
        }
        return rezult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return number.equals(phone.number)
                && userName.equals(phone.userName)
                && userSurname.equals(phone.userSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, userName, userSurname);
    }

    @Override
    public String toString() {
        return "Phone{" + "number='" + number + '\''
                + ", userName='" + userName + '\''
                + ", userSurname='" + userSurname
                + '\'' + '}';
    }
}
