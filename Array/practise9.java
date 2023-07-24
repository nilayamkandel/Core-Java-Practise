package Array;

//Write a Java program to find the index of an array element.
public class practise9 {

    static int findNum(int[] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;                
            }          
        }
        System.out.println("----");
        return -1;
    }


    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int item = 7;
        System.out.println(findNum(arr, item));       
    }
 
}
