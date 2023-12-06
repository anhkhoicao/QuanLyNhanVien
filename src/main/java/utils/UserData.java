/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author caube
 */
//tạo 1 class để lưu thông tin đăng nhập vào 1 file
//khi khởi động login form sẽ chạy file này để check xem người dùng đã
//đc remember hay chưa
public class UserData implements Serializable {

    private String username;
    private String password;
    private boolean rememberMe;

    private static final String FILE_PATH = "./src/main/resources/data/user_data.txt";

    public UserData(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public UserData() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Override
    public String toString() {
        return "UserData{" + "username=" + username + ", password=" + password + ", rememberMe=" + rememberMe + '}';
    }

    public void saveUserData() {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(this);
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static UserData loadUserData() {
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            UserData userData;
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                userData = (UserData) ois.readObject(); //gán object đã đọc từ file vào UserData
            } //gán object đã đọc từ file vào UserData
            return userData;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

    

}
