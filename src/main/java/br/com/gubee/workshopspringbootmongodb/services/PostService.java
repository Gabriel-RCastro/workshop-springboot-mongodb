package br.com.gubee.workshopspringbootmongodb.services;

import br.com.gubee.workshopspringbootmongodb.domain.Post;
import br.com.gubee.workshopspringbootmongodb.repository.PostRepository;
import br.com.gubee.workshopspringbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}