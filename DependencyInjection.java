class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // methods using userRepository
}

class UserRepository{

}

class DependencyInjection{
    public static void main(String[] args){
        // Usage
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

    }
}
