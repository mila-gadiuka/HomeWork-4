public class Main {
            public static void main(String[] args) {
                System.out.println("Первое задание");

                byte me = 17;
                System.out.println("Вам " + me );
                if (me>=18) {
                    System.out.println("Поздравляем с совершеннолетием!");
                }
                if (me<18) {
                    System.out.println("Ваш возраст совершеннолетия не наступил, немного подождите");
                }

                System.out.println("Второе задание");

                byte you = 24;
                System.out.println("Вам " + you );
                if (you>=7 && you<18) {
                    System.out.println("Вы еще ходите в школу");
                }
                if (you>=18 && you<24) {
                    System.out.println("Вы закончили школу можете отправляться в университет");
                }
                if (you>=24) {
                    System.out.println("Вы окончили университет пора искать первую работу");
                }

                System.out.println("Третье задание");

                byte position = 105;
                byte capacity = 102;
                byte sittingCapacity = 60;
                if (position <= sittingCapacity) {
                    System.out.println("Сидячие места");
                }
                if (position > sittingCapacity && position <= capacity) {
                    System.out.println("Стоячие места");
                }
                if (position > capacity) {
                    System.out.println("Мест нет");
                }

                System.out.println("Четвертое задание");

                byte nona = 17;
                System.out.println("Вам " + nona );
                if (nona>=18) {
                    System.out.println("Поздравляем с совершеннолетием!");
                }
                else {
                    System.out.println("Ваш возраст совершеннолетия не наступил, немного подождите");
                }

                System.out.println("Пятое задание");

                byte momLol = 24;
                System.out.println("Вам " + momLol );
                if (momLol>=7 && momLol<18) {
                    System.out.println("Вы еще ходите в школу");
                }
                if (momLol>=18 && momLol<24) {
                    System.out.println("Вы закончили школу можете отправляться в университет");
                }
                else {
                    System.out.println("Вы окончили университет пора искать первую работу");
                }

                System.out.println("Шестое задание");

                byte position1 = 55;
                byte capacity1 = 102;
                byte sittingCapacity1 = 60;
                if (position1 <= sittingCapacity1) {
                    System.out.println("Сидячие места");
                }
                else if (position1 > sittingCapacity1 && position1 <= capacity1) {
                    System.out.println("Стоячие места");
                }
                else {
                    System.out.println("Мест нет");
                }

                System.out.println("Седьмое задание");

                byte holli = 16;
                System.out.println("Вам " + holli);
                boolean hollis = holli>=2 && holli<=6;
                boolean hollis1 = holli>=7 && holli<=18;
                boolean hollis2 = holli>18 && holli<=24;
                boolean hollis3 = holli>24;
                if (hollis) {
                    System.out.println("Если возраст человека равен " + holli+ ", то ему нужно ходить в детский сад");
                }
                else if (hollis1) {
                    System.out.println("Если возраст человека равен " + holli+ ", то ему нужно ходить в школу");
                }
                else if (hollis2) {
                    System.out.println("Если возраст человека равен " + holli+ ", то ему нужно ходить в университет");
                }
                else if (hollis3) {
                    System.out.println("Если возраст человека равен " + holli+ ", то ему пора ходить на работу");
                }

                System.out.println("Восьмое задание");

                byte childes = 8;
                if (childes<5) {
                    System.out.println("Если тебе " + childes + ", то ты еще не можешь кататься на аттракционах");
                }
                else if (childes>=5 && childes<14) {
                    System.out.println("Если тебе " + childes + ", то ты можещь кататься на аттракционах, но только в сопровождении взрослых");
                }
                else if (childes>=14) {
                    System.out.println("Если тебе " + childes + ", то ты можешь кататься на аттракционах без сопровождения взрослых");
                }

                System.out.println("Девятое задание");

                int one = 23;
                int two = 78;
                int free = 54;
                if (one>two && one>free) {
                    System.out.println("БОльшее число из приведенных равно " + one);
                }
                else if (two>one && two>free) {
                    System.out.println("БОльшее число из приведенных равно " + two);
                }
                else {
                    System.out.println("БОльшее число из приведенных равно " + free);
                }

                //Начало второй части темы

                System.out.println("Первое задание");

                int clientOs = 1;
                if ( clientOs == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }

                System.out.println("Второе задание");

                int clientOs1 = 1;
                int clientDeviceYear = 2014;
                if ( clientOs1 == 0) {
                    if (clientDeviceYear >= 2015) {
                        System.out.println("Установите новую версию приложения для iOS по ссылке");
                    } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                else if (clientOs1 == 1) {
                    if (clientDeviceYear >= 2015) {
                        System.out.println("Установите новую версию приложения для Android по ссылке");
                    } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                else System.out.println("Приложения для вашего устройства не существует");

                System.out.println("Третье задание");

                int year = 2020;
                int yearCheck4 = year % 4;
                int yearCheck100 = year % 100;
                int yearCheck400 = year % 400;
                if ((yearCheck100 == 0 || yearCheck4 != 0) && yearCheck400 != 0) {
                    System.out.println( year + " год не високосный");
                } else {
                    System.out.println( year + " год високосный");
                }

                System.out.println("Четвертое задание");

                int deliveryDistance = 95;
                int deliveryDays = 1;
                if (deliveryDistance > 20) {
                    deliveryDays ++;
                }
                if (deliveryDistance > 60) {
                    deliveryDays ++;
                }
                if (deliveryDistance > 100) {
                    deliveryDays ++;
                }
                System.out.println("Ваша доставка прибудет в течение " + deliveryDays);

                System.out.println("Пятое задание");

                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Сейчас зимний сезон");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Сейчас весенний сезон");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Сейчас летний сезон");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Сейчас осенний сезон");
                        break;
                    default:
                        System.out.println("Такого месяца не существует");
                }
                }
        }