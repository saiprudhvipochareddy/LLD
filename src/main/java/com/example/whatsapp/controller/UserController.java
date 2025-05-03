package com.example.whatsapp.controller;

import com.example.whatsapp.entity.User;
import com.example.whatsapp.model.UserDTO;
import com.example.whatsapp.service.UserService;
import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public User registerUser(@RequestBody @Validated UserDTO userDTO) {
    return userService.registerUser(userDTO.getName(), userDTO.getPhone());
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable Long id) throws Exception {
    return userService.getUser(id);
  }
}
