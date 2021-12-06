// class that holds all school costs

public class School {

      // fields
      public String schoolName;
      public double rUndergradCost;
      public double rGradCost;
    
      
      // school constructor fo each school object
      public School(String name, double rUCost, double rGCost) {
      
         schoolName = name;
         rUndergradCost = rUCost;
         rGradCost = rGCost;
     }
     
     public String getSchool() {
         return schoolName;
     }
     
     public double getUCost() {
         return rUndergradCost;
     }
     
     public double getGCost() {
         return rGradCost;
     }
     
}