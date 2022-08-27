package edu.eci.ieti.tasks.controller;


import edu.eci.ieti.tasks.dto.UserDto;
import edu.eci.ieti.tasks.entities.User;
import edu.eci.ieti.tasks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/api/v1/users" )
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        //Get list of users and map them to dto users

        ModelMapper modelMapper = new ModelMapper();
        List<UserDto> usersDTO = new ArrayList<>();
        List<User> userList = userService.getAll();

        for (User user : userList) {
            usersDTO.add(modelMapper.map(user, UserDto.class));
        }
        return new ResponseEntity<>(usersDTO, HttpStatus.ACCEPTED);
    }


    @GetMapping( "/{id}" )
    public ResponseEntity<UserDto> findById(@PathVariable String id ) {
        ModelMapper modelMapper = new ModelMapper();
        userService.findById(id);
        return new ResponseEntity<>(modelMapper.map(userService.findById(id),UserDto.class), HttpStatus.ACCEPTED);
    }


    @PostMapping
    public ResponseEntity<UserDto> create( @RequestBody UserDto userDto ) {
        ModelMapper modelMapper = new ModelMapper();
        userService.create(modelMapper.map(userDto,User.class));
        return new ResponseEntity<>(userDto, HttpStatus.ACCEPTED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<UserDto> update( @RequestBody UserDto user, @PathVariable String id ) {
        ModelMapper modelMapper = new ModelMapper();
        userService.update(modelMapper.map(user,User.class), id);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) {
        userService.deleteById(id);
        return new ResponseEntity<>(true , HttpStatus.ACCEPTED);
    }



}
