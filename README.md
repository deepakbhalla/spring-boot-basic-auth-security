# spring-boot-basic-auth-security
Application to demonstrate Spring boot security using Basic Auth (Username and Password) as authentication type. 

This application covers the below functionalities:

1. <b>User Registration (API authentication is not required)</b>
   - New use registration without API authentication
2. <b>User Management (API authentication is required)</b>
   - Get all users
   - Delete a user
3. <b>Account Management (API authentication is required)</b>
    - Get all accounts
    - Get an account
    - Create new account
    - Update existing account
    - Delete existing account
4. <b>Transaction Management (API authentication is required)</b>
    - Deposit an amount to an account
    - Withdraw an amount from an account

### Project Technologies

- Java version: 17.0.8, vendor: Oracle Corporation
- Apache Maven 3.2.3
- Spring boot 3.1.5
- PostgreSql Database
- Spring boot JPA
- Spring security 6.1.5 (Implemented Basic Auth in this project)
- Lombok
- OpenApi 3 Specifications

### Database

PostgreSQL has been used in this project. Also, this project stores account's events in the form of JSON in JSONB column
in the application table.

JSON data types are for storing JSON (JavaScript Object Notation) data. Such data can also be stored as text, but the 
JSON data types have the advantage of enforcing that each stored value is valid according to the JSON rules. There are 
also assorted JSON-specific functions and operators available for data stored in these data types.

PostgreSQL offers two types for storing JSON data: 

- JSON 
- JSONB. 

1. JSON stores white space, and that is why we can see spaces when key "a" is stored, while JSONB does not.
2. JSON stores all the values of a key. This is the reason you can see multiple values (2 and 1) against the key "a", while JSONB only "stores" the last value.
3. JSON maintains the order in which elements are inserted, while JSONB maintains the "sorted" order.
4. JSONB objects are stored as a decompressed binary as opposed to "raw data" in JSON, where no reparsing of data is required during retrieval.
5. JSONB also supports indexing, which can be a significant advantage.

### OpenAPI Specification

- Path

http://localhost:8081/my-application/swagger-ui/index.html

- Swagger Authorization

![24_swagger_authorization.PNG](screenshots%2F24_swagger_authorization.PNG)

- Swagger UI Details

![25_swagger_ui.png](screenshots%2F25_swagger_ui.png)

### Disable OpenAPI Swagger for Production Environment

We can disable OpenAPI swagger for any environment based upon profiles. We can supply a VM argument 
'-Dspring.profiles.active=<environment name>' to the application configurations.
Using spring profile annotation @Profile("prod"), we can control the display of swagger.

- VM Argument

![img.png](screenshots/22_vm_argument_spring_active_profile.png)

If the value of spring profile is 'prod', then swagger won't be available. Please refer the below screenshot:

![img.png](screenshots/23_swagger_not_available.png)

### API Testing

- Postman Collection

![1_database_tables_script.PNG](screenshots%2F20_postman_collection.PNG)

- Database tables script

![1_database_tables_script.PNG](screenshots%2F1_database_tables_script.PNG)

- Users created on load

![2_Users_created_on_service_startup.PNG](screenshots%2F2_Users_created_on_service_startup.PNG)

- Create New User - Validation Error

![4_create_user_password_different_from_matching_password.PNG](screenshots%2F4_create_user_password_different_from_matching_password.PNG)

- Create User - Password and MatchPassword Does not Match Validation Error

![3_create_user_input_validation_error.PNG](screenshots%2F3_create_user_input_validation_error.PNG)

- Create User - Success - No Auth

![5_create_user_success.PNG](screenshots%2F5_create_user_success.PNG)

- Create User - No Auth Shown Under Authorization tab of Postman

![6_create_user_no_auth_required.PNG](screenshots%2F6_create_user_no_auth_required.PNG)

- Create User - New user created in database table 'user_table'

![7_created_user_in_user_table_in_database.PNG](screenshots%2F7_created_user_in_user_table_in_database.PNG)

- Get User - Not Authorized without authentication

![8_get_user_authentication_error.PNG](screenshots%2F8_get_user_authentication_error.PNG)

- Get Users - Successful with Basic Auth

![9_get_users_success_with_basic_auth.PNG](screenshots%2F9_get_users_success_with_basic_auth.PNG)

- Create Account - Not Authorized without authentication

![10_create_account_authentication_error.PNG](screenshots%2F10_create_account_authentication_error.PNG)

- Create Account - Successful with Basic Auth

![11_create_accounts_success_with_basic_auth.PNG](screenshots%2F11_create_accounts_success_with_basic_auth.PNG)

- Get All Accounts - Not Authorized without authentication

![12_get_all_accounts_authentication_error.PNG](screenshots%2F12_get_all_accounts_authentication_error.PNG)

- Get All Accounts - Successful with Basic Auth

![13_get_all_accounts_success_with_basic_auth.PNG](screenshots%2F13_get_all_accounts_success_with_basic_auth.PNG)

- Get Account Details - Not Authorized without authentication

![14_get_account_info_authentication_error.PNG](screenshots%2F14_get_account_info_authentication_error.PNG)

- Get All Accounts - Successful with Basic Auth

![15_get_account_info_success_with_basic_auth.PNG](screenshots%2F15_get_account_info_success_with_basic_auth.PNG)

- Deposit Amount to an Account - Not Authorized without authentication

![16_deposit_amount_authentication_error.PNG](screenshots%2F16_deposit_amount_authentication_error.PNG)

- Deposit Amount to an Account - Successful with Basic Auth

![17_deposit_amount_success_with_basic_auth.PNG](screenshots%2F17_deposit_amount_success_with_basic_auth.PNG)

- Withdraw Amount from an Account - Not Authorized without authentication

![18_withdraw_amount_authentication_error.PNG](screenshots%2F18_withdraw_amount_authentication_error.PNG)

- Withdraw Amount from an Account - Successful with Basic Auth

![19_withdraw_amount_success_with_basic_auth.PNG](screenshots%2F19_withdraw_amount_success_with_basic_auth.PNG)

