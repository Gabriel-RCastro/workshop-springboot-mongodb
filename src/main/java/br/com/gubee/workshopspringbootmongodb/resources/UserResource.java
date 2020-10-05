package br.com.gubee.workshopspringbootmongodb.resources;

import br.com.gubee.workshopspringbootmongodb.domain.User;
import br.com.gubee.workshopspringbootmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>(service.findAll());
        return ResponseEntity.ok().body(list);
    }
}
