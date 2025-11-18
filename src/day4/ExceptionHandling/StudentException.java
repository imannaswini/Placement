package day4.ExceptionHandling;

import java.util.Scanner;

public class StudentException {
    class AgeNotWithinRangeException extends Exception
    {
        public AgeNotWithinRangeException(String message)
        {
          super(message);
        }
    }
    class NameInvalidException extends Exception
    {
        public NameInvalidException(String message)
        {
          super(message);
        }
    }
    class Student{

        int rollno,age;
        String name,course;
        public Student(int rollno,String name,int age,String course)throws AgeNotWithinRangeException,NameInvalidException
        {

            if(age<15||age>21)
            {
                throw new AgeNotWithinRangeException("Age not be found")
            }if(!name.matches("[a-zA-Z]+")
            {
                throw new NameInvalidException("Name not found")
            }

            this.rollno=rollno;
            this.name=name;
            this.age=age;
            this.course=course;
            
        public void display()

        {

        }


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno=sc.nextInt();
        String name = sc.next();
        int age =sc.nextInt();
        String course=sc.next();
       try 
       {
        Student s = new Student(rollno,name,age,course);
        s.display();
       }
        sc.close();
    }
    
}
