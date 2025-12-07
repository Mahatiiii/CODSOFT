import java.util.*;
public class Student_Grade_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("————————————————————————————");
        System.out.println("≥ 90% → A+ \n 80–89% → A \n 70–79% → B \n 60–69% → C \n 50–59% → D \n  < 50% → F");
        System.out.println("————————————————————————————");
        System.out.println("Enter the number of subjects");
        int n = sc.nextInt();
        int s[] = new int[n];
        int total = 0,avg =0,fail=0,pass=0,centum=0;
        System.out.println("Enter the marks for each subject out of 100");
        for(int i = 0;i < n;i++)
        {
            s[i] = sc.nextInt();
            if(s[i]>=50)
                pass++;
            else
                fail++;
            if(s[i]==100)
                centum++;
            total = total + s[i];
        }
        avg = total/n;
        System.out.println("Total Marks: " + total + "/"+(n*100));
        System.out.println("Average: " + avg + "%");
        System.out.println("Subjects Passed: " + pass);
        System.out.println("Subjects Failed: " + fail);
        System.out.println("Centums: " + centum);

        if(avg >= 90)
        {
            System.out.println("Grade: A+ ");
        }
        else if(avg >= 80)
        {
            System.out.println("Grade: A ");
        }
        else if(avg >= 70)
        {
            System.out.println("Grade: B  ");
        }
        else if(avg >= 60)
        {
            System.out.println("Grade: C ");
        }
        else if(avg >= 50)
        {
            System.out.println("Grade: D ");
        }
        else if(avg < 50)
        {
            System.out.println("Grade: F [FAIL]");
        }
    }
}




