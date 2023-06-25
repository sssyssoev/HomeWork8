
public class Main {
    public static void main(String[] args) {
        System.out.println("        ");
        System.out.println("Printout for Homework №8");
        Task1();
        Task2();
        Task3();
        Task4();


    }

    public static void Task1() {

        System.out.println("        ");
        System.out.println("No printout for Task1");

        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        double[] arrDouble = {1.57, 7.654, 9.986};
        char[] arrChar = {'a', 'b', 'c'};

    }

    public static void Task2() {

        System.out.println("        ");
        System.out.println("Printout for Task2");
        int[] arrInt = {1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        char[] arrChar = {'a', 'b', 'c'};
        int arrIntSize = arrInt.length;
        int arrDoubleSize = arrDouble.length;
        int arrCharSize = arrChar.length;

        for (int i = 0; i < arrIntSize - 1; i++)
            System.out.printf(arrInt[i] + " , ");
        System.out.println(arrInt[arrIntSize - 1]);

        for (int i = 0; i < arrDoubleSize - 1; i++)
            System.out.printf(arrDouble[i] + " , ");
        System.out.println(arrDouble[arrDoubleSize - 1]);

        for (int i = 0; i < arrCharSize - 1; i++)
            System.out.printf(arrChar[i] + " , ");
        System.out.println(arrChar[arrCharSize - 1]);

    }

    public static void Task3() {

        System.out.println("        ");
        System.out.println("Printout for Task3");
        int[] arrInt = {1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        char[] arrChar = {'a', 'b', 'c'};
        int arrIntSize = arrInt.length;
        int arrDoubleSize = arrDouble.length;
        int arrCharSize = arrChar.length;

        for (int i = arrIntSize - 1; i > 0; i--)
            System.out.printf(arrInt[i] + " , ");
        System.out.println(arrInt[0]);

        for (int i = arrDoubleSize - 1; i > 0; i--)
            System.out.printf(arrDouble[i] + " , ");
        System.out.println(arrDouble[0]);

        for (int i = arrCharSize - 1; i > 0; i--)
            System.out.printf(arrChar[i] + " , ");
        System.out.println(arrChar[0]);

    }

    public static void Task4() {

        System.out.println("        ");
        System.out.println("Printout for Task4");
        int[] arrInt = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10, 0};
        int odd;
        int arrIntSize = arrInt.length;


        for (int i = 0; i < arrIntSize ; i++) {

            if (arrInt[i]==0) arrInt[i]=arrInt[i]+2;

            odd=arrInt[i] % 2;

            if (odd !=0) arrInt[i]=arrInt[i]+1;
            System.out.printf(arrInt[i] + " , ");


        }
        System.out.println("Если значение элемента массива =0, то прибавляем 2");
        System.out.println("ДЗ 38 будем сдавать");
    }
}
