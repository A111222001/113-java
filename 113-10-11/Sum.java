

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        var sum = 0;
        var number = 0;
        do {
            System.out.print("輸入數字：");
            number = Integer.parseInt(input.nextLine()); //.nextLine()表示讀出來的是字串
            sum += number;
        } while(number != 0);
        System.out.println("總合：" + sum);
    }
}
