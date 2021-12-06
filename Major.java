// class to form Major objects

public class Major {

      // fields
      public String major;
      public double uSalary;
      public double mSalary;
      public double pSalary;
   
      // major constructor for each major object with avg. expected salaries
      public Major(String name, double underSalary, double masterSalary, double phdSalary) {
      
         major = name;
         uSalary = underSalary;
         mSalary = masterSalary; 
         pSalary = phdSalary;
     }

     public String getMajor() {
         return major;
     }
     
     public double getUSalary() {
         return uSalary;
     }
     
     public double getMSalary() {
         return mSalary;
     }
     
     public double getPSalary() {
         return pSalary;
     }
     
}