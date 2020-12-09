package cl.everis.beca.Service;

import cl.everis.beca.Model.Client;
import cl.everis.beca.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client create(Client client){
        return clientRepository.save(client);
    }

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    public void delete(Client client){
        clientRepository.delete(client);
    }

    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }
}
