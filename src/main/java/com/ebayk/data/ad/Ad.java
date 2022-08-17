package com.ebayk.data.ad;

public class Ad {

    private final Integer id;
    private final String title;
    private final String imageUrl;
    private final String description;
    private final Integer userId;

    private Ad(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.imageUrl = builder.imageUrl;
        this.description = builder.description;
        this.userId = builder.userId;
    }

    public static Builder newAd() {
        return new Builder();
    }

    public static final class Builder {
        private Integer id;
        private String title;
        private String imageUrl;
        private String description;
        private Integer userId;

        private Builder() {
        }

        public Ad build() {
            return new Ad(this);
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public Integer getUserId() {
        return userId;
    }
}
