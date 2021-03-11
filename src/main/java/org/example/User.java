package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class User {

    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

}
