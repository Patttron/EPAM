package linear.programs;

import java.util.Scanner;

public class Tasks {
    static void first() {
//      Ќайдите значение функции: z = ( (a Ц 3 ) * b / 2) + c
        double z, a = 5.33, b = 3.44, c = 8.11;
        z = ((a - 3) * b / 2) + c;
        System.out.printf("«начение выражени€, если a = %f, b = %f, c = %f равно " + z, a, b, c);
        System.out.println("\n---------------");
    }

    static void second() {
//      ¬ычислить значение выражени€ по формуле (все переменные принимают действительные значени€):
//      (b + sqrt((b*b)+4ac))/2a - a^3c +b^-2
        double a = 1, b = 2, c = 3, z;
        z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print(z);
        System.out.println("\n---------------");
    }

    static void third() {
//      ¬ычислить значение выражени€ по формуле (все переменные принимают действительные значени€):
//      (sinx +cosy)/(cosx - siny)*tgxy
        double z, x = -1.0, y = 1.0;
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.print(z);
        System.out.println("\n---------------");
    }

    static void forth() {
//      ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
//      дробную и целую части числа и вывести полученное значение числа.
        double x = 333.555;
        System.out.println("ƒано число " + x);
        double a = (x * 1000) % 1000;
        double b = (int) x / 1000.0;
        System.out.print("ѕомен€ли целую и дробную часть: " + (a + b));
        System.out.println("\n---------------");
    }

    static void fifth() {
//      ƒано натуральное число “, которое представл€ет длительность прошедшего времени в секундах. ¬ывести
//      данное значение длительности в часах, минутах и секундах в следующей форме:
//      ЌЌч ћћмин SSc.
        int t = 66555, h, min, sec;
        h = t / 3600;
        min = (t - h * 3600) / 60;
        sec = t % 60;
        System.out.println("Hours: " + h);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);
        System.out.print("T = " + t + " seconds. Time is: " + h + "h " + min + "min " + sec + "sec");
        System.out.println("\n---------------");
    }

    static void sixth() {
//      ƒл€ данной области составить линейную программу, котора€ печатает true, если точка с координатами (х, у)
//      принадлежит закрашенной области, и false Ч в противном случае:
        boolean a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scan.nextDouble();
        System.out.print("Enter y: ");
        double y = scan.nextDouble();
        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) ||
                (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
            a = true;
        } else {
            a = false;
        }
        System.out.print(a);
        System.out.println("\n---------------");
    }
}
