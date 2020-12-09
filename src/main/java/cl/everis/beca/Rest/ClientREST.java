package cl.everis.beca.Rest;

import cl.everis.beca.Model.Client;
import cl.everis.beca.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client/")
public class ClientREST {
    @Autowired
    private ClientService clientService;

    @PostMapping
    private ResponseEntity<Client> save(@RequestBody Client client) {
        Client temp = clientService.create(client);

        try {
            return ResponseEntity.created(new URI("/api/client" + temp.getId())).body(temp);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Client>> listAll() {
        return ResponseEntity.ok(clientService.getAllClient());
    }

    @DeleteMapping
    private ResponseEntity<Void> deleteClient(@RequestBody Client client) {
        clientService.delete(client);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Client>> listById(@PathVariable ("id") Long id) {
        return ResponseEntity.ok(clientService.findById(id));
    }
}
