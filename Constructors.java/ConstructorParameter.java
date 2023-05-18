class car {

    String name;
    String color;

    public void carInfo(){
        System.out.println(this.name);
        System.out.println(this.color);
    }
    car(String name, String color){
        this.name = name;
        this.color = color;
    }

}

public class ConstructorParameter {
    public static void main(String[] args) {
        car c1 = new car("tata","pink");
        c1.carInfo();
        car c2 = new car("suzuki","red");
        c2.carInfo();
    }
    
}
