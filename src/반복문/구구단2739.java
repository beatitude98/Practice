package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());


        StringBuilder result = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            // System.out.println(num + " * " + i + " = " + num * i );
            result.append(num).append(" * ").append(i).append(" = ").append(num * i).append("\n");
        }

        System.out.println(result);
    }
}
