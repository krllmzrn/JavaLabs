import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int Count = scan.nextInt();
        System.out.println("Введите элементы массива:");
        int mass[] = new int [Count];
        for(int i=0; i<Count; ++i)
            mass[i]= scan.nextInt();
        Mass massiv= new Mass();
        massiv.clVector(Count,mass);
        massiv.Max(Count,mass);
        massiv.Min(Count,mass);
        massiv.index(Count,mass);
    }
}
