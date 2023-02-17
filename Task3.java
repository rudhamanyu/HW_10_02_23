// 3. Реализовать простой калькулятор

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.printf("Enter an action: ");
        String data = scr.nextLine();
        double res = 0;       
        if (data.contains("+")){
            String[] arr = data.replace("+", " ").split(" ");
            res = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);            
        }
        else if (data.contains("-")){
            String[] arr = data.split("-");
            res = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);            
        }
        else if (data.contains("/")){
            String[] arr = data.split("/");
            res =Double.parseDouble(arr[0]) / Integer.parseInt(arr[1]);           
        }
        else if (data.contains("*")){
            String[] arr = data.replace("*", " ").split(" ");
            res = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);            
        }
        String r = Double.toString(res);
        String[] ar = r.replace(".", " ").split(" ");
        if (Integer.parseInt(ar[1]) == 0) System.out.print(ar[0]);
        else System.out.print(res);
        scr.close();
    }
}