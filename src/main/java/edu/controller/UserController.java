package edu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {


}

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {


    private final AdminService adminService;

    @GetMapping("/getAll")
    public List<AdminDTO> getAll(AdminDTO adminDTO) {
        return adminService.getAll(adminDTO);
    }

    @PostMapping("/addAdmin")
    public void add(@RequestBody AdminDTO adminDTO) {
        adminService.add(adminDTO);
    }
    @PutMapping("/update{id}")
    public void update(@RequestBody AdminDTO adminDTO) {
        adminService.update(adminDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id ) {
        adminService.delete(id);
    }

    @PostMapping("/login")
    public String login(@RequestBody AdminDTO adminDTO) {
        return adminService.login(adminDTO);
    }


}