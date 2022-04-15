## User Login and Registration Backend + Email Verification

### Project Architecture

````The Person here should have the USER or ADMIN role access to access the API endpoints of a application.````

<img width="1035" alt="Screenshot 2022-04-13 at 10 44 40 PM" src="https://user-images.githubusercontent.com/58394648/163614028-16653ef4-3741-4cff-ab98-662aeb36b607.png">

## Email verification link with expiry
![Screenshot 2021-01-13 at 23 37 33](https://user-images.githubusercontent.com/40702606/104789893-0c674880-578e-11eb-939a-2a1cd3a8dfd2.png)

## Example requests
### Postman
![Screenshot 2021-01-13 at 23 37 57](https://user-images.githubusercontent.com/40702606/104790087-7a137480-578e-11eb-8141-307a8850c39e.png)

### CURL
```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Amigos",
    "lastName": "Code",
    "email": "hellow@amigoscode.com",
    "password": "password"
}'
```
