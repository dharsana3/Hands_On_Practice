Scenario 1 :

DROP PROCEDURE IF EXISTS updateInterest;

DELIMITER $$
CREATE PROCEDURE updateInterest()
BEGIN

DECLARE v_loanId int;
DECLARE done boolean;

DECLARE cal CURSOR FOR
	SELECT l.loanId
    FROM customer c
    JOIN loan l ON c.customerId = l.customerId
    WHERE c.age > 60;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

OPEN cal;

cus: LOOP
	FETCH cal INTO v_loanId;
    IF done = 1 THEN
		LEAVE cus;
	END IF;
    UPDATE loan SET interestRate = interestRate - 1
    WHERE v_loanId = loanId;
    
END LOOP;

CLOSE cal;

END$$
DELIMITER ;

CALL updateInterest();


Scenario 2 :


DROP PROCEDURE IF EXISTS updateFlag;

DELIMITER $$
CREATE PROCEDURE updateFlag()
BEGIN

DECLARE v_customerId int;
DECLARE done boolean;

DECLARE cal CURSOR FOR
	SELECT c.customerId
    FROM customer c
    JOIN accounts a ON c.customerId = a.customerId
    WHERE a.balance > 10000;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

OPEN cal;

cus: LOOP
	FETCH cal INTO v_customerId;
    IF done = 1 THEN
		LEAVE cus;
	END IF;
    UPDATE customer SET isVip = TRUE
    WHERE v_customerId = customerId;
    
END LOOP;

CLOSE cal;

END$$
DELIMITER ;

CALL updateFlag();


Scenario 3 :

DROP PROCEDURE IF EXISTS reminder;

DELIMITER $$
CREATE PROCEDURE reminder()
BEGIN

DECLARE v_dueDate DATE;
DECLARE v_customerId int;
DECLARE done boolean;

DECLARE cal CURSOR FOR
	SELECT c.customerId, l.dueDate
    FROM customer c
    JOIN loan l ON c.customerId = l.customerId
    WHERE l.dueDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

OPEN cal;

cus: LOOP
	FETCH cal INTO v_customerId, v_dueDate;
    IF done = 1 THEN
		LEAVE cus;
	END IF;
    SELECT CONCAT('Customer ', v_customerId, ': Your loan is due on ', v_dueDate) AS Message;
    
END LOOP;

CLOSE cal;

END$$
DELIMITER ;

CALL reminder();

