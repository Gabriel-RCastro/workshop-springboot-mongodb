package br.com.gubee.workshopspringbootmongodb.services;

import br.com.gubee.workshopspringbootmongodb.domain.User;
import br.com.gubee.workshopspringbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
