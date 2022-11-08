public class if
{
  public static void main (String args[])
 {
    int age;
    age=11;
    if ((age>0) && (age<10))
       {
          System.out.println("Child");
        }
    else if ((age>10) && (age<18))
       {
          System.out.println("Minor");
        }
    else
    {
          System.out.println("Eligible for voting");
        }
    }
}