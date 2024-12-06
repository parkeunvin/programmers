package pcc;

public class pccp340213 {

    public static void main(String[] args) {
        String video_len = "10:55";
        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";
        String[] commands = { "prev", "next", "next" };

        String num = solution(video_len, pos, op_start, op_end, commands);

        System.out.println(num);

    }

    static int op_s;
    static int op_e;

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video = timeToseconds(video_len);
        int now = timeToseconds(pos);
        op_s = timeToseconds(op_start);
        op_e = timeToseconds(op_end);
        for (int i = 0; i < commands.length; i++) {

            now = time_check(now);

            switch (commands[i]) {
                case "next":
                    now = (video - now <= 10) ? 0 : now + 10;
                    now = time_check(now);
                    break;
                case "prev":
                    now = (now <= 10) ? 0 : now - 10;
                    now = time_check(now);
                    break;

            }
        }
        answer = secondsToTime(now);

        return answer;
    }

    static int time_check(int now) {
        if (now >= op_s && now <= op_e) {
            now = op_e;
        }
        return now;
    }

    static int timeToseconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    static String secondsToTime(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }

}
