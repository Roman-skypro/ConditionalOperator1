//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("ConditionalOperator1");
        //task 1
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека меньше " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //task 2
        System.out.println("Задача 2");
        int temperature = 25;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + ", нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + ", можно идти без шапки");
        }
        //task 3
        System.out.println("Задача 3");
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч. то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч. можно ездить спокойно ");
        }
        //task 4
        System.out.println("Задача 4");
        int instituteByAge = 25;
        if (instituteByAge >= 2 && instituteByAge <= 6) {
            System.out.println("Если возраст человека равен " + instituteByAge + " , то ему нужно ходить в детский сад");
        }
        if (instituteByAge >= 7 && instituteByAge <= 17) {
            System.out.println("Если возраст человека равен " + instituteByAge + " , то ему нужно ходить в школу.");
        }
        if (instituteByAge >= 18 && instituteByAge <= 24) {
            System.out.println("Если возраст человека равен " + instituteByAge + " , то ему нужно ходить в университет.");
        }
        if (instituteByAge > 24) {
            System.out.println("Если возраст человека равен " + instituteByAge + " , то ему пора ходить на работу.");
        }
        //task 5
        System.out.println("Задача 5");
        int ageLimitAttraction = 14;
        if (ageLimitAttraction < 5) {
            System.out.println("Если возраст ребенка равен " + ageLimitAttraction + " то ему нельзя кататься на аттракционе ");
        }
        if (ageLimitAttraction > 5 && ageLimitAttraction < 14) {
            System.out.println("Если возраст ребенка равен " + ageLimitAttraction + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageLimitAttraction >= 14) {
            System.out.println("Если возраст ребенка равен " + ageLimitAttraction + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        // task 6
        System.out.println("Задача 6");
        int capacityСarriage = 102;
        int SeatsCapaciti = 60;
        int passengers = 102;
        if (passengers < SeatsCapaciti) {
            System.out.println("Есть сидячие места");
        } else {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие.");
        }
        if (passengers < capacityСarriage) {
            System.out.println("В вагоне есть стоячие места, сидячих мест нет");
        } else {
            System.out.println("В вагоне нет мест!!!");
        }
        // task 7
        System.out.println("Задача 7");
        int one = 3;
        int two = 6;
        int three = 6;
        if (one >= two && one >= three) {
            System.out.println("большее число в переменной one " + one);
        } else {
            if (two >= three) {
                System.out.println("большее число в переменной two " + two);
            } else {
                System.out.println("большее число в переменной three " + three);
            }


        }

    }

}


