import java.io.Console;

public class TimeTracker {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("How much time did you spend coding yesterday?");
    String stringYesterday = console.readLine();
    Integer intYesterday = Integer.parseInt(stringYesterday);

    System.out.println("How much time did you spend coding the day before yesterday?");
    String stringDayBefore = console.readLine();
    Integer intDayBefore = Integer.parseInt(stringDayBefore);

    System.out.println("How much time did you spend coding today?");
    String stringToday = console.readLine();
    Integer intToday = Integer.parseInt(stringToday);

    Integer intTotalTime = intYesterday + intDayBefore + intToday;

    System.out.println("You spent " + intTotalTime + " hours coding in the last three days");

    if (intTotalTime > 10) {
      System.out.println("Great job! You're on track to becoming a Java pro in no time!");
    } else if (intTotalTime > 5) {
      System.out.println("You've done well, young grasshopper. Keep up the good work.");
    } else {
      System.out.println("You're slacking. Step up your game!");
    }
  }
}
