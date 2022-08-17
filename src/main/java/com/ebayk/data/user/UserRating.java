package com.ebayk.data.user;

public class UserRating {

  private final Integer rating;
  private final Integer ratingCreatorUserId;

  public UserRating(Integer rating, Integer ratingCreatorUserId) {

    if(rating < 1 || rating > 5) {
      throw new IllegalArgumentException("Invalid rating of " + rating + ", rating must be between 1 and 5");
    }

    this.rating = rating;
    this.ratingCreatorUserId = ratingCreatorUserId;
  }

  public Integer getRating() {
    return rating;
  }

  public Integer getRatingCreatorUserId() {
    return ratingCreatorUserId;
  }
}