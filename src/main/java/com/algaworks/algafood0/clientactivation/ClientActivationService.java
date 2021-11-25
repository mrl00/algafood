package com.algaworks.algafood0.clientactivation;

import com.algaworks.algafood0.client.Client;
import com.algaworks.algafood0.notifier.Notifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientActivationService {

  /*
   * 1. forma de resolver ambiguidade de dependencias
   */
  // @Autowired
  // private List<Notifier> notifier;
  // public void activate(Client client) {
  // client.setActive(true);
  // notifier.forEach(n -> n.nofify(client, "Seu cadastro no sistema esta
  // ativo"));
  // }

  @Autowired
  private Notifier notifier;

  // @Autowired
  // public ClientActivationService(Notifier notifier) {
  // this.notifier = notifier;
  // System.out.println("Client Activiation Service: " + notifier);
  // }
  public void activate(Client client) {
    client.setActive(true);
    notifier.nofify(client, "Seu cadastro no sistema esta  ativo");
  }
}
