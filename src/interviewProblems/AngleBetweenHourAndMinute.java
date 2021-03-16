package interviewProblems;

public class AngleBetweenHourAndMinute {
    public static void main(String[] args) {
        double angle = solution(1,3);
        System.out.println(angle);
    }

    private static double solution(int hour, int minute) {

        int DEGREE_CHANGE_MINUTE = 6;

        double hourAngle = (hour % 12 + (double) minute /60) * 30;
        double minuteAngle = minute * DEGREE_CHANGE_MINUTE;

        double diff = Math.abs(minuteAngle-hourAngle);

        if (diff > 180) {
            diff = 360 - diff;
        }

        return diff;

    }
}
