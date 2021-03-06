package BOJ.solution;

import java.io.*;
import java.util.Scanner;

public class BOJ2480_v2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int bigger = 0, sameNum = 0, money = 0, cnt = 1, i = 0;

        while(i<3) {
            if(i<2 && numbers[i]==numbers[i+1]){
                sameNum = numbers[i];
                cnt++;
            }
            bigger = numbers[i] > bigger ? numbers[i] : bigger;
            i++;
        }

        switch(cnt){
            case 3: money += sameNum * 1000 + 10000; break;
            case 2: money += sameNum * 100 + 1000; break;
            case 1: money += bigger * 100; break;
        }
        System.out.print(money);
    }
}
