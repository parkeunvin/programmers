package test;

public class Q16258 {
    public int[] solution() {
        int[] answer = {};
        String s = "110010101001";

        do {
            s.replace("0", null);

            // 이진수를 10진수로 변환
            int decimal = Integer.parseInt(s, 2);

            answer[0] += 1;
            answer[1] = Integer.parseInt(Integer.toHexString(decimal), 16);
        } while (s.contains("0"));

        System.out.println(s);
        return answer;
    }
}
