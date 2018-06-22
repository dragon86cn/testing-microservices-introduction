package com.ultimatesoftware.banking.account.common.events;

import java.util.UUID;

public class TransferFailedToStartEvent extends AccountTransactionEvent{
    public TransferFailedToStartEvent(UUID transactionId) {
        super(transactionId);
    }
}
