import java.util.Scanner;
public class studentResultUsingArrayWithMethod {
    public static void main(String[] args) {
			
        //heading
        String []heading = {"|Student Name |", " \tMath |", "\tScience |", "\tEnglish |","\tComputer |", 
                " \tTotal |", "\tPer(%) |","\tRemarks |"};
        System.out.println("_________________________________________________________________________________________________________________");
        printHead(heading);
        System.out.println("_________________________________________________________________________________________________________________");
        
        String[] studentName = {"|  Nishant", "|  Sagar  ", "|  Ravi   ", "|  Subash  "};
        
        int[] mathMarks = {55, 60, 88, 80};
        //mathPrint(mathMarks);
        int[] scienceMarks = {68,75,77,76};
        int[] englishMarks = {54,67,65,78};
        int[] computerMarks = {68,66,70,80};
        

        studentInfo(studentName,mathMarks,scienceMarks,englishMarks,computerMarks);
        
    }

    static void printHead(String[] head) {
        
        for(int i=0; i<head.length; i++) {
            System.out.print(head[i]);
        }
        System.out.println();
    }
    
    //for printing student info
    static void studentInfo(String[] studentName, int[] mathMarks, int[] scienceMarks, 
            int[] englishMarks, int[] computerMarks) {
        for(int i=0; i<studentName.length;i++) {
            for(int j=i; j<=i;j++) {
                
                int total = mathMarks[i]+scienceMarks[i]+computerMarks[i];;
                float percentage = (total/4f);
                
                
                System.out.print(studentName[i]+"\t\t"+mathMarks[i]+"\t\t"+scienceMarks[i]+"\t\t"+
                        englishMarks[i]+"\t\t"+computerMarks[i]+"\t"+total+"\t"+percentage);
                //System.out.print("%.2f",percentage); //how to print only 2 values after decimal?
                
                if(percentage<40) System.out.println("\t\tFail    |");
                else System.out.println("\t\tPass    |");
            }
    }
        System.out.println("_________________________________________________________________________________________________________________");
        
    }
}
