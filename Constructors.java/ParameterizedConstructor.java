public class ParameterizedConstructor {
    String userName;
    String password;

    ParameterizedConstructor(String userName, String password){
        // this two line mean i am calling instance variable via this.
        this.userName = userName;    
        this.password = password;
        // this.result(); this statement mean i can call instance method via this
        // this();        it means calling default constructor
        // this("ram","8888") it means calling parameterised constructor
        // object ra this vanya same nai ho except one difference i.e. obj cant call constructor
        // but this can call constructor
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
