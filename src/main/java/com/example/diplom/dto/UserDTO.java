package com.example.diplom.dto;

public record UserDTO(Integer id, String firstName, String lastName, String email, String resumeName) {
   public String isResumeExist(){
       if (resumeName.isEmpty()) {
           return "NONE";
       }
       return resumeName;
   }
}
