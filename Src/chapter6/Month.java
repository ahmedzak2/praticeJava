package chapter6;

public class Month {
    /**
     * i can  more than one method has  same name, but it must be different in paramters
     */
    public static String getMonth(int month) {
        switch (month) {
            case 1:
                return "january";
            case 2:
                return "february";
            case 3:
                return "march";
            case 4:
                return "april";
            case 5:
                return "may";
            case 6:
                return "june";
            default: return "Invalid month. Please enter a value between 1 and 12.";
        }
    }

        public static int getMonth (String month){
          switch (month){
              case "January": return 1;
              default: return -1;
          }
        }
}

