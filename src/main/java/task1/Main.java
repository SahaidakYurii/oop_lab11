package task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Yura").age(18).country(Country.UKRAINE).gender(Gender.MALE).occupation("Student").build();
        System.out.println(user);
    }
}
