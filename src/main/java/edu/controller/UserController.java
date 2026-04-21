package edu.controller;

import edu.model.dto.UserDTO;
import edu.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping("/addUser")
    public void add(@RequestBody UserDTO userDTO){userService.add(userDTO);}

    @PutMapping("/update{id}")
    public void update(@RequestBody UserDTO userDTO){userService.update(userDTO);}

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){userService.delete(id);}


}

