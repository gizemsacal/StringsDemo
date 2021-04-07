package com.java.ex;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        /* mesaj.length burada şu işe yarıyor; mesajın tanımlı olduğu bugün hava
        çok güzel yazısındaki karakter sayısına ulaşmamıza.
         */
        System.out.println("5. eleman : " + mesaj.charAt(4));
        /* mesaj.chatAt burada şu işe yarıyor; bugün hava çok güzel yazısındaki
        5. elemanın hangisi olduğunu bulmamıza. charAt'in içinde 4 yazma sebebimiz
        saymaya başlarken 0,1,2,3,4 diye başlıyor 0' ı kattığı için bulmasını istediğimiz
        sayının bir eksiğini yazıyoruz.
         */
        System.out.println(mesaj.concat(" Yaşasın!"));
        /* mesaj.concat burada şu işe yarıyor; cümleleri birleştirmemize.
        bugün hava çok güzel. ile Yaşasın! cümlelerini birleştirmek için kullandık.
         */
        System.out.println(mesaj.startsWith("B"));
        /* mesaj.startWith burada şu işe yarıyor; ne ile başladığı ile ilgili mesela
        B ile başlıyorsa true döndürür baş harfi dışında birşey yazarsak false döndürür.
        Bugün hava çok güzel. "B" harfiyle başladığı için true döndürecek.
         */
        System.out.println(mesaj.startsWith("D"));
       /* Bugün hava çok güzel. "D" harfiyle başlamadığı için false döndürdü.

        */
        System.out.println(mesaj.endsWith("."));
        /*mesaj.endsWith burada şu işe yarıyor; cümlenin ne ile bittiğini bilmemize.
        Bugün hava çok güzel. nokta ile bittiği için true döndürür.
         */
        System.out.println(mesaj.endsWith("e"));
        /* burda false verecek çünkü cümle e harfiyle bitmiyor.

         */
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        /* getChars burada şu işe yarıyor; örneğin "Bugün" kelimesinin ilk 5 karakterini
        almak istiyorum. start: 0 dediğimiz 0 dan başla demek,sonrasında end nerde
        bitir demek 5 de bitir, bunu nereye aktaracağım sorusunun cevabı da
        karakterler kısmnında, o yüzden üst kısımda char[] karakterler = new char[5]
        açtık atayacak yerimiz olsun diye, kısacası 0 dan 5 e kadar olan elemanları karakterlere
        ata demek, index: 0 da karakterlere kaçtan başlayayım demek veya kaçıncı yere aktarayım
        demek o yüzden 0 dedik, karakterleri ata karakterlerin 0 ıncı indexinden itibaren aktar demek.
      */
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
         /*Belirttiğim karakterin ister string ister karakter olarak yazabilirim,bu karakterin
         mesajın içerisinde kaçıncı eleman olduğunu bulmaya yarar. örneğin a 7. karakterde var
         bugün hava çok güzelde.
      */
        System.out.println("---------------");

        String yeniMesaj = mesaj.replace('a','A');
        System.out.println(yeniMesaj);

        /* replace ifadesi türkçede değiştirme anlamındadır. mesaj.replace dediğimizde ilgili metinimizdeki
        değerleri değiştirebilir. Örneğin ingilizce karakterlerin türkçeye çevrilmesi. oldChar neyi neyle değiştirmek
        istiyorsun demek aslında.
             */

          System.out.println(mesaj.substring(2));
        /* mesaj.substring burada şu işe yarıyor; Bir metnin içinden parça almaktır.
        nereyi nereden itibaren alayım mesela 2. indexden itibaren dersem Bugün hava çok güzel in 5. karakterinden
        sonra almaya başlar.(0,1,2,.. diye sayıldığını unutma)
         */
          System.out.println(mesaj.substring(2,4));
        /*substring' in bir diğer kullanımı da şudur; istediğimiz indexe kadar kesmesini
        de isteyebiliriz. 2. indexten başlasın 4. indexe kadar olan karakterleri erkrana yazdırsın.
        4. indexi kabul etmedi burası önemli çünkü 4'e kadar demek.
         */

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
             /* bir metni belli bir karakter veya karakter dizisini dikkate alarak
        parçalamaya yarar. bugün hava çok güzel cümlesini komple parçaladı alt alta.
           */
        }
            System.out.println(mesaj.toLowerCase());
        /* toLowerCase mesajı küçük harfe çeviriyor.

         */
            System.out.println(mesaj.toUpperCase());
            /*toUpperCase mesajı büyük harfe çeviriyor.
s
             */
           System.out.println(mesaj.trim());
     /*  trim burada şu işe yarıyor; Metnin başında ve sonunda boşluk olabiliyor
     bu boşlukları kapatmak için kullanılır.
      */
        System.out.println("------------------");

        String girdi = "G  iz em Sa    ça l";
        System.out.println(girdi);
        String yeniGirdi = girdi.replace(" ","");
        System.out.println(yeniGirdi);
     }
    

     }

