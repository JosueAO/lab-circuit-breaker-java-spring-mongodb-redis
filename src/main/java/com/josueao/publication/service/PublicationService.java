package com.josueao.publication.service;

import com.josueao.publication.domain.Publication;
import com.josueao.publication.mapper.PublicationMapper;
import com.josueao.publication.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    @Autowired
    private PublicationMapper publicationMapper;

    public void insert(Publication publication) {
        var publicationEntity = publicationMapper.toPublicationEntity(publication);
        publicationRepository.save(publicationEntity);
    }

    public List<Publication> findAll() {
        var publication = publicationRepository.findAll();
        return publication.stream().map(publicationMapper::toPublication).toList();
    }

    public Publication findById(String id) {
        return publicationRepository.findById(id)
                .map(publicationMapper::toPublication)
                .orElseThrow(RuntimeException::new); // TODO Exception: Publication Not Found
    }
}
