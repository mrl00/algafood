package com.algaworks.algafood0.notifier;

import com.algaworks.algafood0.client.Client;

public interface Notifier {
  public void nofify(Client client, String message);
}
