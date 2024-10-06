public class Main {
    public static void main(String[] args) {
        System.out.println("Home work 2!");
        int myBalance= 30000000;
        byte myBookc = 2;
        short myOlives = 20000;
        long bees = 9999999999L;
        float cereal = 1.13f;
        double gold = 0.14;
        System.out.println("Значение переменой myBalance с типом int равнор "+myBalance);
        System.out.println("Значение переменой myBoock с типом byte равнор "+myBookc);
        System.out.println("Значение переменой myOlives  с типом short равнор "+myOlives);
        System.out.println("Значение переменой bees с типом long равнор "+bees);
        System.out.println("Значение переменой cereal с типом float равнор "+cereal);
        System.out.println("Значение переменой gold с типом double равнор "+gold);

        float a =27.12f;
        long b =987678965549L;
        double c =2.786;
        short d =569;
        short e =-159;
        int f = 27897;
        byte g =67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        short classAstudents = 23;
        short clasBstudents = 27;
        short classCstudents = 30;
        short papers = 480;
        int totalStudents = classAstudents + clasBstudents +classCstudents;
        int papersOnstudents = papers/totalStudents;
        System.out.println("На каждого ученика расчитано "+papersOnstudents+" листов бумаги");

        int bottelsInTwoMinutes = 16;
        int bottelsInMinutes = bottelsInTwoMinutes/2;
        int minutesInDay = 24*60;
        int minutesIn3Days = minutesInDay*3;
        int minutesInMonth = minutesInDay*30;

        int bottels20Minutes= bottelsInMinutes*20;
        int bottelsInDay =bottelsInMinutes*minutesInDay;
        int bottelsIn3Day =bottelsInMinutes*minutesIn3Days;
        int bottelsInMonth =bottelsInMinutes*minutesInMonth;

        System.out.println("За 20 минут машина произвела "+bottels20Minutes+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottelsInDay+" штук бутылок");
        System.out.println("За 3 дня машина произвела  "+bottelsIn3Day+" штук бутылок");
        System.out.println("За месяц машина произвела "+bottelsInMonth+" штук бутылок");

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int inTotalCansOneClass = whiteCansPerClass+brownCansPerClass;
        int inTotalClass = totalCans/inTotalCansOneClass;
        int totalWhiteCansClass =whiteCansPerClass*inTotalClass;
        int totalBrownCansClass = brownCansPerClass*inTotalClass;
        System.out.println("В школе,где "+inTotalClass+" классов,нужно "+totalWhiteCansClass+" банок белой краски и "+totalBrownCansClass+" банок коричневой краски ." );

        int nuberBanans =5;
        int banansWeigth =80;
        int milkVolume = 200;
        double iceCreamWeigth =2*100;
        int nuberEggs =4;
        int eggsWeigth =70;
        int totalWeigth = nuberBanans * banansWeigth + milkVolume * 105 / 100+ (int)iceCreamWeigth+nuberEggs*eggsWeigth;
        double totalWeigthInKg = totalWeigth/1000.0;
        System.out.printf("Общий вес завтрака: %d грамм ( %.2f кг),",totalWeigth,totalWeigthInKg);


        int weigthLossGoalKg =7;
        double dailyWeigthLossLow =0.25;
        double dailyWeigthLossHigh =0.5;
        int dayLow =(int)Math.ceil(weigthLossGoalKg/dailyWeigthLossLow);
        int dayHigh =(int)Math.ceil(weigthLossGoalKg/dailyWeigthLossHigh);
        int dayAveraga =(dayLow+dayHigh)/2;
        System.out.println("Теряем в день "+ dailyWeigthLossLow+" нужно дней "+dayLow);
        System.out.println("Теряем в день "+dailyWeigthLossHigh+" нужно дней "+dayHigh);
        System.out.println("Среднее количество дней "+dayAveraga);

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int newSalaryMasha = (int)(salaryMasha*1.1);
        int newSalaryDenis = (int)(salaryDenis*1.1);
        int newSalaryKristina =(int)(salaryKristina*1.1);

        int salaryMashaBeforIndaxation =salaryMasha*12 ;
        int salaryKristinaBeforIndaxation = salaryKristina*12;
        int salaryDenisBeforIndaxation = salaryDenis*12;

        int salaryMashaAfterIndaxation =newSalaryMasha *12 ;
        int salaryKristinaAfterIndaxation = newSalaryKristina*12;
        int salaryDenisAfterIndaxation = newSalaryDenis*12;

        int gotUpSalaryMasha = salaryMashaAfterIndaxation-salaryMashaBeforIndaxation;
        int gotUpSalaryDenis = salaryDenisAfterIndaxation-salaryDenisBeforIndaxation;
        int gotUpSalaryKristina = salaryKristinaAfterIndaxation-salaryKristinaBeforIndaxation ;

        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей.Годовой доход вырос на "+gotUpSalaryMasha+" рублей");
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей.Годовой доход вырос на "+gotUpSalaryDenis+" рублей");
        System.out.println("Кристина теперь получает "+newSalaryKristina+" рублей.Годовой доход вырос на "+gotUpSalaryKristina+" рублей");


    }
}