package application.model;

import java.time.LocalDate;
import java.util.Set;

public class Member {
    private String email;
    private String username;
    private String password;
    private LocalDate dateJoined;
    private boolean isAdmin;
    private Set<String> groups;

    public Member(String email, String username, String password, boolean isAdmin, Set<String> groups) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.groups = groups;
    }

    public Member(String email, String username, String password, LocalDate dateJoined, boolean isAdmin, Set<String> groups) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.dateJoined = dateJoined;
        this.isAdmin = false;
        this.groups = groups;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Set<String> getGroups() {
        return groups;
    }

    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateJoined=" + dateJoined +
                ", isAdmin=" + isAdmin +
                ", groups=" + groups +
                '}';
    }

}
