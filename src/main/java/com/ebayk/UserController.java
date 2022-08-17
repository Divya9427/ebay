package com.ebayk;

import com.ebayk.data.user.User;
import com.ebayk.service.RatingAnalyzer;
import com.ebayk.service.RatingAnalyzer.UserNotFoundException;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/{id}")
public class UserController {

  @RequestMapping("/rated-users")
  public List<User> listAd(@PathVariable("id") Integer userId) throws UserNotFoundException {
    return RatingAnalyzer.getRatedUserForRatingCreator(userId);
  }

}
