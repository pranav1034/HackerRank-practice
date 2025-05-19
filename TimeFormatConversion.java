public class TimeFormatConversion {
    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            String format = s.substring(s.length()-2);
            String[] time=s.substring(0, s.length()-2).split(":");

            int hour = Integer.parseInt(time[0]);
            int minutes = Integer.parseInt(time[1]);
            int seconds = Integer.parseInt(time[2]);

            if(format.equals("AM")){
                if(hour==12) hour=0;
            }
            else{
                if(hour!=12) hour+=12;
            }

            return String.format("%02d:%02d:%02d", hour, minutes, seconds);
        }

    }
}
