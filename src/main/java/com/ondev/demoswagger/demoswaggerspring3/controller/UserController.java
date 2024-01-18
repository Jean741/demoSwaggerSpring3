package com.ondev.demoswagger.demoswaggerspring3.controller;

import com.ondev.demoswagger.demoswaggerspring3.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author MJean-Claude
 */
@RestController
@RequestMapping(("users"))
public class UserController {
    private List<UserDto> listeOfUsers= Arrays.asList(
            UserDto.builder().id(UUID.randomUUID().toString()).name("Name 1").surname("surname1")
                    .age(10L).build(),
            UserDto.builder().id(UUID.randomUUID().toString()).name("Name 2").surname("surname2")
                    .age(20L).build(),
            UserDto.builder().id(UUID.randomUUID().toString()).name("Name 3").surname("surname3")
                    .age(18L).build(),
            UserDto.builder().id(UUID.randomUUID().toString()).name("Name 4").surname("surname4")
                    .age(30L).build()
            );

    @GetMapping("all")
    public List<UserDto> getUsers(){
        return listeOfUsers;
    }
    @GetMapping("majors")
    public List<UserDto> getMajorUsers(){
        return listeOfUsers.stream().filter(UserDto::isMajor).toList();
    }
    @GetMapping("minors")
    public List<UserDto> getMinorUsers(){
        return listeOfUsers.stream().filter(UserDto::isMinor).toList();
    }
}
