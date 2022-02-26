package com.mlr.myshop.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Integer user_id;
    private String user_name;
    private String password;
    private String loginName;
    private String email;
    private String headPath;
    private String mobileNumber;
    private Integer user_power;
}
