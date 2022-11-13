public class Main {
    public static void main(String[] args) {



        //task1
        int  redApple = 208963;
        System.out.println (" Значение переменной " + redApple + " с типом int равно " + 208963 );
        byte greenApple = 6;
        System.out.println(" Значение переменной " + greenApple + " с типом byte равно " + 6);
        short orange = 31560;
        System.out.println(" Значение переменной " + orange + " с типом short равно " + 31560);
        long grape = 876000024L;
        System.out.println("Значение переменной " + grape + " с типом long равно " + 876000024L);
        float peachThree = 1.6F;
        System.out.println("Значение переменной " + peachThree + " с типом float равно " + 1.6F);
        double bottleMilk = 5.6987242;
        System.out.println("Значение переменной " + bottleMilk + " с тимом double равно " + 5.6987242);

        //task2
        byte mounths = 6;
        System.out.println(mounths);
        boolean theFalse = mounths <=  5;
        System.out.println(theFalse);

        char books = '-';
        char books1 = 49;
        char books2 = 53;
        char books3 = 57;
        System.out.println(books + " " + books1 + " " + books2 + " " + books3);

        short snowflakes = 596;
        System.out.println(snowflakes);
        int aPinapple = 27897;
        System.out.println(aPinapple);
        byte theLoaf = 67;
        System.out.println(theLoaf);
        double theMilesInRoad = 27.12;
        System.out.println (theMilesInRoad);
        long atoms = 987678965549L;
        System.out.println (atoms);
        float applePie = 2.786F;
        System.out.println(applePie);


        //task3
        byte totalClasses = 3;
        System.out.println(totalClasses);
        byte pupilsLudmilaPavlovna = 23;
        System.out.println(pupilsLudmilaPavlovna);
        byte pupilsAnnaSergeevna = 27;
        System.out.println(pupilsAnnaSergeevna);
        byte pupilsEkaterinaAndreevna = 30;
        System.out.println(pupilsEkaterinaAndreevna);
        int totalPupils = pupilsLudmilaPavlovna + pupilsAnnaSergeevna + pupilsEkaterinaAndreevna;
        System.out.println(totalPupils);
        short totalPapers = 480;
        System.out.println(totalPapers);
        int paperInOneClass = totalPapers/totalClasses;
        System.out.println(paperInOneClass);
        int paperAOnePupil = totalPapers/totalPupils;
        System.out.println(" На каждого ученика расчитано " + paperAOnePupil + " листов бумаги ");

        //task4
        byte perfomanceBottlesStart = 16;
        System.out.println(perfomanceBottlesStart);
        byte perfomanceMinutesStart = 2;
        System.out.println(perfomanceMinutesStart);
        byte minutesIn1Hours = 60;
        System.out.println(minutesIn1Hours);
        int perfomanceBottlesIn1Minute = perfomanceBottlesStart / perfomanceMinutesStart;
        System.out.println(perfomanceBottlesIn1Minute);
        byte horsIn1Day = 24;
        System.out.println(horsIn1Day);
        int perfomanceBottlesIn1Hors = minutesIn1Hours*perfomanceBottlesIn1Minute;
        System.out.println(perfomanceBottlesIn1Hors);
        int perfomanceBottlesIn20Minutes = perfomanceBottlesIn1Minute*20;
        System.out.println("За 20 минут продолжительности работы машина произвела бутылок " + perfomanceBottlesIn20Minutes + " штук ");
        int perfomanceBottlesIn1Day = horsIn1Day*perfomanceBottlesIn1Hors;
        System.out.println("За 1 сутки продолжительности работы машина произвела бутылок " + perfomanceBottlesIn1Day + " штук ");
        int perfomanceBottlesIn3Days = perfomanceBottlesIn1Day*3;
        System.out.println("За 3 дня продолжительности работы машина произвела бутылок " + perfomanceBottlesIn3Days + " штук ");
        byte daysIn1Mounth = 30;
        System.out.println(daysIn1Mounth);
        int hourseIn1Mounth = daysIn1Mounth*horsIn1Day;
        System.out.println(hourseIn1Mounth);
        int minutesIn1Mounth = hourseIn1Mounth*minutesIn1Hours;
        System.out.println(minutesIn1Mounth);
        int perfomanceBoyylesIn1Mount = perfomanceBottlesIn1Minute*minutesIn1Mounth;
        System.out.println("За 1 месяц продолжительности работы машина произвела бутылок " + perfomanceBoyylesIn1Mount + " штук ");

        //task5
        byte dyeWhiteAndBrownTotal = 120;
        System.out.println(dyeWhiteAndBrownTotal);
        byte whiteDyeIn1Class = 2;
        System.out.println(whiteDyeIn1Class);
        byte brownDyeIn1Class = 4;
        System.out.println(brownDyeIn1Class);
        byte dyein1ClassTotal = 2+4;
        System.out.println(dyein1ClassTotal);
        int totalClassesInSchool = dyeWhiteAndBrownTotal/dyein1ClassTotal;
        System.out.println(totalClassesInSchool);
        int whiteDyeTotal = whiteDyeIn1Class*totalClassesInSchool;
        System.out.println(whiteDyeTotal);
        int brownDyeTotal = brownDyeIn1Class*totalClassesInSchool;
        System.out.println("В школе, где " + totalClassesInSchool + " классов, нужно " + whiteDyeTotal + " банок белой краски и " + brownDyeTotal + " банок коричневой краски. ");


        //task6
        int bananas = 5*80;
        System.out.println(bananas);
        int milk = 200*105;
        System.out.println(milk);
        int iceCreamSundae = 2*100;
        System.out.println(iceCreamSundae);
        int rawEggs = 4*70;
        System.out.println(rawEggs);
        int grammBreakfast = bananas + milk + iceCreamSundae + rawEggs;
        System.out.println(grammBreakfast);
        int kilogram = 1000;
        System.out.println("В одном килограме " + kilogram + " грамм");
        int kilogramBreakfast = grammBreakfast/kilogram;
        System.out.println("В завтраке спортсмена " + kilogramBreakfast+ " кг");


        //task7
        int grammBefore = 7*kilogram;
        System.out.println(grammBefore + " грамм веса нужно сбросить спортсмену до соревнований");
        int dayDiet1 = grammBefore/250;
        System.out.println("За " + dayDiet1 + " дней спортсмен скинет 7 кг веса,если в день будет сбрасывать по 250 грамм");
        int dayDiet2 = grammBefore/500;
        System.out.println("За " + dayDiet2 + " дней спортсмен скинет 7 кг веса,если в день будет сбрасывать по 500 грамм");
        int dayDietAverage = (dayDiet1+dayDiet2)/2;
        System.out.println ("В среднем, за " + dayDietAverage + " день спортсмен похудеет на 7 кг ");



        //task8
        double wageMashaMounthBefore = 67760.0;
        System.out.println("Зарплата Маши до повышения зп " + wageMashaMounthBefore);
        double wageDenisMounthBefore = 83690.0;
        System.out.println("Зарплата Дениса до повышения зп " + wageDenisMounthBefore);
        double wageKristinaMounthBefore = 76230.0;
        System.out.println("Зарплата Кристины до повышения зп " + wageKristinaMounthBefore);

        double percentMounth = 0.10;
        System.out.println(percentMounth);

        double wageMashaMounth10Percent = wageMashaMounthBefore*percentMounth;
        System.out.println(wageMashaMounth10Percent);
        double wageMashaMounthAfterPercent = wageMashaMounthBefore+wageMashaMounth10Percent;
        System.out.println(wageMashaMounthAfterPercent + "  зарплата Маши в месяц,после повышения зп на 10%");
        double wageDenisMounth10Percent = wageDenisMounthBefore*percentMounth;
        System.out.println(wageDenisMounth10Percent);
        double wageDenisMounthAfterPercent = wageDenisMounthBefore+wageDenisMounth10Percent;
        System.out.println(wageDenisMounthAfterPercent + " зарплата Дениса в месяц, после повышения зп на 10%");
        double wageKristinaMounth10Percent = wageKristinaMounthBefore*percentMounth;
        System.out.println(wageKristinaMounth10Percent);
        double wageKristinaMounthAfterPercent = wageKristinaMounthBefore + wageKristinaMounth10Percent;
        System.out.println(wageKristinaMounthAfterPercent + " зарплата Кристины в месяц, после повышения зп на 10%");

        double mounthInYear = 12.0;
        System.out.println(mounthInYear);

        double wageMashaInYearBeforePefcent = wageMashaMounthBefore*mounthInYear;
        System.out.println(wageMashaInYearBeforePefcent + " зарплата Маши в год, до повышения зп на 10%");
        double wageMashaInYearAfterPercent = wageMashaMounthAfterPercent*mounthInYear;
        System.out.println(wageMashaInYearAfterPercent + " зарплата Маши в год, после повышения зп на 10%");
        double wageDenisInYearBeforePefcent = wageDenisMounthBefore*mounthInYear;
        System.out.println(wageDenisInYearBeforePefcent + " зарплата Дениса в год, до повышения зп на 10%");
        double wageDenisInYearAfterPercent = wageDenisMounthAfterPercent*mounthInYear;
        System.out.println(wageDenisInYearAfterPercent + " зарплата Дениса в год, после повышения за на 10%");
        double wageKristinaInYearBeforePefcent = wageKristinaMounthBefore*mounthInYear;
        System.out.println(wageKristinaInYearBeforePefcent + " зарплата Кристины в год, до повышения за на 10%");
        double wageKristinaInYearAfterPercent = wageKristinaMounthAfterPercent*mounthInYear;
        System.out.println(wageKristinaInYearAfterPercent + " зарплата Кристины в год, после повышения зп на 10%");

        double differentWageMashaInYear = wageMashaInYearAfterPercent - wageMashaInYearBeforePefcent ;
        System.out.println("Маша теперь получает " + wageMashaMounthAfterPercent + " рублей. " + " Годовой доход вырос на " + differentWageMashaInYear + " рублей.");
        double differentWageDenisInYear = wageDenisInYearAfterPercent - wageDenisInYearBeforePefcent;
        System.out.println("Денис теперь получает " + wageDenisMounthAfterPercent + " рублей." + " Годовой доход вырос на " + differentWageDenisInYear + " рублей.");
        double differentWageKristinaInYear = wageKristinaInYearAfterPercent - wageKristinaInYearBeforePefcent;
        System.out.println("Кристина теперь получает " + wageKristinaMounthAfterPercent + " рублей. " + " Годовой доход вырос на " + differentWageKristinaInYear + " рублей.");





        //task6*




























    }
}