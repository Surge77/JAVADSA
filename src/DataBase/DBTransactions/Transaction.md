# Database Transaction

> What is a Database transaction?

In real life situations, we might need to execute a series of queries in order to accomplish a task. We might do a club of CRUB Operations. These series of operations can execute a single unit of work and hence these series of operations are called as DB transactions.


### Intermediate state of transactions

An **intermediate state** in a database transaction refers to the state of the database after some operations within the transaction have been executed but before the transaction has been either **committed** or **rolled back**. During this time, the changes are temporary and visible only to the transaction itself, not to other users or transactions.


### ACID Properties 

The **ACID properties** are a set of principles that ensure reliable processing of database transactions. They are essential for maintaining data integrity, consistency, and reliability in the event of system failures, concurrent access, or errors during transaction execution.

### The ACID Properties:

1. **Atomicity**:

   * Ensures that a transaction is treated as a single, indivisible unit.
   * **All or Nothing**: Either all operations within the transaction are successfully completed, or none of them are applied.
   * If any part of the transaction fails, all changes made during the transaction are rolled back.

   **Example**: In a fund transfer between two accounts:

   * Debit ₹1,000 from Account A.
   * Credit ₹1,000 to Account B.

   If the debit succeeds but the credit fails, the entire transaction is rolled back to ensure consistency.
2. **Consistency**:

   * Ensures that a transaction transforms the database from one valid state to another.
   * All database rules (constraints, triggers, etc.) are maintained before and after the transaction.

   **Example**:

   * A transaction that deducts money from one account and adds it to another should ensure the total balance across accounts remains the same.
3. **Isolation**:

   * Ensures that transactions execute independently of one another.
   * Changes made in one transaction are not visible to other transactions until the transaction is committed.
   * **Isolation Levels**: Read Uncommitted, Read Committed, Repeatable Read, Serializable.

   **Example**: If two users are updating the same data concurrently, isolation prevents them from interfering with each other’s transactions.
4. **Durability**:

   * Ensures that once a transaction is committed, its changes are permanent, even in the event of a system crash or power failure.
   * Data is saved to a non-volatile storage medium like a hard disk or SSD.
