package com.josueao.publication.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document(collection = "publications")
public class PublicationEntity {

    @MongoId
    //@Field("_id")
    private String id;
    private String title;
    private String imageUrl;
    private String text;

}
