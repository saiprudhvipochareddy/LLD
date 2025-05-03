package com.example.whatsapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

  @NonNull
  //If we add javax dependency we can also add the NotNull
  private String name;
  @NonNull
  private String phone;
}
