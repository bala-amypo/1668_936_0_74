package com.example.demo.entity;
@Entity
public class StudentEntity{
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String createAt;

    public void setId(Integer id){
        this.id=id;
    }
}
