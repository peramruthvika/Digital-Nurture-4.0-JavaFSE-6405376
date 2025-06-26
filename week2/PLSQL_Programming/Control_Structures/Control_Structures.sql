SET SERVEROUTPUT ON;


ALTER TABLE Customers ADD (IsVIP CHAR(1)); -- Y or N


-- Scenario1
BEGIN
    FOR cust IN (SELECT CustomerID, Name, DOB FROM Customers) LOOP
        IF FLOOR(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12) > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Discount applied for ' || cust.Name || 
                                 ' (CustomerID: ' || cust.CustomerID || ')');
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Finished applying discounts to eligible senior citizens.');
END;
/


-- scenario2
BEGIN
    FOR cust IN (SELECT CustomerID, Name, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(cust.Name || ' (CustomerID: ' || cust.CustomerID || ') is now a VIP.');
        ELSE
            UPDATE Customers
            SET IsVIP = 'N'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(cust.Name || ' (CustomerID: ' || cust.CustomerID || ') is NOT a VIP.');
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('VIP status updated for all customers.');
END;
/


-- scenario3
SET SERVEROUTPUT ON;
DECLARE
    v_name Customers.Name%TYPE;
    v_found BOOLEAN := FALSE;
BEGIN
    FOR l IN (
        SELECT LoanID, CustomerID, EndDate 
        FROM Loans 
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        SELECT Name INTO v_name FROM Customers WHERE CustomerID = l.CustomerID;
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || l.LoanID || ' for customer ' || v_name || 
                             ' is due on ' || TO_CHAR(l.EndDate, 'DD-MON-YYYY'));
        v_found := TRUE;
    END LOOP;

    IF NOT v_found THEN
        DBMS_OUTPUT.PUT_LINE('No loans are due in the next 30 days.');
    END IF;
END;
/
