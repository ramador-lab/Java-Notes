// Boiler Plate for Java 

public class Example 
  {
    public static void main (String args []) -> This is the method header for  the main method. The main method is where a Java application begins
    
    {
   
    }
  }
  
  // Output statement
    System.out.println()
    System.out.printf(FormatString, ArgList);
      - this method is to perform formatted console output 
      - FormatString-> is a string that contains text and/or special formatting specifiers 
      -ArgList-> is optional. It is a list of additional arguments that will be formatted according to the format specifiers listed in the format string
              -> Example: int hours;
                          System.out.printf( "I worked %d hours.", hours)
              -> %.2f= rounds decimal to the given decimal provded behind the percent sign. In this case the floating point will be rounded to two decimal points
      
      
  //Input Statement 
  - Include this like a library to the java file -> import java.util.Scanner;
  -Example:
        int output;
        Scanner sample = new Scanner (System.in);
        output = sample.nextInteger();
        
        -> Side note: When it comes to a string use .nextLine();
    
