public class MinutesToYearsDays5 {
      public static void main(String[] args) {
        long minutes = 3456789;

        long minutesInDay = 60 * 24;
        long minutesInYear = minutesInDay * 365;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
}
}