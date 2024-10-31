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
        var coupleNum2 = 223;
        var first1 = coupleNum1/100;
        var first2 = coupleNum2/100;
        var third1 = coupleNum1 % 10;
        var third2 = coupleNum2 % 10;
        var second1 = coupleNum1/10 % 10;
        var second2 = coupleNum2/10 % 10;
        
        if (first1 != first2 || second1 != second2 || third1 != third2) {
            System.out.println("Одинаковых чисел нет");
        }
        else if 
 // Очень сложно. не могу придумать как оптимально это сделать. Не хочу перебирать все варианты и делать сложную структуру ветвления
    }
}