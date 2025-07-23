package com.macastil.saga;

public class CreateAccountCommand {
    private final String accountId;
    private final String owner;

    public CreateAccountCommand(String accountId, String owner) {
        this.accountId = accountId;
        this.owner = owner;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getOwner() {
        return owner;
    }
}