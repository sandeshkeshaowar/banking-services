package org.ms.transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ms.transactions.model.entity.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    /**
     * Finds transactions by account ID.
     *
     * @param accountId the ID of the account
     * @return a list of transactions
     */
    List<Transaction> findTransactionByAccountId(String accountId);

    /**
     * Returns a list of transactions that match the given reference ID.
     *
     * @param referenceId The reference ID to match against.
     * @return The list of transactions that match the reference ID.
     */
    List<Transaction> findTransactionByReferenceId(String referenceId);
}
