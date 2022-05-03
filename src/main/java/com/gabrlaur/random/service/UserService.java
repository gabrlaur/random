package com.gabrlaur.random.service;

import com.gabrlaur.random.entity.User;
import com.gabrlaur.random.enums.Email;
import com.gabrlaur.random.enums.FirstName;
import com.gabrlaur.random.enums.LastName;
import com.gabrlaur.random.repository.UserRepository;
import com.gabrlaur.random.utils.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    Integer MAX_AGE = 99;

    UserRepository userRepository;

    private final RandomUtils randomUtils = new RandomUtils();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getRandomUser() {
        List<User> listOfUsers = (List<User>) userRepository.findAll();
        return listOfUsers.get(randomUtils.getRandomNumber(listOfUsers.size()));
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User createRandomUser() {
        User newUser = new User();
        newUser.setFirstName(FirstName.values()[randomUtils.getRandomNumber(FirstName.values().length)].toString());
        newUser.setLastName(LastName.values()[randomUtils.getRandomNumber(LastName.values().length)].toString());
        newUser.setEmail(randomUtils.getRandomEmail(newUser.getFirstName(), Email.values().length));
        newUser.setAge(randomUtils.getRandomNumber(MAX_AGE));
        return userRepository.save(newUser);
    }
}
