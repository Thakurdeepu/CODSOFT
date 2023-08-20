import java.util.Scanner;
public class GradeCalculator 
{
  // MAIN METHOD
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of subjects");
    int subject=sc.nextInt();
    System.out.println("enter the marks of the student (out of 100) in each " + subject+" subject");
    int Total=0;
    for(int i =0;i<subject;i++)
    {   
        int marks=sc.nextInt();
        Total=Total+marks;
    }
    
    //CALCULATING AVERAGE PERCENTAGE
    int Average = Total/subject;
    GradeCalculation(Average , Total);
    sc.close();
  }

  // METHOD FOR GRADE CALCULATION
  static void GradeCalculation(int Average , int Total)
  {
    char Grade=0;
    if(Average>90 && Average<=100)
    { 
      Grade='A';
    }
    else if(Average>80 && Average<=90)
    {
      Grade='B';
    }
    else if(Average>70 && Average<=80)
    {
      Grade='C';
    }
    else if(Average>60 && Average<=70)
    {
      Grade='D';
    }
    else if(Average>50 && Average<=60)
    {
      Grade='E';
    }
    else if(Average>0 && Average<=50)
    {
      Grade='F';
    }
    System.out.println("Total marks "+Total);
    System.out.println("Average_Percentage "+Average);
    System.out.println("Corresponding Grades "+ Grade);
  }
}
