package sensedia.com.projectpdi.interfaceAdapters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sensedia.com.projectpdi.infrastructure.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findClientByCPF(String cpf);
}
