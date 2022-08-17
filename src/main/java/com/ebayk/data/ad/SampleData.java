package com.ebayk.data.ad;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

final class SampleData {

  static final List<Ad> ADS = Arrays.asList(
      Ad.newAd().id(0).title("Title Nr. 0").description("Description 0")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/c0UAAOSwYXVcc6MM/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(1).title("Title Nr. 1").description("Description 1")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1Nzc=/z/87oAAOSwk45cc6MB/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(2).title("Title Nr. 2").description("Description 2")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/FQMAAOSwnI9cc6EE/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(3).title("Title Nr. 3").description("Description 3")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/3UkAAOSwVVlcc6Mt/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(4).title("Title Nr. 4").description("Description 4")
          .imageUrl("https://i.ebayimg.com/00/s/OTIxWDY0MA==/z/LKUAAOSwJ-xcc6MF/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(5).title("Title Nr. 5").description("Description 5")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/F0QAAOSw~Kpcc6Ml/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(6).title("Title Nr. 6").description("Description 6")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/AvoAAOSw-M9cc6K8/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(7).title("Title Nr. 7").description("Description 7")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/CvMAAOSw~7Jcc6Lz/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(8).title("Title Nr. 8").description("Description 8")
          .imageUrl("https://i.ebayimg.com/00/s/MTAwN1gxMDI0/z/mBQAAOSwceZcc6Mx/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(9).title("Title Nr. 9").description("Description 9")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/7rEAAOSwVbhcc6K8/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(10).title("Title Nr. 10").description("Description 10")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/YKgAAOSw78xcY-a3/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(11).title("Title Nr. 11").description("Description 11")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/aI0AAOSwtRNcc6Mo/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(12).title("Title Nr. 12").description("Description 12")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/qWYAAOSwm1Vcc6F4/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(13).title("Title Nr. 13").description("Description 13")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/qWYAAOSwm1Vcc6F4/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(14).title("Title Nr. 14").description("Description 14")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/IX8AAOSwWtpcc53S/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(15).title("Title Nr. 15").description("Description 15")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/uf8AAOSwGZRcc6My/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(16).title("Title Nr. 16").description("Description 16")
          .imageUrl("https://i.ebayimg.com/00/s/NjQ0WDEwMjQ=/z/6OoAAOSwy1pbKA58/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(17).title("Title Nr. 17").description("Description 17")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/7rEAAOSwVbhcc6K8/$_72.JPG").userId(1)
          .build(),
      Ad.newAd().id(18).title("Title Nr. 18").description("Description 18")
          .imageUrl("https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/zx0AAOSwd5xcc6Mw/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(19).title("Title Nr. 19").description("Description 19")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/4yQAAOSw1Udcc6Iq/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(20).title("Title Nr. 20").description("Description 20")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/q0AAAOSwejNcc6Lo/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(21).title("Title Nr. 21").description("Description 21")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/F0QAAOSw~Kpcc6Ml/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(22).title("Title Nr. 22").description("Description 22")
          .imageUrl("https://i.ebayimg.com/00/s/NTcwWDc5MA==/z/hqsAAOSwBlRcc6M1/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(23).title("Title Nr. 23").description("Description 23")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/VZkAAOSwk4hcc6J5/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(24).title("Title Nr. 24").description("Description 24")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/jMYAAOSwBRpcXE6F/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(25).title("Title Nr. 25").description("Description 25")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/4yQAAOSw1Udcc6Iq/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(26).title("Title Nr. 26").description("Description 26")
          .imageUrl("https://i.ebayimg.com/00/s/NzQzWDYzMA==/z/~vIAAOSwCcZcc6G0/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(27).title("Title Nr. 27").description("Description 27")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/3UkAAOSwVVlcc6Mt/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(28).title("Title Nr. 28").description("Description 28")
          .imageUrl("https://i.ebayimg.com/00/s/NjgyWDEwMjQ=/z/wvsAAOSw-Jtcc6Np/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(29).title("Title Nr. 29").description("Description 29")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/EdEAAOSw~jpcc6M7/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(30).title("Title Nr. 30").description("Description 30")
          .imageUrl("https://i.ebayimg.com/00/s/NTcwWDc5MA==/z/hqsAAOSwBlRcc6M1/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(31).title("Title Nr. 31").description("Description 31")
          .imageUrl("https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/nr0AAOSwOztcc6MM/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(32).title("Title Nr. 32").description("Description 32")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/Zb0AAOSw8ihcc6Li/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(33).title("Title Nr. 33").description("Description 33")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/iWoAAOSw0yVcc6G~/$_72.JPG").userId(2)
          .build(),
      Ad.newAd().id(34).title("Title Nr. 34").description("Description 34")
          .imageUrl("https://i.ebayimg.com/00/s/NTc2WDg1Mg==/z/6yEAAOSwL35cc6Cu/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(35).title("Title Nr. 35").description("Description 35")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/EmUAAOSwUvVcc6MZ/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(36).title("Title Nr. 36").description("Description 36")
          .imageUrl("https://i.ebayimg.com/00/s/OTIxWDY0MA==/z/LKUAAOSwJ-xcc6MF/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(37).title("Title Nr. 37").description("Description 37")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/gbkAAOSw6nhcc6Mi/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(38).title("Title Nr. 38").description("Description 38")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/VZkAAOSwk4hcc6J5/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(39).title("Title Nr. 39").description("Description 39")
          .imageUrl("https://i.ebayimg.com/00/s/ODYwWDEwMjQ=/z/z~UAAOSw8Alcc6Mq/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(40).title("Title Nr. 40").description("Description 40")
          .imageUrl("https://i.ebayimg.com/00/s/NTMxWDEwMjQ=/z/nd8AAOSwqeRcc6NB/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(41).title("Title Nr. 41").description("Description 41")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/cEsAAOSwC4lcc6Mw/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(42).title("Title Nr. 42").description("Description 42")
          .imageUrl("https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/zx0AAOSwd5xcc6Mw/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(43).title("Title Nr. 43").description("Description 43")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/QlMAAOSwxDxcc6M0/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(44).title("Title Nr. 44").description("Description 44")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/VZkAAOSwk4hcc6J5/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(45).title("Title Nr. 45").description("Description 45")
          .imageUrl("https://i.ebayimg.com/00/s/OTIxWDY0MA==/z/LKUAAOSwJ-xcc6MF/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(46).title("Title Nr. 46").description("Description 46")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/lCQAAOSwNIpcc6NP/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(47).title("Title Nr. 47").description("Description 47")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3NjY=/z/y-YAAOSwyMRcc6Jk/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(48).title("Title Nr. 48").description("Description 48")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/7rEAAOSwVbhcc6K8/$_72.JPG").userId(3)
          .build(),
      Ad.newAd().id(49).title("Title Nr. 49").description("Description 49")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/OK8AAOSwUYhcc6H9/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(50).title("Title Nr. 50").description("Description 50")
          .imageUrl("https://i.ebayimg.com/00/s/MTAwN1gxMDI0/z/mBQAAOSwceZcc6Mx/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(51).title("Title Nr. 51").description("Description 51")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/cEsAAOSwC4lcc6Mw/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(52).title("Title Nr. 52").description("Description 52")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/hpsAAOSw0pJcc6Ka/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(53).title("Title Nr. 53").description("Description 53")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg2Nzc=/z/Wy4AAOSwNqRcEMux/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(54).title("Title Nr. 54").description("Description 54")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/rBsAAOSwgs5cc6KQ/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(55).title("Title Nr. 55").description("Description 55")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/gw8AAOSw32lcc6AS/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(56).title("Title Nr. 56").description("Description 56")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/AvoAAOSw-M9cc6K8/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(57).title("Title Nr. 57").description("Description 57")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/Zb0AAOSw8ihcc6Li/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(58).title("Title Nr. 58").description("Description 58")
          .imageUrl("https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/3UkAAOSwVVlcc6Mt/$_72.JPG").userId(4)
          .build(),
      Ad.newAd().id(59).title("Title Nr. 59").description("Description 59")
          .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/AvoAAOSw-M9cc6K8/$_72.JPG").userId(4)
          .build()
  );


  private static String sampleImage() {
    List<String> urls = Arrays.asList(
        "https://i.ebayimg.com/00/s/MTAyNFg2Nzc=/z/Wy4AAOSwNqRcEMux/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/E9EAAOSwF59cc6Gx/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/ZSoAAOSw-o9cc6Ct/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/YEsAAOSwuHdcc6IM/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/dFAAAOSwoOxcc6F7/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/GZ4AAOSw5e5cc6HE/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTc2WDg1Mg==/z/6yEAAOSwL35cc6Cu/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/0z8AAOSwb-Jcc56-/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/rsAAAOSwupBcc6Ih/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/FQMAAOSwnI9cc6EE/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/6oIAAOSwiuRcc6EW/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/RNkAAOSwOttcc6HJ/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/jNkAAOSwgX9cc6Ff/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/wCIAAOSwroJcc6Dn/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/IX8AAOSwWtpcc53S/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/iWoAAOSw0yVcc6G~/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/9NEAAOSwO7Ncc6IL/$_72.JPG",
        "https://i.ebayimg.com/00/s/ODE4WDUyOA==/z/dXUAAOSwZjpcc6IW/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/4yQAAOSw1Udcc6Iq/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzQzWDYzMA==/z/~vIAAOSwCcZcc6G0/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/qWYAAOSwm1Vcc6F4/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTM1WDU4Mg==/z/GuMAAOSw0T9cc6Ib/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/hJ4AAOSw-9hcc6In/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/-pIAAOSweWtcc6H4/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/JGwAAOSwwzJamAwT/$_72.PNG",
        "https://i.ebayimg.com/00/s/NTAwWDQwNQ==/z/dOEAAOSwXi9cLK7x/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/nr0AAOSwOztcc6MM/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/QlMAAOSwxDxcc6M0/$_72.JPG",
        "https://i.ebayimg.com/00/s/OTIxWDY0MA==/z/LKUAAOSwJ-xcc6MF/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/GSgAAOSwHDdcc6NB/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3NjY=/z/y-YAAOSwyMRcc6Jk/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/4ywAAOSwMexcc6Lj/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/fgcAAOSwrNdcc6M5/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/Zf4AAOSwsixcc6M3/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg2OTk=/z/hLoAAOSwGFZcc6MO/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/c0UAAOSwYXVcc6MM/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFgxMDI0/z/lUEAAOSwDXxcc6MH/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/q0AAAOSwejNcc6Lo/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAwN1gxMDI0/z/mBQAAOSwceZcc6Mx/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/CvMAAOSw~7Jcc6Lz/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/7rEAAOSwVbhcc6K8/$_72.JPG",
        "https://i.ebayimg.com/00/s/NDkwWDEwMjQ=/z/GDcAAOSwJoxcc6LX/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzIzWDQ3Mg==/z/LPsAAOSwJ-xcc6M5/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/uZ8AAOSw2cRcc6C0/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTc2WDEwMjQ=/z/zx0AAOSwd5xcc6Mw/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/OK8AAOSwUYhcc6H9/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/zAwAAOSw9C5cc6KO/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/rBsAAOSwgs5cc6KQ/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTcwWDc5MA==/z/hqsAAOSwBlRcc6M1/$_72.JPG",
        "https://i.ebayimg.com/00/s/NjQ0WDEwMjQ=/z/6OoAAOSwy1pbKA58/$_72.JPG",
        "https://i.ebayimg.com/00/s/NDUwWDQwMg==/z/T5UAAOSwYpVcbRQw/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1Nzc=/z/87oAAOSwk45cc6MB/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/0ogAAOSwXHpcc6Nv/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/gw8AAOSw32lcc6AS/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/cEsAAOSwC4lcc6Mw/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/0BQAAOSwF8Bcc6Ng/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/F0QAAOSw~Kpcc6Ml/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/AvoAAOSw-M9cc6K8/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/gbkAAOSw6nhcc6Mi/$_72.JPG",
        "https://i.ebayimg.com/00/s/NjgyWDEwMjQ=/z/wvsAAOSw-Jtcc6Np/$_72.JPG",
        "https://i.ebayimg.com/00/s/NTMxWDEwMjQ=/z/nd8AAOSwqeRcc6NB/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/-ZsAAOSwKhFcc6M7/$_72.JPG",
        "https://i.ebayimg.com/00/s/ODYwWDEwMjQ=/z/z~UAAOSw8Alcc6Mq/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1MTI=/z/VQ4AAOSwFGNcUClN/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/YKgAAOSw78xcY-a3/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/aI0AAOSwtRNcc6Mo/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/3UkAAOSwVVlcc6Mt/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/VZkAAOSwk4hcc6J5/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/jMYAAOSwBRpcXE6F/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/EdEAAOSw~jpcc6M7/$_72.JPG",
        "https://i.ebayimg.com/00/s/NzY4WDEwMjQ=/z/uf8AAOSwGZRcc6My/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/EmUAAOSwUvVcc6MZ/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/OTAAAOSw6Ptcc6Nh/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/lCQAAOSwNIpcc6NP/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/hpsAAOSw0pJcc6Ka/$_72.JPG",
        "https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/Zb0AAOSw8ihcc6Li/$_72.JPG"
    );
    return urls.get(Math.abs(new Random().nextInt()) % urls.size());
  }

}
