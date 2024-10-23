public class VariablesTheme {

    public static void main(String[] args) {
        
        System.out.println("\n1.Вывод характеристик компьютера");

        // boolean, byte, short, int, long, float, double, char,

        byte CPUcores = 8;
        boolean isPCon = true;
        short CPUlogiсCores = 16;
        int HDDsize = 1024;
        long GPUsize = 8L;
        float CPUspeed = 3.20F;
        double RAMsize = 16;
        char nameMainHDD = 'C';

        System.out.println("\nКоличество ядер процессора - " + CPUcores);
        System.out.println("Количество логических процессоров - " + CPUlogiсCores);
        System.out.println("Скорость процессора - " + CPUspeed + " ГГц");
        System.out.println("Размер оперативной памяти - " + RAMsize + " ГБ");
        System.out.println("Размер памяти видеокарты - " + GPUsize + " ГБ");
        System.out.println("Размер памяти жесткого диска - " + HDDsize + " ГБ");
        System.out.println("Системный жесткий диск - " + nameMainHDD);


        System.out.println("\n2.Расчет стоимости товара со скидкой");

        /*
        ручка стоит 105,5 руб., а книга — 235,83 руб.
        вместе на них действует скидка 11%
        выведите в консоль:
        стоимость товаров без скидки
        сумму скидки
        стоимость товаров со скидкой
        */

        double penCost = 105.5;
        double bookCost = 235.83;
        double disсountBookPen = 0.11;

        double costNoDiscount = penCost + bookCost;
        double costWithDiscount = costNoDiscount * (1 - disсountBookPen);
        double costDiscount = costNoDiscount - costWithDiscount;

        double roundedCostNoDiscount = Math.round(costNoDiscount * 100.0) / 100.0;
        double roundedCostWithDiscount = Math.round(costWithDiscount * 100.0) / 100.0;

        System.out.println("\nСтоимость ручки - " + penCost + " руб");
        System.out.println("Стоимость книги - " + bookCost + " руб");
        System.out.println("Стоимость товаров без скидки - " + roundedCostNoDiscount + " руб");
        System.out.println("Стоимость товаров со скидкой - " + roundedCostWithDiscount + " руб");
        System.out.println("Размер скидки - " + String.format("%.2f", costDiscount) + " руб");

        // Вопрос - Каким методом лучше пользоваться для округления double?

        System.out.println("\n3.Вывод слова JAVA");

        // Вероятно, есть какой-то отдельный метод для такого вывода, но я его не нашел(((

        System.out.println("\n    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");

        /*
        объявите переменные всех типов, которые могут хранить целые числа
        проинициализируйте их максимально допустимыми значениями
        выведите в консоль для каждой переменной в следующем порядке:
        первоначальное значение
        значение после инкремента на единицу
        значение после декремента на единицу
        не смешивайте вывод разных типов
        */

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;

        System.out.println("\nПервоначальное значение переменной типа byte: " + numByte);
        System.out.println("Значение после инкремента: " + ++numByte);
        numByte--;
        System.out.println("Значение после декремента: " + --numByte);

        // Выглядит странно

        System.out.println("\nПервоначальное значение переменной типа short: " + numShort);
        System.out.println("Значение после инкремента: " + ++numShort);
        numShort--;
        System.out.println("Значение после декремента: " + --numShort);

        System.out.println("\nПервоначальное значение переменной типа int: " + numInt);
        System.out.println("Значение после инкремента: " + ++numInt);
        numInt--;
        System.out.println("Значение после декремента: " + --numInt);

        System.out.println("\nПервоначальное значение переменной типа Long: " + numLong);
        System.out.println("Значение после инкремента: " + ++numLong);
        numLong--;
        System.out.println("Значение после декремента: " + --numLong);

        System.out.println("\n5.Перестановка значений переменных");

        /*
        объявите две переменные типа int, присвоив им 2 и 5
        поменяйте эти значения местами следующими способами:
        с помощью третьей переменной
        с помощью арифметических операций
        с помощью побитовой операции ^
        перед началом очередных перестановок присваивать переменным исходные значения не нужно
        решение должно быть универсальным, а не привязано к конкретным значениям
        выведите в консоль для каждого способа:
        название способа перестановки
        исходные значения переменных (один раз в самом начале)
        новые значения переменных
        */

        int a = 2;
        int b = 5;

        System.out.println("\nИсходные значения переменных: \nA = " + a + "\nB = " + b);

        System.out.println("\nПерестановка переменных с помощью третьей переменной:");
        int z = a;
        a = b;
        b = z;
        System.out.println("A = " + a + "\nB = " + b);

        System.out.println("\nПерестановка переменных с помощью арифметических операций:");
        a = a + b;
        b = a - b;
        a = a - b; 
        System.out.println("A = " + a + "\nB = " + b);

        System.out.println("\nПерестановка переменных с помощью побитовой операции ^:");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("A = " + a + "\nB = " + b);

        System.out.println("\n6.Вывод символов и их кодов \n");

        char ch36 = '$';
        char ch42 = '*';
        char ch64 = '@';
        char ch124 = '|';
        char ch126 = '~';

        System.out.println((int)ch36 + "  " + ch36);
        System.out.println((int)ch42 + "  " + ch42);
        System.out.println((int)ch64 + "  " + ch64);
        System.out.println((int)ch124 + "  " + ch124);
        System.out.println((int)ch126 + "  " + ch126);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка \n");

        char d1 = '/';
        char d2 = '\\';
        char d3 = '_';
        char d4 = '(';
        char d5 = ')';

        System.out.println("    " + d1 + d2 + "    ");
        System.out.println("   " + d1 + "  " + d2 + "   ");
        System.out.println("  "+ d1 + d3 + d4 + " " + d5 + d2 +"  ");
        System.out.println(" " + d1 + "      " + d2 + " ");
        System.out.println("" + d1 + d3 + d3 + d3 + d3 + d1 + d2 + d3 + d3 + d2);

        // Возможно есть другой способ реализации, но смог только так

        System.out.println("\n8.Манипуляции с сотнями, десятками и единицами числа");

        // без цикла из числа 123 выделите сотни, десятки и единицы
        // для их получения используйте только операции / и %
        // найдите произведение и сумму выделенных цифр
        // выведите в консоль результат в формате (со всеми отступами):

        int ex8 = 123;

        int unitEx8 = ex8 % 10;
        int internEx8 = ex8 / 10;
        int tenEx8 = internEx8 % 10;
        int hundredEx8 = internEx8 /10;

        int sumEx8 = unitEx8 + tenEx8 + hundredEx8;
        int multplEx8 = unitEx8 * tenEx8 * hundredEx8;

        System.out.println("\nЧисло " + ex8 + " содержит: " + "\n  сотен - " + hundredEx8 
                            + "\n  десятков - " + tenEx8 
                            + "\n  единиц - " + unitEx8);
        System.out.println("Сумма разрядов = " + sumEx8);
        System.out.println("Произведение разрядов = " + multplEx8);

        System.out.println("\n9.Манипуляции с сотнями, десятками и единицами числа");

        int timeTotal = 86399;
        int timeSec = timeTotal % 60;
        int timeIntern = timeTotal /60;
        int timeMinute = timeIntern % 60;
        int timeHour = timeIntern /60;

        System.out.println(timeHour + ":" + timeMinute + ":" + timeSec);

    }
}