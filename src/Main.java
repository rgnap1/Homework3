public class Main {
    public static void main(String[] args) {



        //task1
        int redApple = 208963;
        System.out.println (" Значение переменной " + redApple + " с типом int равно " + 208963 );
        byte greenApple = 6;
        System.out.println(" Значение переменной " + greenApple + " с типом byte равно " + 6);
        short orange = 31560;
        System.out.println(" Значение переменной " + orange + " с типом short равно " + 31560);
        long grape = 876000024L;
        System.out.println("Значение переменной " + grape + " с типом long равно " + 876000024L);
        float peachThree = 1.6f;
        System.out.println("Значение переменной " + peachThree + " с типом float равно " + 1.6f);

        //task2
        double theMilesInRoad = 27.12;
        System.out.println (theMilesInRoad);
        long atoms = 987678965549L;
        System.out.println (atoms);
        float applePie = 2.786f;
        System.out.println(applePie);

        byte mounths = 6;
        System.out.println(mounths);
        boolean theFalse = mounths <=  5;
        System.out.println(theFalse);

        char books = 569;
        System.out.println(books);
        short snowflakes = -159;
        System.out.println(snowflakes);
        int bananas = 27897;
        System.out.println(bananas);

        byte theLoaf = 67;
        System.out.println(theLoaf);

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





































    }
}