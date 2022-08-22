package sensedia.com.projectpdi.infrastructure.data.sqlserver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import sensedia.com.projectpdi.infrastructure.entities.Client;
import sensedia.com.projectpdi.interfaceAdapters.gateway.ClientGateway;
import sensedia.com.projectpdi.interfaceAdapters.repositories.ClientRepository;

@Repository
@AllArgsConstructor
public class ClientSqlServer implements ClientGateway {

    private final ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client findClientByCPF(String cpf) {
        return clientRepository.findClientByCPF(cpf);
    }


}
