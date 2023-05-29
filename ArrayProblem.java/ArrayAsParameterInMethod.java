import java.util.Scanner;
public class ArrayAsParameterInMethod {
    public static void main(String[] args) {
			
        
        System.out.println("_________________________________________________________________________________________________________________");
        System.out.println("|Student Name |  \tMath | \tScience | \tEnglish |\tComputer |  \tTotal | Per(%)   |\tRemarks |");
        System.out.println("_________________________________________________________________________________________________________________");
        

        String[] studentName = {"|  Nishant", "|  Sagar  ", "|  Ravi   ", "|  Subash  "};
        
        int[] mathMarks = {55, 60, 88, 80};
        int[] scienceMarks = {68,75,77,76};
        int[] englishMarks = {54,67,65,78};
        int[] computerMarks = {68,66,70,80};
        
        studentInfo(studentName,mathMarks,scienceMarks,englishMarks,computerMarks);
        
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
        System.out.println("________________________________________________________________________________________________________________");
        
    }
}
