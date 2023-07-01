package StaticAndInstance;

public class staticandinstance {
    static int count =  0;
    int cnt = 0;

    staticandinstance(){
        count++;
        cnt++;
    }
    public void display(){
        System.out.println(cnt);
    }
    public void Display(){
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        staticandinstance si1 = new staticandinstance();
        si1.Display();
       
        
        staticandinstance si2 = new staticandinstance();
        si2.Display();
       
        
        staticandinstance si3 = new staticandinstance();
        si3.Display();
       
       
    }
}
