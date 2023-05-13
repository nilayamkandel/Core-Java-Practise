
public class Methods1 {
// find the even numbers between two given number
    static boolean checkPrime(int n){
        if(n <2){
           System.out.println("not prime");
        }
        for(int i=2; i<n; i++){
                if(n%i == 0){
                    return false;
                }
            }
        
        return true;
        
    }

public static void main(String[] args) {
        for(int i = 3; i < 15; i++){
            if(checkPrime(i)){
                System.out.println(i + " ");
            }
}       
}
}
