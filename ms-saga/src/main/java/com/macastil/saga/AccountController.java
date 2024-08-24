package com.macastil.saga;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final CommandGateway commandGateway;

    @Autowired
    public AccountController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public void createAccount(@RequestBody CreateAccountRequest request) {
        CreateAccountCommand command = new CreateAccountCommand(request.getAccountId(), request.getOwner());
        commandGateway.send(command);
    }
}

class CreateAccountRequest {
    private String accountId;
    private String owner;

    // Getters and setters
}