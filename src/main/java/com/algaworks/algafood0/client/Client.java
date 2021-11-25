package com.algaworks.algafood0.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
  private String name;
  private String email;
  private String phone;
  private boolean active = false;
}
