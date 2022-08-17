package com.ebayk.data.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

  private final Integer id;
  private final String name;
  private final List<UserRating> ratings;

  public User(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.ratings = builder.ratings;
  }

  public static Builder newUser() {
    return new Builder();
  }

  public static class Builder {

    private Integer id;
    private String name;
    private List<UserRating> ratings;

    private Builder() {}

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder ratings(List<UserRating> ratings) {
      this.ratings = new ArrayList<>(ratings);
      return this;
    }

    public User build() {
      return new User(this);
    }

  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<UserRating> getRatings() {
    return Collections.unmodifiableList(ratings);
  }
}