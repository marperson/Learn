package Exercise_3_16;

public class HeartRatesTest {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      HeartRates hr1 = new HeartRates("Frank", "He", 1979, 3, 27);
      System.out.println(hr1.calculateAge());
      System.out.printf("Max heart rate is %d\nTarget Heart Rate is between %d and %d.\n",
            hr1.maxHeartRate(),hr1.minTargetHeartRate(),hr1.maxTargetHeartRate());
   }

}
