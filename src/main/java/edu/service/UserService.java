package edu.service;

import edu.model.dto.UserDTO;

public interface UserService {
    void add(UserDTO userDTO);

    void update(UserDTO userDTO);

    void delete(Long id);

    void getAll(UserDTO userDTO);
}