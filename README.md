# mobilepurchasesystem
Develop a Mobile Purchase System for a Mobile Sales Shop. This application is a part of the system. Consider customer doing full payment by cash, so payment details are not in the scope of our system. Assume mobile details are available in the table (TableName : mobiles). Each quantity is available for each mobile. In this system, administrator should be able to do the following process.
A)  Insert the customer and purchase details into database
Before inserting into database, do check that the quantity of the mobile should be greater than 0, else display error message.
B) Update the mobile quantity in mobiles table, once mobile is purchased by a customer.
C) View details of all mobiles available in the shop.
D) Delete a mobile details based on mobile id.
E) Search mobiles based on price range.
F) Write a test case for insert and search mobile service functionalities.
When a customer purchased a mobile, the customer and purchased details have to be inserted to the database through system.
Perform the following validations while accepting customer details:
Customer name: Valid value should contain maximum 20 alphabets. Out of 20 Characters, first character should be in UPPERCASE.
MailId: Should be valid mail id.
Phone Number: Valid value should contain 10 digits exactly.
MobileId: Valid value should contain only 4 digits and it should be one of the mobile id available in mobiles table.
PurchaseId: Generate automatically using sequence.
Purchasedate: Should be the current system date.
Note:
Use layered architecture while implementing application.
Handle all exceptions as a user defined exception.
Use data source for connecting to the database.
Read database details from properties file.
Use RegEx for performing validations.
Adhere to the coding standards and follow best practices.
Application should provide the menu options for the above requirements.
Assume mobile details are already available in the database.

Table Script to be used:
CREATE TABLE mobiles (mobileid NUMBER PRIMARY KEY, name VARCHAR2 (20), price Number (10, 2), quantity VARCHAR2 (20));
INSERT INTO mobiles VALUES ( 1001, ‘Nokia Lumia 520’, 8000, 20); INSERT INTO mobiles VALUES (1002,’Samsung Galaxy IV’, 38000, 40); INSERT INTO mobiles VALUES ( 1003, ‘Sony xperia C’, 15000, 30);//TO DO INSERT few more mobile details.
CREATE TABLE purchasedetails (purchase id NUMBER, cname VARCHAR2(20), mail id VARCHAR2(30), phoneno VARCHAR2(20), purchasedate DATE, mobileid references mobiles(mobileid));
