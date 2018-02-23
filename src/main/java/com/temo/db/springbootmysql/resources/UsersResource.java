package com.temo.db.springbootmysql.resources;

import com.temo.db.springbootmysql.model.Users;
import com.temo.db.springbootmysql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UsersResource {


    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value ="/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users){
        usersRepository.save(users);
        return usersRepository.findAll();
    }
}




//        if(userRepository.findById(user.getId()) == null){
//                return new ResponseEntity<User>(HttpStatus.UNAUTHORIZED);
//        }
//
//        return new ResponseEntity<User>(HttpStatus.OK);