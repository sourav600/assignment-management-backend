package com.moinul.tasksubmissionservice.modal;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private Long id;

    private String password;
    private String email;
    private String role;
    private String fullName;
}
