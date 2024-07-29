import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        int numSubj; 
        double averageMarks; 
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of subjects:");
        numSubj = scanner.nextInt();

    
        double[] marks = new double[numSubj];
        double totalMarks = 0;

        for (int i = 0; i < numSubj; i++) 
        {

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }
        averageMarks = totalMarks / numSubj;

      
        char grade;

        if (averageMarks >= 90) {
            grade = 'S';
        }
        else if (averageMarks >= 80) {
            grade = 'A';
        }
        else if (averageMarks >= 70) {
            grade = 'B';
        }
        else if (averageMarks >= 60) {
            grade = 'C';
        }
        else if (averageMarks >= 50){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        
        System.out.println("Total Marks: " + totalMarks);

        System.out.println("Average Marks: " + averageMarks);

        System.out.println("Your Grade: " + grade);
    }
}
