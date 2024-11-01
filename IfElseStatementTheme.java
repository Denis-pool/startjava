public class IfElseStatementTheme {

    public static void main(String[] args) {

        System.out.println("\n1.Перевод псевдокода на язык Java\n");

        boolean genderMale = true;
        boolean genderFemale = false;
        int age = 24;
        double height = 1.9;
        String name = "Michael";


        if (!genderMale) {
            System.out.println("Вы девушка");
        } else {
            System.out.println("Вы мужчина");
        }

        if (age > 18) {
            System.out.println("Вы совершеннолетний ");
        } else {
            System.out.println("Вы не совершеннолетний");
        }

        if (height < 1.8) {
            System.out.println("Ваш рост меньше 180 см");
        } else {
            System.out.println("Ваш рост больше 180 см");
        }

        char firstLitterName = name.charAt(0);

        if (firstLitterName == 'M') {
            System.out.println("Первая буква вашего имени - M");
        } else if (firstLitterName == 'I') {
            System.out.println("Первая буква вашего имени - I");
        } else {
            System.out.println("Первая буква вашего имени не M и не I");
        }

        System.out.println("\n2.Поиск большего числа\n");

        int num21 = 18;
        var num22 = 18;

        if (num21 == num22) {
            System.out.println("Оба числа равны " + num21 );
        } else if (num21 > num22) {
            System.out.println("Число " + num21 + " больше числа " + num22);
        } else {
            System.out.println("Число " + num22 + " больше числа " + num21);
            }

        System.out.println("\n3.Проверка числа\n");

        var checkNumber = -3;
        if (checkNumber == 0) {
            System.out.println(checkNumber + " является нулем");
        } 
        else if (checkNumber > 0) {
                if (checkNumber%2 == 0) {
                    System.out.println(checkNumber + " является положительным и четным");
                } else { 
                        System.out.println(checkNumber + " является положительным и нечетным");
                }
            } else if (checkNumber%2 == 0) {
                    System.out.println(checkNumber + " является отрицательным и четным");
                    } else {
                        System.out.println(checkNumber + " является отрицательным и нечетным");
                    }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");

        var coupleNum1 = 123;
        var coupleNum2 = 123;
        var first1 = coupleNum1/100;
        var first2 = coupleNum2/100;
        var third1 = coupleNum1 % 10;
        var third2 = coupleNum2 % 10;
        var second1 = coupleNum1/10 % 10;
        var second2 = coupleNum2/10 % 10;
        
        System.out.println("Исходные числа " + coupleNum1 + " и " + coupleNum2);
        if (first1 != first2 && second1 != second2 && third1 != third2) {
            System.out.println("Одинаковых цифр нет");
        }
        else if (first1 == first2 && second1 != second2 && third1 != third2) {
            System.out.println("Одна одинаковая цифра " + first1 + " в первом разряде");
            }
            else if (first1 != first2 && second1 == second2 && third1 != third2) {
                System.out.println("Одна одинаковая цифра " + second1 + " во втором разряде");
                }
                else if (first1 != first2 && second1 != second2 && third1 == third2) {
                    System.out.println("Одна одинаковая цифра " + third1 + " в третьем разряде");
                    }
                    else if (first1 == first2 && second1 != second2 && third1 == third2) {
                        System.out.println("Две одинаковые цифры " + first1 + " и " + third1 + " в первом и третьем разряде");
                        }
                        else if (first1 == first2 && second1 == second2 && third1 != third2) {
                            System.out.println("Две одинаковые цифры " + first1 + " и " + second1 + " в первом и втором разряде");
                            }
                            else if (first1 != first2 && second1 == second2 && third1 == third2) {
                                System.out.println("Две одинаковые цифры " + second1 + " и " + third1 + " во втором и третьем разряде");
                                }
                                else {
                                    System.out.println("Все три цифры одинаковые " + first1 + ", " + second1 + " и " + third1);
                                }

        // Сделал верхнюю задачу ооочень коряво и сложно. По другому не придумал как сделать. 

        System.out.println("\n5.Определение символа по его коду");
        // сложно 

        System.out.println("\n6.Подсчет начисленных банком %");
        var deposit = 321123.59;
        // Не полное условие задачи

        System.out.println("\n7.Определение оценки по предметам");
        var historyPercent = 59;
        var progrPercent = 92;
        var averagePercent = (double)(progrPercent + historyPercent)/2;
        int scoreHistory;
        int scoreProgr;
        double averageScore;
        if (historyPercent > 91) {
            System.out.println("История - 5");
            scoreHistory = 5;
            } else if (historyPercent <= 91 && historyPercent > 73) {
                    System.out.println("История - 4");
                    scoreHistory = 4;
                    } else if (historyPercent <= 73 && historyPercent > 60) {
                            System.out.println("История - 3");
                            scoreHistory = 3;
                            } else {
                            System.out.println("История - 2");
                            scoreHistory = 2;
                            }
        if (progrPercent > 91) {
            System.out.println("Программирование - 5");
            scoreProgr = 5;
            } else if (progrPercent <= 91 && progrPercent > 73) {
                    System.out.println("Программирование - 4");
                    scoreProgr = 4;
                    } else if (progrPercent <= 73 && progrPercent > 60) {
                            System.out.println("Программирование - 3");
                            scoreProgr = 3;
                            } else {
                                System.out.println("Программирование - 2");
                                scoreProgr = 2;
                            }
        averageScore = (double)(scoreProgr + scoreHistory) / 2;
        System.out.println("Средний бал - " + averageScore);
        System.out.println("Средний % по предметам " + averagePercent);

        /* Если бы средний бал считался относительно среднего процента, то можно было бы реализовать так: 
        if (averagePercent > 91) {
            System.out.println("Средний бал - 5");
            } else if (averagePercent <= 91 && averagePercent > 73) {
                    System.out.println("Средний бал - 4");
                    } else if (averagePercent <= 73 && averagePercent > 60) {
                            System.out.println("Средний бал - 3");
                            } else System.out.println("Средний бал - 2"); */

        System.out.println("\n8.Расчет годовой прибыли");
        var monthSale = 13025.233;
        var rentOfficeMonth = 5123.018;
        var devCostMonth = 9001.729;
        var yearProfit = (double)(monthSale - devCostMonth - rentOfficeMonth) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + String.format("%.3f", yearProfit) + " руб");
        } else System.out.println("Прибыль за год: " + String.format("%.3f", yearProfit) + " руб");
        
    }
}