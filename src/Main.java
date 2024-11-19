public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        int clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверно указана операционная система");
        }

        //Task 2
        String operatingSystem = "Android";
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (operatingSystem.equals("iOS")) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (operatingSystem.equals("Android")) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите приложение для " + operatingSystem);
        }


        //Task 3
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        //Task 4
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else if (deliveryDistance > 100) {
            deliveryDays = -1;
        }

        if (deliveryDays != -1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществима");
        }


        //Task 5
        int monthNumber = 12;

        if (monthNumber > 12) {
            System.out.println("В году всего 12 месяцев, введите корректный номер месяца.");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует.");
                    break;
            }
        }

    }
}