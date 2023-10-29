package com.example.security.basicauth.controllers;

import com.example.security.basicauth.model.Account;
import com.example.security.basicauth.model.User;
import com.example.security.basicauth.service.UserManagementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserManagementController {

    @Autowired
    UserManagementService userManagementService;

    @Operation(summary = "Get all accounts")
    @ApiResponse(responseCode = "200", description = "All existing users",
            content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Account.class))})
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
    public List<User> getAllUsers() {
        return this.userManagementService.getAllUsers();
    }
}
