package enums;

public class EnumTest {
    public static void main(String[] args) {
         Week sunday = Week.valueOf("SUNDAY");
         System.out.println(getDaySituation(sunday));
         
         for (Week week : Week.values()) {
             System.out.println(week.name() +" ："+ week.getDay());
         }
         
         for (Week week : Week.values()) {
             System.out.println(week);//override toString method
         }
    }
    
    public static String getDaySituation(Week day) {
        String situation;
        switch (day) {
            case MONDAY:
                situation = "Mondays are bad.";
                break;
        
            case FRIDAY:
                situation = "Fridays are better.";
                break;
        
            case SATURDAY: case SUNDAY:
                situation = "Weekends are best.";
                break;
        
            default:
                situation = "Midweek days are so-so.";
                break;
        }
        return situation;
    }
}
