package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15674 {
    public static void main(String[] args) {
        String[] babbling = { "aya", "ye", "woo", "ma" };

        int num = solution(babbling);

        System.out.println(num);

    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] a = { "aya", "ye", "woo", "ma" };
        List<String> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            list.contains(a[i]);
            for (int j = 0; j < babbling.length; j++) {
                if (babbling[j].contains(a[i])) {
                    list.add(babbling[j]);
                }
            }
        }
        return answer;
    }
}
