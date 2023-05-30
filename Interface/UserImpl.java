package Interface;

public class UserImpl implements UserService{

    @Override
    public void addUser() {
        System.out.println("i am user");
    }

    @Override
    public void deleteUser() {
        System.out.println("i delete user");
    }
    
}
