
// 2. Вывести все простые числа от 1 до 1000

public class Task2 {

    public static void main(String[] args) {
        String res = "";
        for (int i = 2; i < 1001; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    count += 1;
            }
            if (count == 1) {
                String num = Integer.toString(i);
                res += num + " ";
            }
        }
        System.out.println(res);
    }
}
