public class Methods2 {
// find the odd numbers between two integers
    static boolean checkEven(int n){
        
        if(n%2 == 0){
            return false;
        }   
    return true;
    
}
public static void main(String[] args) {
int n1 = 2, n2 = 17;
for(int i = n1; i<=n2; i++){
    if(checkEven(i)){
        System.out.println(i + " ");
    }
}   
}
}
