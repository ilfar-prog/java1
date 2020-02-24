package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
//        String number_string;
//        number_string = Integer.toString(number);
        int ostatok;
        int chast = number;
        do {
            ostatok = chast % 10;
            chast = chast / 10;
//            System.out.println(chast);
//            System.out.println(ostatok);
            if (ostatok == digit || ostatok == -1*digit) {
                return true;

            }
        } while (chast != 0);
return false;

    }

    public static int fiboNumber(int n){
        if (n == 1 || n == 2)
            return 1;
        else {
            int predpred = 1;
            int pred = 1;
            int i_number = 0;
            for (int i = 3; i <= n; i++) {
                i_number = predpred + pred;
                predpred = pred;
                pred = i_number;
            }
            return i_number;
        }
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        double a_d = (double)a;
        double b_d = (double)b;
        double c_d = (double)c;
        if (a == b || a == c || b == c) {
            if (a == b) {
                if ((a_d / c_d > 1.61703) && (a_d / c_d < 1.61903))
                    return true;
            } else if (a == c) {
                if ((a_d / b_d > 1.61703) && (a_d / b_d < 1.61903))
                    return true;
            } else if (b == c) {
                if ((b_d / a_d > 1.61703) && (b_d / a_d < 1.61903))
                    return true;
            } else
                return false;
        }
//            else
//                return false;
            return false;
        }




    public static void main(String[] args) {

//        System.out.println(containsDigit(-12345,6 ));
//        System.out.println(fiboNumber(2));
//        System.out.println(isGoldenTriangle(1, 2, 3));
        int numberFibo = 15;
        System.out.println("Первые " + numberFibo + " чисел Фибоначчи:");
        for(int i = 1; i <= 15; i++){
            System.out.println(fiboNumber(i));

        }
        int a = 0;


        int i = 0;
        while(a < 100){
            a++;
            int b = 0;
            while(b < 100){
                b++;
                int c = 0;
                while(c < 100){
                    c++;
                    if (isGoldenTriangle(a, b, c) == true){
                        System.out.println("Стороны золотого треугольника: " + a + " " + b + " " + c);
                    }
//                    System.out.println(isGoldenTriangle(a, b, c));
                }
            }


        }
    }
}
