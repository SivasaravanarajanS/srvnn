import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class diffintime {
public static void main(String[] args) {
String time1 = "2:10:50";
String time2 = "2:15:50";

SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
Date date1 = format.parse(time1);
Date date2 = format.parse(time2);
long difference = date2.getTime() - date1.getTime();
long diffSeconds = (long) (difference / 1000 % 60);
long diffMinutes = (long) (difference / (60 * 1000) % 60);
long diffHours = (long) (difference / (60 * 60 * 1000) % 24);

System.out.print(diffHours + " hours, ");
System.out.print(diffMinutes + " minutes, ");
System.out.print(diffSeconds + " seconds.");
}
}
