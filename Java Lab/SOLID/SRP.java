//Step 1: Define the User Class
 class User {
private String name;
private String email;

public User(String name, String email) {
this.name = name;
this.email = email;
}

public String getName() {
return name; }

public String getEmail() {
return email;
}}
//Step 2: Define the UserRepository Class

class UserRepository {
public void saveUser(User user) {
// Code to save user to database
System.out.println("User " + user.getName() + " saved to database.");
}
}
/*Step 3: Define the EmailService Class */

 class EmailService {
public void sendEmail(User user, String message) {
// Code to send email
System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
}
}
//Step 4: Main Class to Demonstrate SRP

public class SRP {
public static void main(String[] args) {
User user = new User("John Doe", "john.doe@example.com");
UserRepository userRepository = new UserRepository();
userRepository.saveUser(user);
EmailService emailService = new EmailService();
emailService.sendEmail(user, "Welcome to our platform!");
}
}