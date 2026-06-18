public class Problem_1344 {
    public double angleClock(int hour, int minutes) {
        double minutesD = minutes * 6;
        double hourD = (hour % 12) * 30 + minutesD / 12.0;

        double angle = Math.max(hourD, minutesD) - Math.min(hourD, minutesD);
        return Math.min(360 - angle, angle);
    }
}
