package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); //19:12:41.129627200
        /*
        bizim olusturdugumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda
        .............
         */

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(10000));

        System.out.println(time1.minusMinutes(200));

        System.out.println(time1.withHour(3));


    }
}
