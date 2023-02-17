
// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.

public class Task4 {
    public static void main(String[] args) {
        String data = "1? + ?8 = 95";
        String[] arr = data.replace(" +", "").replace(" =", "").split(" ");             
        String[] qArr = arr[0].replace("?", "0").split("");
        String[] wArr = arr[1].replace("?", "0").split("");      

        int count = 0;       
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                int q = Integer.parseInt(qArr[0] + Integer.toString(x));
                int w = Integer.parseInt(Integer.toString(y) + wArr[1]);
                int e = Integer.parseInt(arr[2]);
                if(q + w == e){
                    System.out.printf("%d + %d = %d \n", q, w, e);
                    count = 1;}
            }
        }
        if (count==0) System.out.println("Решения нет");        
    }
}
