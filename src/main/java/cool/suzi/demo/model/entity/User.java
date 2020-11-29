package cool.suzi.demo.model.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private String password;
    private Date createTime;
    private String token;
    private String headImg;
    private String phone;

    public User() {
    }

    public User(String name, String password, String token) {
        this.name = name;
        this.password = password;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHead_img() {
        return headImg;
    }

    public void setHead_img(String head_img) {
        this.headImg = head_img;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", token='" + token + '\'' +
                ", head_img='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
