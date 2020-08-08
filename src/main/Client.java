/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Random;

/**
 *
 * @author rupanshu
 */

public class Client {
    String firstName, lastName, username, email, phoneNumber, password ;
    int wallet;
    
    Client (String firstName,String lastName,String username, String email, String phoneNumber, String password, int wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.wallet = wallet;
        wallet = 0;
    }    
}
