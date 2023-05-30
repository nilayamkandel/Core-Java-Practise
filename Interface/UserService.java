package Interface;
// wap to show interface and implementation of interface


//  we use Service in last whenever we are making file of interface.
public interface UserService {

// here we can only use public abstract method. using any other access modifier will give error.
    void addUser();
    void deleteUser();

    int Max = 300;


}
