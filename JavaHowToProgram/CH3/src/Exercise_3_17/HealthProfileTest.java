package Exercise_3_17;
import Exercise_3_16.HeartRates;


public class HealthProfileTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      HealthProfile hp1 = new HealthProfile("Frank", "He", true, 1979, 3, 27, 180, 80);
      HeartRates hr1 = new HeartRates(hp1.getFirstName(), hp1.getLastName(), hp1.getYear(), hp1.getMonth(), hp1.getDate());
      System.out.printf("You Age is: %d\n",hr1.calculateAge());
      System.out.printf("You max heart rate is %d and minimum heart rate is %d.\n",hr1.maxTargetHeartRate(),hr1.minTargetHeartRate());
      System.out.println("Your BMI is: "+hp1.calculateBMI());
   }

}
