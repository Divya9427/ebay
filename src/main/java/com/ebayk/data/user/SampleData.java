package com.ebayk.data.user;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class SampleData {

  static final List<User> USERS = Arrays.asList(

      User.newUser().id(1).name("Alice").ratings(Arrays.asList(
          new UserRating(4, 2),
          new UserRating(5, 3),
          new UserRating(2, 4000)
      )).build(),

      User.newUser().id(2).name("Bob").ratings(Collections.emptyList()).ratings(
          Arrays.asList(
              new UserRating(3, 4000)
          )
      ).build(),

      User.newUser().id(3).name("Charles").ratings(Collections.emptyList()).ratings(
          Arrays.asList(
              new UserRating(3, 5)
          )
      ).build(),

      User.newUser().id(4000).name("Cleo").ratings(Collections.emptyList()).build()
  );

}
