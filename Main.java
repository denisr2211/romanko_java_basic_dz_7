        /* ДЗ 7. Номера шатлов

        В Японии числа 4 и 9 считаются несчастливыми.
        Вам нужно пронумеровать 100 космических шаттлов для перевозки людей на Марс так,
        чтобы в номерах шаттлов не попадалось несчастливых чисел. Напишите функцию,
        которая выводит все номера таких шаттлов. */

        import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {

                String[] shuttle = new String[100];

                for (int i = 1; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (i != 4 && j != 4 && k != 4 && i != 9 && j != 9 && k != 9) {
                                shuttle[i] = ("Shuttle №: " + i + "" + "" + j + "" + k);
                                System.out.println(shuttle[i]);
                            }
                        }
                    }
                }
            }
        }

