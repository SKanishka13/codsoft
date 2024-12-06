import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int numsub;
        String grade;
        System.out.println("enter the number of subjects: ");
        numsub=scan.nextInt();
        
        //array to store marks
        int[] marks= new int[numsub];
        int total=0;

        //for input
        for(int i=0; i<numsub; i++){
            System.out.println("enter marks for " + i + " subject out of 100" );
            marks[i]=scan.nextInt();
            total += marks[i];
        }
        double avg= (double) total/numsub;
         
        //for grade calculation
        if(avg>= 95){
            grade="A+";
        }else if(avg>=90){
            grade="A";
        }else if(avg>=85){
            grade="B+";
        }else if(avg>=80){
            grade="B";
        }else if(avg>=70){
            grade="C";
        }else if(avg>=60){
            grade="D";
        }else if(avg>=50){
            grade="E";
        }else{
            grade="F";
        }

        System.out.println("your results are: ");
        System.out.println("your total marks are: " + total + "out of " +(numsub*100));
        System.out.println("your average is : " +avg);
        System.out.println("your percentage is: " +(avg*100));
        System.out.println("your grade is: " +grade);

       scan.close();
    }

    
}