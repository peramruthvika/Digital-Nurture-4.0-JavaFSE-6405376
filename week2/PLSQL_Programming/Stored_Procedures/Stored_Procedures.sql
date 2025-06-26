SET SERVEROUTPUT ON;
-- scenario1

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        UPDATE Accounts
        SET Balance = acc.Balance + (acc.Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;

        DBMS_OUTPUT.PUT_LINE('Interest added to Account ID: ' || acc.AccountID);
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
END;
/


BEGIN
    ProcessMonthlyInterest;
END;
/


-- scenario2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_percent IN NUMBER
) IS
BEGIN
    FOR emp IN (
        SELECT EmployeeID, Salary
        FROM Employees
        WHERE Department = dept_name
    ) LOOP
        UPDATE Employees
        SET Salary = Salary + (emp.Salary * bonus_percent / 100)
        WHERE EmployeeID = emp.EmployeeID;

        DBMS_OUTPUT.PUT_LINE('Bonus applied to Employee ID: ' || emp.EmployeeID);
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Bonus updated for department: ' || dept_name);
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 10); -- 10% bonus to IT employees
END;
/



-- scenario3
CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account_id IN NUMBER,
    to_account_id IN NUMBER,
    amount IN NUMBER
) IS
    source_balance NUMBER;
BEGIN
    -- Get source account balance
    SELECT Balance INTO source_balance
    FROM Accounts
    WHERE AccountID = from_account_id;

    -- Check if source has enough balance
    IF source_balance < amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
    ELSE
        -- Deduct from source
        UPDATE Accounts
        SET Balance = Balance - amount,
            LastModified = SYSDATE
        WHERE AccountID = from_account_id;

        -- Add to destination
        UPDATE Accounts
        SET Balance = Balance + amount,
            LastModified = SYSDATE
        WHERE AccountID = to_account_id;

        DBMS_OUTPUT.PUT_LINE('Transferred ₹' || amount ||
                             ' from Account ID ' || from_account_id ||
                             ' to Account ID ' || to_account_id);
    END IF;
END;
/


BEGIN
    TransferFunds(1, 2, 300); -- ₹300 from Account 1 to Account 2
END;
/
