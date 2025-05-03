package com.example.whatsapp.service;

import com.example.whatsapp.entity.User;
import com.example.whatsapp.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User registerUser(String name, String phone) {
    User user = new User();
    user.setName(name);
    user.setPhone(phone);

    return userRepository.save(user);
  }

  public User getUser(Long userId) throws Exception {
    //Optional<User> helps you handle missing data safely without crashes.
    Optional<User> userOptional = userRepository.findById(userId);
    if (userOptional.isPresent()) {
      return userOptional.get();
    }

    throw new Exception("User Not Found!");
  }

}
