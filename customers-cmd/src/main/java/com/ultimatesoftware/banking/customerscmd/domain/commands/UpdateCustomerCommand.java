package com.ultimatesoftware.banking.customerscmd.domain.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.UUID;

public class UpdateCustomerCommand {
    @TargetAggregateIdentifier
    private UUID id;
    private String firstName;
    private String lastName;

    public UpdateCustomerCommand(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
