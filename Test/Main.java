public class Main {

    public static void main (String[] args) {

        // Просуммировать числа от 1 до 5

      // //  int sum = 1 + 2;
      // //  int sum1 = sum + 3;
      // //  int sum2 = sum1 + 4;
      // // int result = sum2 + 5;
      // //  System.out.println(result);


      //   System.out.print("Написано однажды, ");
      //   System.out.println("работает везде!");


        char  variable = '\u0057';
        if (Character.isLetter(variable)) {
            if (Character.toUpperCase(variable) == variable) {
                System.out.println(variable + " - большая буква");
            } else {
                System.out.println(variable + " - маленькая буква");
                }
        } else if (Character.isDigit(variable)) {
            System.out.println(variable + " - цифра");
                } else {
                    System.out.println(variable + " - ни буква и ни цифра");
        }
    }
}
