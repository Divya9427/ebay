package com.ebayk;

import java.util.Arrays;
import java.util.List;

import com.ebayk.data.ad.Ad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdsController {

  // Fetch ads from AdRepository
  @RequestMapping("/ad-list")
  public List<Ad> listAd() {
    return Arrays.asList(
        // This is just placeholder sample data
        Ad.newAd().id(0).title("Title Nr. 0").description("Description 0")
            .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg1NzY=/z/qWYAAOSwm1Vcc6F4/$_72.JPG").build(),
        Ad.newAd().id(1).title("Title Nr. 1").description("Description 1")
            .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/Zb0AAOSw8ihcc6Li/$_72.JPG")
            .build());
  }

  // Fetch a single add from AdRepository
  // Add params as you want
  @RequestMapping("/ad-single")
  public Ad singleAd() {
    // This is just placeholder sample data
    return Ad.newAd().id(42).title("Title Nr. 42").description("Description 40")
        .imageUrl("https://i.ebayimg.com/00/s/MTAyNFg3Njg=/z/Zb0AAOSw8ihcc6Li/$_72.JPG").build();
  }
}
