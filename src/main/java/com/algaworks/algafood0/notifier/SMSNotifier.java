package com.algaworks.algafood0.notifier;

import com.algaworks.algafood0.client.Client;

import org.springframework.stereotype.Component;

@Component
public class SMSNotifier implements Notifier {
  private boolean upperCase;

  @Override
  public void nofify(Client client, String message) {
    if (upperCase)
      message = message.toUpperCase();
    System.out.printf("Notificando %s atraves do telefone %s usando SMS: %s\n", client.getName(), client.getPhone(),
        message);

  }

}
