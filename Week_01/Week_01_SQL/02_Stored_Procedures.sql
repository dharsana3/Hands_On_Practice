Scenario 1 :

DROP PROCEDURE IF EXISTS ProcessMonthlyInterest;
DELIMITER $$
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
UPDATE loan l 
JOIN accounts a ON a.customerId = l.customerId 
SET a.balance = a.balance + (a.balance * l.interestRate/ 100);
END $$
DELIMITER ;
CALL ProcessMonthlyInterest();

Scenario 2 :

DROP PROCEDURE IF EXISTS UpdateEmployeeBonus ;
DELIMITER $$
CREATE PROCEDURE UpdateEmployeeBonus(IN p_deptId int, IN p_bonus_percent DECIMAL(10,2))
BEGIN
UPDATE employees
SET salary = salary + (salary * bonus_percent/ 100)
WHERE p_deptId = deptId;
END $$
DELIMITER ;
CALL UpdateEmployeeBonus(1, 10);

Scenario 3 :

DELIMITER $$
CREATE PROCEDURE TransferFunds(
    IN p_fromAccount INT,
    IN p_toAccount INT,
    IN p_amount DOUBLE
)
BEGIN
    IF (SELECT balance FROM accounts WHERE id = p_fromAccount) < p_amount THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance!';
    ELSE
        UPDATE accounts
        SET balance = balance - p_amount
        WHERE id = p_fromAccount;
        UPDATE accounts
        SET balance = balance + p_amount
        WHERE id = p_toAccount;
    END IF;
END$$
DELIMITER ;
CALL TransferFunds(101, 102, 3000);