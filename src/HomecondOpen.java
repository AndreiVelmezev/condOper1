public class HomecondOpen {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (clientOS == 1) {
            System.out.println("Install the Android version of the app by following the link");
        }

        //Task 2
        System.out.println("Task 2");
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version of the iOS app by following the link");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version of the Android app by following the link");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Install the Android version of the app by following the link");
        }

        //Task 3
        System.out.println("Task 3");
        int year = 2020;
        if (year % 4 == 0) {
            System.out.println(year + " the year is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " the year is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " the year is not a leap year");
            } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " the year is a leap year");
            }
        } else {
            System.out.println(year + " the year is not a leap year");
        }

        //Task 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("It will take days: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("It will take days: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("It will take days: " + 3);
        }

        //Task 5
        System.out.println("Task 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
        if (monthNumber >= 13) {
            System.out.println("There is no such month");
        }
    }
}
