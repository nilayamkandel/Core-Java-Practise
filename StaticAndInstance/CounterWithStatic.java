package StaticAndInstance;

public class CounterWithStatic {
    static int count = 0;

    CounterWithStatic(){
        count++;
    }
    private void showCount(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        new CounterWithStatic().showCount();
        new CounterWithStatic().showCount();
        new CounterWithStatic().showCount();
    }
}
