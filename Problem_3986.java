public class Problem_3986 {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] date1 = startTime.split(":");
        String[] date2 = endTime.split(":");

        int sec = Integer.parseInt(date2[2]) - Integer.parseInt(date1[2]);
        sec += 60 * (Integer.parseInt(date2[1]) - Integer.parseInt(date1[1]));
        sec += 3600 * (Integer.parseInt(date2[0]) - Integer.parseInt(date1[0]));

        return sec;
    }
}
