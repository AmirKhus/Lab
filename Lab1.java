public class Clss {

    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        boolean help = true;

        if ((args.length < 4) || (args.length > 4)) {
            System.out.println("Пожалуйста, введите координаты курсора согласно примеру \n" +
                    "-x 23.4 -y 32.4" +
                    "Внимание!!! Буквы должны быть ПРОПИСНЫМИ и на английском языке.\n" +
                    "Удачной эксплуатации программы.");
            help = false;
        } else {
            for (int i = 0; i < args.length; i++) {
                if ((args[i].equals("-h")) ||
                        (args[i].equals("-help")) ||
                        (args[i].equals("-?"))) {

                    System.out.println("Программа называется 'Определятор окна 3000'" +
                            "Разработал программу - Хусаенов А.И.");

                    help = false;

                } else if (args[i].equals("-x")) {
                    x = Double.parseDouble(args[i + 1]);
                } else if (args[i].equals("-y")) {
                    y = Double.parseDouble(args[i + 1]);

                }

            }
        }

        if (help)
            System.out.println("Координаты курсора -> [" + args[1] + ";" + args[3] + "]");


        class Rectangle {
            public int rectNum;
            public double leftX;
            public double leftY;
            public double rightX;
            public double rightY;

        }

        Rectangle rect5 = new Rectangle();
        rect5.rectNum = 5;
        rect5.leftX = 16.2;
        rect5.leftY = 53.3;
        rect5.rightX = 81.1;
        rect5.rightY = 73.0;


        Rectangle rect4 = new Rectangle();
        rect4.rectNum = 4;
        rect4.leftX = 21.62;
        rect4.leftY = 12.21;
        rect4.rightX = 70.06;
        rect4.rightY = 33.04;


        Rectangle rect3 = new Rectangle();
        rect3.rectNum = 3;
        rect3.leftX = 85.5;
        rect3.leftY = 23.2;
        rect3.rightX = 99.3;
        rect3.rightY = 154.0;


        Rectangle rect2 = new Rectangle();
        rect2.rectNum = 2;
        rect2.leftX = 46.8;
        rect2.leftY = 82.4;
        rect2.rightX = 95.0;
        rect2.rightY = 86.0;


        Rectangle rect1 = new Rectangle();
        rect1.rectNum = 1;
        rect1.leftX = 10.5;
        rect1.leftY = 10.2;
        rect1.rightX = 67.99;
        rect1.rightY = 100.0;

        if (help) {

            if ((x > rect5.leftX) && (x < rect5.rightX) && (y > rect5.leftY) && (y < rect5.rightY)) {

                System.out.println("курсор расположен в " + rect5.rectNum + " окне");

            } else if ((x <= rect4.leftX) && (x >= rect4.leftX) && (y <= rect4.leftY) && (y >= rect4.leftY)) {

                System.out.println("курсор расположен в " + rect4.rectNum + " окне");

            } else if ((x <= rect3.leftX) && (x >= rect3.leftX) && ((y <= rect3.leftY) && (y >= rect3.leftY))) {

                System.out.println("курсор расположен в " + rect3.rectNum + " окне");

            } else if ((x <= rect2.leftX) && (x >= rect2.leftX) && ((y <= rect2.leftY) && (y >= rect2.leftY))) {
                System.out.println("курсор расположен в " + rect2.rectNum + " окне");

            } else if ((x <= rect1.leftX) && (x >= rect1.leftX) && ((y <= rect1.leftY) && (y >= rect1.leftY))) {
                System.out.println("курсор расположен в " + rect1.rectNum + " окне");

            } else

                System.out.println("Курсор не принадлежит ни одному из окон");


        }
    }

}
