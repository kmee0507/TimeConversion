import java.util.*;
public class TimeConversion{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a time(hh:mm:ssAM or PM): ");
      String time = sc.nextLine();
      String[] arrOfTimes = time.split(":");
      int hour = Integer.parseInt(arrOfTimes[0]);
      String seconds = arrOfTimes[2].substring(0,2);
      if(arrOfTimes[2].substring(2,4).toUpperCase().equals("PM")){
      
         if(hour == 12){
            System.out.println(hour + ":" + arrOfTimes[1] + ":"+seconds);
         }
         else{
            hour += 12;
            System.out.println(hour + ":" + arrOfTimes[1] + ":"+seconds);
         }
      }
      else if(arrOfTimes[2].substring(2,4).toUpperCase().equals("AM") && hour == 12)
         System.out.println("00" + ":" + arrOfTimes[1] + ":"+seconds);
      else
         System.out.println(hour + ":" + arrOfTimes[1] + ":"+seconds);
      
      
   
   }
}