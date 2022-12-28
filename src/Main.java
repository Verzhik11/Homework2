public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        part2();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog -= 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var weightLeft = boxer1Weight - boxer2Weight;
        System.out.println("Общий вес равен " + totalWeight + ". Разница в весе равна " + weightLeft);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var weightLeft = boxer2Weight - boxer1Weight;
        var weightGap = boxer2Weight % boxer1Weight;
        System.out.println(weightLeft);
        System.out.println(weightGap);

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workHours = 640;
        var workDay = 8;
        var quantityWorker = workHours / workDay;
        System.out.println("Всего работников в компании - " + quantityWorker + " человек");
        var addWorker = quantityWorker + 94;
        var newWorkHours = workDay * addWorker;
        System.out.println("Если в компании работает " + addWorker + " человек, то всего " + newWorkHours + " часов работы может быть поделено между сотрудниками");

    }
    public static void part2 () {
        System.out.println("Переменные часть 2");
    }
    public static void task9 () {
        System.out.println("Задача 1");
        int A = 25888852;
        System.out.println("Значение переменной A c типом int равна " + A);
        byte B = 11;
        System.out.println("Значение переменной B c типом byte равна " + B);
        short C = -15600;
        System.out.println("Значение переменной C c типом short равна " + C);
        long D = 1651222222;
        System.out.println("Значение переменной D c типом long равна " + D);
        float E = 5.3f;
        System.out.println("Значение переменной E c типом float равна " + E);
        double G = 445.67;
        System.out.println("Значение переменной G c типом double равна " + G);

    }
    public static void task10 () {
        System.out.println("Задача 2");
        float A = 24.12f;
        System.out.println("Значение переменной A c типом float равна " + A);
        long B = 987678965549l;
        System.out.println("Значение переменной B c типом long равна " + B);
        float C = 2.786f;
        System.out.println("Значение переменной C c типом float равна " + C);
        short D = 586;
        System.out.println("Значение переменной D c типом short равна " + D);
        short E = -159;
        System.out.println("Значение переменной E c типом short равна " + E);
        short F = 27897;
        System.out.println("Значение переменной F c типом short равна " + F);
        byte G = 67;
        System.out.println("Значение переменной G c типом int равна " + G);
    }
    public static void task11 () {
        System.out.println("Задача 3");
        byte A = 23; //Людмила Павловна
        byte B = 27; //Анна Сергеевна
        byte C = 30; // Екатерина Андреевна
        int pupels = A + B + C;
        short paperSheets = 480;
        int sheetPupel = paperSheets / pupels;
        System.out.println("На каждого ученика рассчитано " + sheetPupel + " листов бумаги");

    }
    public static void task12 () {
        System.out.println("Задача 4");
        byte powerMashine = 16; //за 2 минуты
        byte a = 2;
        int powerPerMinute = powerMashine / a;
        byte b = 30; //задание за 30 минут
        short minutePerDay = 1440; //задание за сутки
        byte c = 3; //задание за 3 дня
        byte month = 30; // задание за месяц
        int powerMinute30 = powerPerMinute * b; //за 30 минут
        System.out.println("За " + b + " минут машина произвела " + powerMinute30 + " штук бутылок");
        int powerPerDay = powerPerMinute * minutePerDay; //за сутки
        System.out.println("За сутки машина произвела " + powerPerDay + " штук бутылок");
        int power3Day = powerPerDay * c;
        System.out.println("За " + c + " дня машина произвела " + power3Day + " штук бутылок");
        int powerPerMonth = powerPerDay * 30;
        System.out.println("За месяц машина произвела " + powerPerMonth + " штук бутылок");

    }
    public static void task13 () {
        System.out.println("Задача 5");
        byte totalBanks = 120;
        byte brownPerClass = 4;
        byte whitePerClass = 2;
        int quantityClass = totalBanks / (brownPerClass + whitePerClass);
        int quantityBrown = quantityClass * brownPerClass;
        int quantityWhite = quantityClass * whitePerClass;
        System.out.println("В школе, где " + quantityClass + " классов нужно " + quantityWhite + " белой краски и " + quantityBrown + " коричневой краски");

    }
    public static void task14 () {
        System.out.println("Задача 6");
        byte quanBanana = 5;
        short weightBanana = 80;
        short milk = 200;
        float weightMilk = 1.05f;
        byte icecream = 2;
        short weightIcecream = 100;
        byte egg = 4;
        short weightEgg = 70;
        double totalWeight = (quanBanana * weightBanana) + (milk * weightMilk) + (icecream * weightIcecream) + (egg * weightEgg);
        System.out.println(totalWeight + " грамм");
        double totalWeightKg = totalWeight / 1000;
        System.out.println(totalWeightKg + " килограмм");

    }
    public static void task15 () {
        System.out.println("Задача 7");
        short weight = 7000;
        short A = 250;
        short B = 500;
        int dayPerA = weight / A;
        int dayPerB = weight / B;
        int averegeDay= (dayPerA + dayPerB) / 2;
        System.out.println("Если спортсмен будет сбрасывать по " + A + " грамм в день, то он добьется результата за " + dayPerA + " дней");
        System.out.println("Если спортсмен будет сбрасывать по " + B + " грамм в день, то он добьется результата за " + dayPerB + " дней");
        System.out.println("В среднем ему понадобиться " + averegeDay + " дней");

    }
    public static void task16 () {
        System.out.println("Задача 8");
        int sallaryMasha = 67760;
        int sallaryDenis = 83690;
        int sallaryKris = 76230;
        float k = (float)1.1;
        int newSallaryMasha = (int)(sallaryMasha * k);
        int newSallaryDenis = (int)(sallaryDenis * k);
        int newSallaryKris = (int)(sallaryKris * k);
        byte monthYear = 12;
        int marginYearMasha = (newSallaryMasha * monthYear) - (sallaryMasha * monthYear);
        int marginYearDenis = (newSallaryDenis * monthYear) - (sallaryDenis * monthYear);
        int marginYearKris = (newSallaryKris * monthYear) - (sallaryKris * monthYear);
        System.out.println("Маша теперь получает " + newSallaryMasha + " рублей. Годовой доход вырос на " + marginYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newSallaryDenis + " рублей. Годовой доход вырос на " + marginYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSallaryKris + " рублей. Годовой доход вырос на " + marginYearKris + " рублей");

    }
}
