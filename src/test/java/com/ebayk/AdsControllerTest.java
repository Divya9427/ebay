package com.ebayk;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ebayk.data.ad.Ad;
import java.net.URL;
import org.junit.jupiter.api.Test;

class AdsControllerTest {

  @Test
  void singleAd() {
    AdsController adsController = new AdsController();
    Ad singleAdResponse = adsController.singleAd();
    
    assertNotNull(singleAdResponse.getTitle());
    assertDoesNotThrow(() -> new URL(singleAdResponse.getImageUrl()));
  }
}