package edu.model.entity;

import edu.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class UserEntity {
    private Long id;
    private String name;
    private Gender gender;
    private Integer contact_no;
}
