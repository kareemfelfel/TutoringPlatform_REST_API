# Tutoring Platform REST API
This Spring Boot API is based on the PHP logic of the [Tutoring Platform](https://github.com/kareemfelfel/Tutoring_Platform)
So, check the README file in the Tutoring Platform repository.

## Testing:
1. To test this API, first thing you need to have is Postman to be able to send Post, update, delete, and get requests from the API easily using JSON objects.
2. run the .jar in **TutorsPlatform > target > TutorsPlatform-0.0.1-SNAPSHOT.jar** using the java - jar command.
3. Open postman and navigate to **localhost:8080/users/**
- Here you can Post an example of a user: 
```
{
    "id" : "14431",
    "firstName": "John",
    "lastName" : "Doe",
    "is_student" : 0,
    "is_tutor" : 0,
    "is_professor" : 1,
    "email" : "testuser@yahoo.com"
}
```
- Then, you can use the delete and get requests using the id at **localhost:8080/users/{id}**
- To update a user: **localhost:8080/users/** then use appropriate put request
```
{
    "id" : "14431",
    "firstName": "Updated First Name",
    "lastName" : "Updated Last Name",
    "is_student" : 0,
    "is_tutor" : 0,
    "is_professor" : 1,
    "email" : "testuser@yahoo.com"
}
```
4. To add a class for an appropriate tutor or professor, navigate to **localhost:8080/users/tutors/{id}/classes** or **localhost:8080/users/professors/{id}/classes**
- An example of a post request for an appropriate user:
```
{
    "class_id" : "2",
    "name": "CIS 403"
}
```
- Then you can use the same **localhost:8080/users/tutors/{id}/classes** or **localhost:8080/users/professors/{id}/classes** for a get request.


