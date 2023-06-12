package solidPrinciples;


class UserRepository {
    // implementation details
}

class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // methods using userRepository
}
public class DIP {
    public static void main(String[] args){
        UserRepository obj=new UserRepository();
        UserService userService=new UserService(obj);
    }
}