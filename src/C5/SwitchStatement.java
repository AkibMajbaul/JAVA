package C5;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayname;
        switch (day) {
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                    break;
              case 3:
                  dayname = "Wednesday";
                  break;
              case 4:
                     dayname = "Thursday";
                     break;
              case 5:
                     dayname = "Friday";
                     break;
              case 6:
                     dayname = "Saturday";
                     break;
              case 7:
                     dayname = "Sunday";
                     break;
                      default:
                       dayname = "Invalid day";
                       break;
        }
        System.out.println("the day is: " + dayname);
        String browserName="Chrome" ;
        switch (browserName) {
            case "Chrome":
                System.out.println("Open Chrome");
                break;

            case "edge":
                System.out.println("Open edge");
                break;

            case "Firefox":
                System.out.println("Open Firefox");
                break;

                case "Safari":
                    System.out.println("Open Safari");
                    break;
                    default:
                        System.out.println("Invalid browser name");
                        break;
        }
    }
}
