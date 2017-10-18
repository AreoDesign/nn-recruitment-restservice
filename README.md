Please readme first:

Please enter "http://localhost:8080/swagger-ui.html#" URL in web browser in order to use Swagger Rest API. Then click onto "user-controller:User Controller" in order to see what requests may be handled by this particular REST controller.

Functionalities:
1. GET HTTP method handled under "/user/info/" URL request. Data is taken from given GitHub API and mapped onto implemented UserEntity class.
2. POST HTTP method request is handled under URL "/user/info/static/add". Implemented method for new User addition to hardcoded List of 4 Users (initial db).
3. Modified (divided) URL request for handling User information:
    - GET HTTP method handled under "/user/info/static/all" -> gets information of all Users
    - GET HTTP method handled under "/user/info/static/{id}" -> gets information of a particular User by id