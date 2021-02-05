package branch.programs;

import java.util.Scanner;

public class Branch {
    static void task1() {
        System.out.println("Даны два угла треугольника (в градусах)." +
                "Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
        Scanner scan = new Scanner(System.in);
        for ( ; ; ) {
            System.out.print("Enter first value of angle: ");
            double a = scan.nextDouble();
            System.out.print("Enter second value of angle: ");
            double b = scan.nextDouble();
            if (a + b < 180) {
                System.out.print("This triangle exists");
                if (a == 90 || b == 90) {
                    System.out.println(", and it is rectangular.");
                } else {
                    System.out.println(", but it isn't rectangular.");
                }
                return;
            } else {
                System.out.println("Such a triangle cannot be. Try again");
            }
        }
    }

    static void task2() {
        System.out.println("\n---------------");
        System.out.println("Найти max{min(a, b), min(c, d)}.");
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter c: ");
        int c = scan.nextInt();
        System.out.print("Enter d: ");
        int d = scan.nextInt();
        x = Math.min(a, b);
        y = Math.min(c, d);
        System.out.println(Math.max(x, y));
        System.out.println("\n---------------");
    }

    static void task3() {
        System.out.println("Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.");
        double x1, x2, x3, y1, y2, y3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point: ");
        System.out.print("Enter x1: ");
        x1 = scan.nextDouble();
        System.out.print("Enter y1: ");
        y1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the first point: ");
        System.out.print("Enter x2: ");
        x2 = scan.nextDouble();
        System.out.print("Enter y2: ");
        y2 = scan.nextDouble();
        System.out.println("Enter the coordinates of the first point: ");
        System.out.print("Enter x3: ");
        x3 = scan.nextDouble();
        System.out.print("Enter y3: ");
        y3 = scan.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.print("Third point is on the straight");
        } else {
            System.out.print("Third point isn't on the straight");
        }
        System.out.println("\n---------------");
    }

    static void task4() {
        System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича." +
              " Определить, пройдет ли кирпич через отверстие.");
        double a, b, x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of the hole:");
        System.out.print("Enter a: ");
        a = scan.nextDouble();
        System.out.print("Enter b: ");
        b = scan.nextDouble();
        System.out.println("Size of the brick:");
        System.out.print("Enter x: ");
        x = scan.nextDouble();
        System.out.print("Enter y: ");
        y = scan.nextDouble();
        System.out.print("Enter z: ");
        z = scan.nextDouble();
        if (a >= x && b >= y || a >= x && b >= z ||
                a >= y && b >= z || a >= y && b >= x ||
                a >= z && b >= x || a >= z && b >= y) {
            System.out.print("Brick crawl through the hole");
        } else {
            System.out.print("Brick don't crawl through the hole");
        }
        System.out.println("\n---------------");
    }

    static void task5() {
        System.out.println("Вычислить значение функции: " +
                "F(x) = x^2-3x+9, если x<=3 и 1/(x^3+6), если x>3");
        double x, a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = scan.nextDouble();
        if (x <= 3) {
            a = x * x - 3 * x + 9;
            System.out.print("Answer of function: " + a);
        } else {
            a = 1 / (Math.pow(x, 3) + 6);
            System.out.print("Answer of function: " + a);
        }
        System.out.println("\n---------------");
    }
}
