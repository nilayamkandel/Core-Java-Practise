package StaticAndInstance;

public class CounterWithoutStatic{
    int count = 0;

    CounterWithoutStatic(){
        count++;
    }

    private void showCount(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        // CounterWithoutStatic s1 = new CounterWithoutStatic();
        // s1.showCount();

        // CounterWithoutStatic s2 = new CounterWithoutStatic();
        // s2.showCount();

        // CounterWithoutStatic s3 = new CounterWithoutStatic();
        // s3.showCount();

        new CounterWithoutStatic().showCount();
        new CounterWithoutStatic().showCount();
        new CounterWithoutStatic().showCount();
    }

}