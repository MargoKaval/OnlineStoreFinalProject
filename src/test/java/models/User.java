package models;

public class User {
    private String username;
    private String password;

    public User(String email, String paswrd) {
        this.username = email;
        this.password = paswrd;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
