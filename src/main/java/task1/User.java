package task1;

import lombok.*;

import java.util.List;

@ToString @Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private Country country;

    @Singular
    private List<String> occupations;

}
