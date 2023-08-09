package Interface;

public class test {
    public static void main(String[] args) {
        UserService us = new UserImpl();
        us.addUser();
        us.deleteUser();
        System.out.println(".......................");
        System.out.println("....................");
        System.out.println("------------------");
        System.out.println("=============");
    }
}
