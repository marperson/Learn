package Exercise_3_16;

import java.time.LocalDate;
import java.time.Period;

/**
 * TODO describe object purpose
 * 
 * @author frank.he
 */
public class HeartRates {
   private String firstName;

   private String lastName;

   private int year;

   private int month;

   private int date;

   /**
    * @param firstName
    * @param lastName
    * @param year
    * @param month
    * @param date
    */
   public HeartRates(String firstName, String lastName, int year, int month,
         int date) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
      if (year < 0) {
         this.year = 0;
         System.out.println("Wrong year");
      }
      else {
         this.year = year;
      }

      if (month < 0 || month > 12) {
         this.month = 0;
         System.out.println("Wrong month");
      }
      else {
         this.month = month;
      }

      if (date < 0 || date > 31) {
         this.date = 0;
         System.out.println("Wrong date");
      }
      else {
         this.date = date;
      }
   }

   /**
    * TODO
    * 
    * @return
    */
   public int calculateAge() {
      if (year == 0 || month == 0 || date == 0) {
         return 0;
      }
      else {
         // calculate birthday
         LocalDate today = LocalDate.now();
         LocalDate birthday = LocalDate.of(year, month, date);
         Period p = Period.between(birthday, today);
         return p.getYears();
      }

   }

   /**
    * TODO
    * 
    * @return
    */
   public int maxHeartRate() {
      return 220 - calculateAge();
   }

   /**
    * TODO
    * 
    * @return
    */
   public int minTargetHeartRate() {
      return (int) Math.round(maxHeartRate() * 0.5);
   }

   /**
    * TODO
    * 
    * @return
    */
   public int maxTargetHeartRate() {
      return (int) Math.round(maxHeartRate() * 0.85);
   }

   /**
    * @return the firstName
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * @param firstName the firstName to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * @return the lastName
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * @param lastName the lastName to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * @return the year
    */
   public int getYear() {
      return year;
   }

   /**
    * @param year the year to set
    */
   public void setYear(int year) {
      if (year < 0) {
         this.year = 0;
      }
      else {
         this.year = year;
      }
   }

   /**
    * @return the month
    */
   public int getMonth() {
      return month;
   }

   /**
    * @param month the month to set
    */
   public void setMonth(int month) {
      if (month < 0 && month > 12) {
         this.month = 0;
      }
      else {
         this.month = month;
      }
   }

   /**
    * @return the date
    */
   public int getDate() {
      return date;
   }

   /**
    * @param date the date to set
    */
   public void setDate(int date) {
      if (date < 0) {
         this.date = 0;
      }
      else {
         this.date = date;
      }
   }

}
