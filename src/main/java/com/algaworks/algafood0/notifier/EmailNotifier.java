package com.algaworks.algafood0.notifier;

import com.algaworks.algafood0.client.Client;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotifier implements Notifier {

  // @Getter
  // @Setter
  // private boolean upperCase;
  // private String hostServerSMTP;

  // public EmailNotifier(String hostServerSMTP) {
  // this.hostServerSMTP = hostServerSMTP;
  // this.upperCase = false;
  // System.out.println("Email Notifier");
  // }

  // public EmailNotifier(String hostServerSMTP, boolean upperCase) {
  // this.hostServerSMTP = hostServerSMTP;
  // this.upperCase = upperCase;
  // System.out.println("Email Notifier with upper case");
  // }

  @Override
  public void nofify(Client client, String message) {
    System.out.printf("Notificando %s atraves do e-mail %s usando SMTP %s: %s\n", client.getName(), client.getEmail(),
        message);
  }
}
