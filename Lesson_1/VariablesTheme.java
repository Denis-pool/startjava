import java.math.*;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера");

        byte cpuCores = 8;
        boolean isPcOn = true;
        short cpuLogiсCores = 16;
        int hddSize = 1024;
        long gpuSize = 8L;
        float cpuSpeed = 3.20F;
        double ramSize = 16;
        char nameMainHdd = 'C';

        System.out.println("\nКоличество ядер процессора - " + cpuCores);
        System.out.println("Количество логических процессоров - " + cpuLogiсCores);
        System.out.println("Скорость процессора - " + cpuSpeed + " ГГц");
        System.out.println("Размер оперативной памяти - " + ramSize + " ГБ");
        System.out.println("Размер памяти видеокарты - " + gpuSize + " ГБ");
        System.out.println("Размер памяти жесткого диска - " + hddSize + " ГБ");
        System.out.println("Системный жесткий диск - " + nameMainHdd);
        System.out.println("Компьютер включен? " + isPcOn);

        System.out.println("\n2.Расчет стоимости товара со скидкой");

        BigDecimal penCost = new BigDecimal("105.5");
        BigDecimal bookCost = new BigDecimal("235.83");
        BigDecimal disсount = new BigDecimal("0.11");

        BigDecimal baseCost = penCost.add(bookCost);
        BigDecimal discountAmount = baseCost.multiply(BigDecimal.valueOf(1).subtract(disсount));
        BigDecimal discountCost = baseCost.subtract(discountAmount);

        System.out.println("\nСтоимость ручки - " + penCost + " руб");
        System.out.println("Стоимость книги - " + bookCost + " руб");
        System.out.println("Стоимость товаров без скидки - " + baseCost + " руб");
        System.out.println("Стоимость товаров со скидкой - " + discountAmount.setScale(2, RoundingMode.HALF_UP) + " руб");
        System.out.println("Размер скидки - " + String.format("%.2f", discountCost) + " руб");

        System.out.println("\n3.Вывод слова JAVA");

        System.out.println("\n    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");

        byte numMaxByte = 127;
        System.out.println("\nПервоначальное значение переменной типа byte: " + numMaxByte);
        System.out.println("Значение после инкремента: " + ++numMaxByte);
        System.out.println("Значение после декремента: " + --numMaxByte);

        short numMaxShort = 32767;
        System.out.println("\nПервоначальное значение переменной типа short: " + numMaxShort);
        System.out.println("Значение после инкремента: " + ++numMaxShort);
        System.out.println("Значение после декремента: " + --numMaxShort);

        int numMaxInt = 2147483647;
        System.out.println("\nПервоначальное значение переменной типа int: " + numMaxInt);
        System.out.println("Значение после инкремента: " + ++numMaxInt);
        System.out.println("Значение после декремента: " + --numMaxInt);

        long numMaxLong = 9223372036854775807L;
        System.out.println("\nПервоначальное значение переменной типа Long: " + numMaxLong);
        System.out.println("Значение после инкремента: " + ++numMaxLong);
        System.out.println("Значение после декремента: " + --numMaxLong);

        char numMaxChar = 65535;
        System.out.println("\nПервоначальное значение переменной типа Char: " + numMaxChar);
        System.out.println("Значение после инкремента: " + ++numMaxChar);
        System.out.println("Значение после декремента: " + --numMaxChar);

        System.out.println("\n5.Перестановка значений переменных");

        int firstVar = 2;
        int secondVar = 5;

        System.out.println("\nИсходные значения переменных: \nA = " + firstVar + "\nB = " + secondVar);

        System.out.println("\nПерестановка переменных с помощью третьей переменной:");
        int helpingVar = firstVar;
        firstVar = secondVar;
        secondVar = helpingVar;
        System.out.println("A = " + firstVar + "\nB = " + secondVar);

        System.out.println("\nПерестановка переменных с помощью арифметических операций:");
        firstVar += secondVar;
        secondVar = firstVar - secondVar;
        firstVar -= secondVar;
        System.out.println("A = " + firstVar + "\nB = " + secondVar);

        System.out.println("\nПерестановка переменных с помощью побитовой операции ^:");
        firstVar ^= secondVar;
        secondVar ^= firstVar;
        firstVar ^= secondVar;
        System.out.println("A = " + firstVar + "\nB = " + secondVar);

        System.out.println("\n6.Вывод символов и их кодов \n");

        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + "  " + dollar);
        System.out.println((int) asterisk + "  " + asterisk);
        System.out.println((int) at + "  " + at);
        System.out.println((int) verticalBar + "  " + verticalBar);
        System.out.println((int) tilde + "  " + tilde);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка \n");

        char forwardSlash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + forwardSlash + backSlash);
        System.out.println("   " + forwardSlash + "  " + backSlash);
        System.out.println("  "+ forwardSlash + underscore + leftParenthesis + " " + rightParenthesis + backSlash);
        System.out.println(" " + forwardSlash + "      " + backSlash);
        System.out.println("" + forwardSlash + underscore + underscore + underscore + underscore + forwardSlash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8.Манипуляции с сотнями, десятками и единицами числа");

        int workNum = 123;

        int units = workNum % 10;
        int tens = (workNum / 10 ) % 10;
        int hundreds = workNum /100;

        int sum = units + tens + hundreds;
        int multpl = units * tens * hundreds;

        System.out.println("\nЧисло " + workNum + " содержит: " + "\n  сотен - " + hundreds 
                            + "\n  десятков - " + tens + "\n  единиц - " + units);
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов = " + multpl);

        System.out.println("\n9.Перевод секунд в часы, минуты и секунды");

        int totalSs = 86399;
        int ss = totalSs % 60;
        int mm = (totalSs /60) % 60;
        int hh = totalSs /3600;

        System.out.println("Исходное количество - " + totalSs + " сек.");
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}