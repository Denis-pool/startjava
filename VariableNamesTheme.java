public class VariableNamesTheme {

    public static void main(String[] args) {

        System.out.println("\n1.Разные переменные");

        // Цифра
        int num = 52;
        System.out.println("\nЦифра = " + num);

        // Сумма чисел
        int num2 = 23;
        int sum = num + num2;
        System.out.println("\nСумма чисел " + num + " и " + num2 + " = " + sum);
        
        // Произведение чисел
        int result = num * num2;
        System.out.println("\nПроизведение чисел " + num + " и " + num2 + " = " + result);

        // Максимальное число 
        int maxNum = 52;
        System.out.println("\nМаксимальное число - " + maxNum);

        // Количество десятков
        int countTen = 5;
        System.out.println("\nКоличество десятков = " + countTen);

        // Вес собаки
        int weightDog = 35;
        System.out.println("\nВес собаки - "+ weightDog);

        // Исходное число
        int originalNum = 52;
        System.out.println("\nИсходное число - " + originalNum);

        // Процент по вкладу
        int percentDep = 15;
        System.out.println("\nПроцент по вкладу = " + percentDep);

        // Переменная хранит символ &
        char haveAmpersand = '&';
        System.out.println("\nПеременная хранит символ " + haveAmpersand);

        // Код ошибки
        int errorCode = 502;
        System.out.println("\nКод ошибки - " + errorCode);

        // Тип сообщения 
        int messageType = 102;
        System.out.println("\nТип текущего сообщения - " + messageType);

        // Число нулей
        int countZero = 3;
        System.out.println("\nЧисло нулей в числе 1000 = " + countZero);

        // Уникальное число
        int uniqueNum = 52;
        System.out.println("\nУникальное число = " + uniqueNum);

        // Случайное число
        int randomNum = 97;
        System.out.println("\nСлучайное число = " + randomNum);

        // Математическое выражение
        String mathFormula = " x + y = c";
        System.out.println("\nМатематическое выражение " + mathFormula);

        // Счет в игре
        String gameScore = "6:2";
        System.out.println("\nСчет в игре " + gameScore);

        // Максимальная длина
        int maxLenght = 340; 
        System.out.println("\nМаксимальная длина " + maxLenght);

        // Пункт меню
        int menuPoint = 7;
        System.out.println("\nПункт меню - " + menuPoint);

        // Стоимость кофе
        int coffeeCost = 320;
        System.out.println("\nСтоимость кофе - " + coffeeCost);

        // Дата начала
        String dateStart = "25.11.2024";
        System.out.println("\nДата начала " + dateStart);

        // Окончание диапазона
        int rangeEnd = 99;
        System.out.println("\nОкончание диапазона " + rangeEnd);

        // Полное имя работника месяца
        String fullNameBestWorkerInMonth = "Walter Hartwell White";
        System.out.println("\nПолное имя работника месяца " + fullNameBestWorkerInMonth);

        // Заголовок электронной книги
        String eBookTitle = "Never Give Up";
        System.out.println("\nЗаголовок электронной книги " + eBookTitle);

        // Размер
        int size = 52;
        System.out.println("\nРазмер одежды - " + size);

        // Вместимость
        int capacity = 11;
        System.out.println("\nВместимость " + capacity);

        // Счетчик
        int counter = 52;
        System.out.println("\nСчетчик = " + counter);

        // Путь до файла
        String filePath = "D:StartJava";
        System.out.println("\nПуть до файла " + filePath);

        // Количество чисел в каждой строке
        int sumNumbersInEachRow = 51;
        System.out.println("\nКоличество чисел в каждой строке " + sumNumbersInEachRow);


        System.out.println("\n2.Boolean-переменные");

        // На текущем этапе несовсем разобрался как выводить boolean значения, поэтому решил сделать через if

        //Сотни равны? 
        boolean isHundredsEqual = true;
        if (isHundredsEqual) System.out.println("\nСотни равны");

        // Компьютер включен? 
        boolean isPCOn = true;
        if (isPCOn) System.out.println("\nКомпьютер не включен");

        // Есть разные цифры? 
        boolean hasDifferentNumbers = false;
        if (!hasDifferentNumbers) System.out.println("\nЦифры одинаковые");

        // Создано
        boolean isCreatedFile = false;
        if (!isCreatedFile) System.out.println("\nФайл не создан");

        // Пустое?
        boolean isEmptySpace = true;
        if (isEmptySpace) System.out.println("\nПространство пустое");

        // Активное? 
        boolean isActiveCell = true;
        if (isActiveCell) System.out.println("\nЯчейка активная");

        // Новое? 
        boolean isNewValue = true;
        if (isNewValue) System.out.println("\nСодержит новое значение");

        // Электронная почта действительна? 
        boolean isValidEmail = true;
        if (isValidEmail) System.out.println("\nЭлектронная почта активна");

        // Имеются уникальные строки?
        boolean isUniqueStrings = true;
        if (isUniqueStrings) System.out.println("\nИмеются уникальные строки");

        System.out.println("\n3.Аббревиатуры");

        // Точно не уверен, но, мне кажется, в аббревиатурах вид - RAMmaker лучше, чем RAMMaker или makerRAM

        // Старый universally unique identifier
        String UUIDold = "123e4567-e89b-12d3-a456-426655440000";
        System.out.println("\nСтарый UUID = " + UUIDold);

        // Производитель оперативной памяти
        String RAMmaker = "Samsung";
        System.out.println("\nПроизводитель оперативной памяти - " + RAMmaker);

        // Емкость жесткого диска
        int HDDsize = 512;
        System.out.println("\nЕмкость жесткого диска UUID = " + HDDsize);

        // Протокол передачи гипертекста
        String HTTPtype = "HTTPS";
        System.out.println("\nПротокол передачи гипертекста - " + HTTPtype);

        // Сокращенный uniform resource locator
        String URLshort = "https://javaops.ru";
        System.out.println("\nСокращенный URL - " + URLshort);

        // Новый идентификатор клиента
        int newClientID = 11224;
        System.out.println("\nНовый идентификатор клиента - " + newClientID);

        // American standard code for information interchange
        int ASCII = 128;
        System.out.println("\nASCII = " + ASCII);
    }
}