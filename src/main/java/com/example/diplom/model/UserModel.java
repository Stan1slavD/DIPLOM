package com.example.diplom.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {

    private Integer id;

    private String firstName;

    private String lastName;

    public static UserModel toModel (User user){
        return UserModel.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
}
