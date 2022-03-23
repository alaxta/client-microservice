package com.bank.clientmicroservice.BController;

import com.bank.clientmicroservice.DRepository.clientRepository;
import com.bank.clientmicroservice.MEntity.clientEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
public class clientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(clientController.class);
    @Autowired
    private clientRepository client;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<clientEntity> getAlClient(){
        LOGGER.debug("List client!");
    return client.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public  void createClient(@RequestBody clientEntity clientEntity){
        LOGGER.debug("List client!");
        client.save(clientEntity);
    }
//    public ResponseEntity <List<productEntity>> getAllProduct(){
//    List<productEntity>  productEntities =productRepository.findAll();
//    ResponseEntity <List<productEntity>> responseEntity= new ResponseEntity<>(productEntities,HttpStatus.OK);
//    return responseEntity;
//    }
        //}

    @GetMapping("/{id}")
    public Optional<clientEntity> findById(@PathVariable String id){
        return client.findById(id);
    }

    @PutMapping
    public void update(@RequestBody clientEntity clientEntity){
        client.save(clientEntity);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        client.findById(id);
    }

    @GetMapping("/search/{name}")
    public Optional<clientEntity> findByName(@PathVariable String name){
        return client.findByName(name);
    }
}
