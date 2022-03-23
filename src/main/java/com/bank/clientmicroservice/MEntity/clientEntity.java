package com.bank.clientmicroservice.MEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("client")
@Getter
@Setter
@NoArgsConstructor
public class clientEntity {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String typeDoc;
    @Indexed(unique = true)
    private String numDoc;
    private String direction;
    private String telephone;
    private Date birthDate;
    private String registry;


}
