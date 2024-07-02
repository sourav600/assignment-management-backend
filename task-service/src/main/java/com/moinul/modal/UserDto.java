package com.moinul.modal;

import lombok.*;

@Data
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    private String password;
    private String email;
    private String role;
    private String fullName;
}
