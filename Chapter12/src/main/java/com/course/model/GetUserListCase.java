package com.course.model;

import lombok.Data;

@Data
public class GetUserListCase {
    private int id;
    private String userName;
    private String sex;
    private String age;
    private String expected;
}
