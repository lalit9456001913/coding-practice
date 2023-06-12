package solidPrinciples;

class UserService {
    public void createUser(User user) {
        System.out.println("creating user"+user);
        // logic to create a new user
    }
}

class User{
    String name;
    public User(String name){
        this.name=name;
    }
}
class EmailService {
    public void sendEmail(String email, String message) {
        System.out.println("send email to "+ email);
        // logic to send an email
    }
}

class SingleResponsibility {
    public static void main(String[] args){
        User user=new User("lalit");
        UserService userService=new UserService();
        userService.createUser(user);

        EmailService emailService=new EmailService();
        emailService.sendEmail("lalit@gmail.com","hii this is just testing email");

    }
}