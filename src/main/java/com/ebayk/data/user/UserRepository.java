package com.ebayk.data.user;

import java.util.List;

public class UserRepository {

    public User getUser(Integer id) {
        for (User user : SampleData.USERS) {
            if(user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }

    public List<User> getUsers() {
        return SampleData.USERS;
    }

}
