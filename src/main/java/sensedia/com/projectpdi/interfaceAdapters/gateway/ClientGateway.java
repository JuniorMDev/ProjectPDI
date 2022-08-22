package sensedia.com.projectpdi.interfaceAdapters.gateway;

import sensedia.com.projectpdi.infrastructure.entities.Client;

public interface ClientGateway {
    Client create(Client client);

    Client findClientByCPF(String cpf);
}
