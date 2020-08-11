package models;

public class User extends Base {
    private final String firstName;
    private final String lastName;

    public User(String fName, String lName) {
        super();
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
