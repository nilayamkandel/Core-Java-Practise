public class ParameterizedConstructor {
    String userName;
    String password;

    ParameterizedConstructor(){}

    ParameterizedConstructor(String userName, String password){
        // this two line mean i am calling instance variable via this.
        this.userName = userName;    
        this.password = password;
    }

    void result(){
        System.out.println("username : " + userName);
        System.out.println("password : " + password);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s = new ParameterizedConstructor("neel","890");
        s.result();
    }

}
