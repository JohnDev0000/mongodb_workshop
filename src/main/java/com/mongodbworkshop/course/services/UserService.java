package com.mongodbworkshop.course.services;

import com.mongodbworkshop.course.domain.User;
import com.mongodbworkshop.course.repository.UserRepository;
import com.mongodbworkshop.course.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
