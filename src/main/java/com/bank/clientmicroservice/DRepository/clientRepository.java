package com.bank.clientmicroservice.DRepository;

import com.bank.clientmicroservice.MEntity.clientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface clientRepository extends MongoRepository<clientEntity,String>  {
    public Optional<clientEntity> findByName(String name);

}
