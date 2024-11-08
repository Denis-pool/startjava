import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java\n");

        boolean genderMale = true;
        if (!genderMale) {
            System.out.println("Вы девушка");
        } else {
            System.out.println("Вы мужчина");
        }

        int age = 24;
        if (age > 18) {
            System.out.println("Вы совершеннолетний ");
        } else {
            System.out.println("Вы не совершеннолетний");
        }

        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Ваш рост меньше 180 см");
        } else {
            System.out.println("Ваш рост больше 180 см");
        }

        String name = "Michael";
        char firstLitterName = name.charAt(0);
        if (firstLitterName == 'M') {
            System.out.println("Первая буква вашего имени - M");
        } else if (firstLitterName == 'I') {
            System.out.println("Первая буква вашего имени - I");
        } else {
            System.out.println("Первая буква вашего имени не M и не I");
        }

        System.out.println("\n2.Поиск большего числа\n");

        int numFirst = 18;
        int numSecond = 18;

        if (numFirst == numSecond) {
            System.out.println("Оба числа равны " + numFirst);
        } else if (numFirst > numSecond) {
            System.out.println("Число " + numFirst + " больше числа " + numSecond);
        } else {
            System.out.println("Число " + numSecond + " больше числа " + numFirst);
        }

        System.out.println("\n3.Проверка числа\n");

        int checkNumber = 4;
        if (checkNumber == 0) {
            System.out.println(checkNumber + " является нулем");
        } else if (checkNumber > 0 && checkNumber % 2 == 0) {
            System.out.println(checkNumber + " является положительным и четным");
        } else if (checkNumber > 0 && checkNumber % 2 != 0) {
            System.out.println(checkNumber + " является положительным и нечетным");
        } else if (checkNumber % 2 == 0) {
            System.out.println(checkNumber + " является отрицательным и четным");
        } else {
            System.out.println(checkNumber + " является отрицательным и нечетным");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");

        int num1 = 123;
        int num2 = 123;
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int onesNum1 = num1 % 10;
        int onesNum2 = num2 % 10;
        int tensNum1 = num1 / 10 % 10;
        int tensNum2 = num2 / 10 % 10;
        
        System.out.println("Исходные числа " + num1 + " и " + num2);
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.println("Одинаковых цифр нет");
        } else if (hundredsNum1 == hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.println("Одна одинаковая цифра " + hundredsNum1 + " в первом разряде");
        } else if (hundredsNum1 != hundredsNum2 && tensNum1 == tensNum2 && onesNum1 != onesNum2) {
            System.out.println("Одна одинаковая цифра " + tensNum1 + " во втором разряде");
        } else if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 == onesNum2) {
            System.out.println("Одна одинаковая цифра " + onesNum1 + " в третьем разряде");
        } else if (hundredsNum1 == hundredsNum2 && tensNum1 != tensNum2 && onesNum1 == onesNum2) {
            System.out.println("Две одинаковые цифры " + hundredsNum1 + " и " + onesNum1 + 
                    " в первом и третьем разряде");
        } else if (hundredsNum1 == hundredsNum2 && tensNum1 == tensNum2 && onesNum1 != onesNum2) {
            System.out.println("Две одинаковые цифры " + hundredsNum1 + " и " + 
                    tensNum1 + " в первом и втором разряде");
        } else if (hundredsNum1 != hundredsNum2 && tensNum1 == tensNum2 && onesNum1 == onesNum2) {
            System.out.println("Две одинаковые цифры " + tensNum1 + " и " + 
                    onesNum1 + " во втором и третьем разряде");
        } else {
            System.out.println("Все три цифры одинаковые " + hundredsNum1 + 
                    ", " + tensNum1 + " и " + onesNum1);
        }

        System.out.println("\n5.Определение символа по его коду");

        char checkChar = '\u0057';
        if (Character.isLetter(checkChar) && Character.toUpperCase(checkChar) == checkChar) {
            System.out.println(checkChar + " - большая буква");
        } else if (Character.isLetter(checkChar) && Character.toUpperCase(checkChar) != checkChar) {
            System.out.println(checkChar + " - маленькая буква");
        } else if (Character.isDigit(checkChar)) {
            System.out.println(checkChar + " - цифра");
        } else {
            System.out.println(checkChar + " - ни буква и ни цифра");
        }

        System.out.println("\n6.Подсчет начисленных банком %");
        BigDecimal deposit = new BigDecimal("321123.59");
        BigDecimal profit = deposit.multiply(BigDecimal.valueOf(0.07));
        
        if (deposit.compareTo(BigDecimal.valueOf(100000)) == -1) {
            profit = deposit.multiply(BigDecimal.valueOf(0.05));
        } else if (deposit.compareTo(BigDecimal.valueOf(300000)) == 1) {
            profit = deposit.multiply(BigDecimal.valueOf(0.1));
        }
        BigDecimal total = deposit.add(profit);
        System.out.println("\nСумма вклада: " + deposit + " руб");
        System.out.println("\nСумма начисленных процентов: " + 
                profit.setScale(2, RoundingMode.HALF_UP) + " руб");
        System.out.println("\nИтоговая сумма с процентами: " + 
                total.setScale(2, RoundingMode.HALF_UP) + " руб");

        System.out.println("\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int historyScore = 3;
        if (historyPercent > 91) {
            historyScore = 5;
        } else if (historyPercent <= 91 && historyPercent > 73) {
            historyScore = 4;
        } else if (historyPercent < 60) {
            historyScore = 2;
        }
        int programmingPercent = 92;
        int programmingScore = 3;
        if (programmingPercent > 91) {
            programmingScore = 5;
        } else if (programmingPercent <= 91 && programmingPercent > 73) {
            programmingScore = 4;
        } else if (programmingPercent < 60) {
            programmingScore = 2;
        }
        double averageScore = (double) (programmingScore + historyScore) / 2;
        var averagePercent = (double) (programmingPercent + historyPercent) / 2;
        System.out.println("История - " + historyScore);
        System.out.println("Программирование - " + programmingScore);
        System.out.println("Средний бал - " + averageScore);
        System.out.println("Средний % по предметам " + averagePercent);

        System.out.println("\n8.Расчет годовой прибыли");
        BigDecimal monthSale = new BigDecimal("13025.233");
        BigDecimal rentOfficeMonth = new BigDecimal("5123.018");
        BigDecimal devCostMonth = new BigDecimal("9001.729");
        BigDecimal yearProfit = ((monthSale.subtract(devCostMonth)).subtract(rentOfficeMonth))
                .multiply(BigDecimal.valueOf(12));
        if (yearProfit.compareTo(BigDecimal.valueOf(0)) == 1) {
            System.out.println("Прибыль за год: +" + 
                    yearProfit.setScale(2, RoundingMode.HALF_UP) + " руб");
        } else {
            System.out.println("Прибыль за год: " + 
                    yearProfit.setScale(2, RoundingMode.HALF_UP) + " руб");
        }
    }
}