package com.macastil.saga;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class AccountAggregate {

    @AggregateIdentifier
    private String accountId;
    private String owner;

    public AccountAggregate() {
        // Required by Axon
    }

    @CommandHandler
    public AccountAggregate(CreateAccountCommand command) {
        apply(new AccountCreatedEvent(command.getAccountId(), command.getOwner()));
    }

    @EventSourcingHandler
    public void on(AccountCreatedEvent event) {
        this.accountId = event.getAccountId();
        this.owner = event.getOwner();
    }
}