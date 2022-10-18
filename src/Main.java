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
            }
        }