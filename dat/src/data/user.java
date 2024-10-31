/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author admin
 */
public class user {

    private String id;
    private String tendn; // tên đăng nhập
    private String mk;    // mật khẩu
    private String name;  // vai trò
    private String email;
    private String sdt;   // số điện thoại

    // Constructor mặc định
    public user() {}

    // Constructor đầy đủ tham số
    public user(String id, String tendn, String mk, String role, String email, String sdt) {
        this.id = id;
        this.tendn = tendn;
        this.mk = mk;
        this.name = role;
        this.email = email;
        this.sdt = sdt;
    }

    // Getter và Setter cho tất cả các thuộc tính

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}

    

