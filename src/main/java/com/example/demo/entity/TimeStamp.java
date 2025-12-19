package com.example.demo.entity;

public class TimeStamp{
    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date createAt;
    private LocalDate updateAt;
}
