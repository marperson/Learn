package Exercise_3_17;


public class HealthProfile {
   private String firstName;

   private String lastName;

   private boolean gender;

   private int year;

   private int month;

   private int date;

   private int height;

   private int weight;

   /**
    * Constructs an empty HealthProfile
    */
   public HealthProfile(String firstName, String lastName, boolean gender,
         int year, int month, int date, int height, int weight) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.height = height;
      this.weight = weight;

      if (year <= 0) {
         System.out.println("Wrong Year!");
      }
      else {
         this.year = year;
      }
      if (month <= 0 || month > 12) {
         System.out.println("Wrong Month!");
      }
      else {
         this.month = month;
      }
      if (date <= 0 || date >= 31) {
         System.out.println("Wrong Date!");
      }
      else {
         this.date = date;
      }
   }
   
   /**
    * TODO
    * @return
    */
   public double calculateBMI(){
      double heightInMeters = (double) height/100;
      return weight/(heightInMeters*heightInMeters);
   }


   /**
    * @return Returns the firstName.
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * @param firstName The firstName to set.
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * @return Returns the lastName.
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * @param lastName The lastName to set.
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * @return Returns the gender.
    */
   public boolean isGender() {
      return gender;
   }

   /**
    * @param gender The gender to set.
    */
   public void setGender(boolean gender) {
      this.gender = gender;
   }

   /**
    * @return Returns the year.
    */
   public int getYear() {
      return year;
   }

   /**
    * @param year The year to set.
    */
   public void setYear(int year) {
      this.year = year;
   }

   /**
    * @return Returns the month.
    */
   public int getMonth() {
      return month;
   }

   /**
    * @param month The month to set.
    */
   public void setMonth(int month) {
      this.month = month;
   }

   /**
    * @return Returns the date.
    */
   public int getDate() {
      return date;
   }

   /**
    * @param date The date to set.
    */
   public void setDate(int date) {
      this.date = date;
   }

   /**
    * @return Returns the height.
    */
   public int getHeight() {
      return height;
   }

   /**
    * @param height The height to set.
    */
   public void setHeight(int height) {
      this.height = height;
   }

   /**
    * @return Returns the weight.
    */
   public int getWeight() {
      return weight;
   }

   /**
    * @param weight The weight to set.
    */
   public void setWeight(int weight) {
      this.weight = weight;
   }

}
