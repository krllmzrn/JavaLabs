public class Mass {
    public static int min, max;

    public static int clVector(int Count, int[] mass){
        System.out.println("Массив:");
        for (int i = 0; i<Count; ++i)
            System.out.print(mass[i] + " ");
        System.out.println(" ");
        return Count;
    }
    public static int Max(int Count, int mass[]){
        max=mass[0];
        for(int i=0; i<Count; ++i){
            if ( mass[i]>=max)
                max=mass[i];
        }
        System.out.println("Максимальное значение:" + max);
        return max;
    }
    public static int Min(int Count, int mass[]){
        min=mass[0];
        for(int i=0; i<Count; ++i){
            if ( mass[i]<=min)
                min=mass[i];
        }
        System.out.println("Минимальное значение:" + min);
        return min;
    }
    public static int index(int Count, int mass[]){
        int index=0;
        for(int i=0; i<Count; ++i)
            if ((mass[i]==min || mass[i]==max) && i>index)
                index=i;
        System.out.println("Индекс последнего экстремального элемента:" + index);
        return index;
    }
}
