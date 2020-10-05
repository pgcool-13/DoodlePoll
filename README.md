 DoodlePoll
Rest API to fetch polls based on filter parameters passed

Objective(Task description):
----------------------------
We would like you to implement a simple Restful API with similar functionality. This is the functionality that your API should support:

1. List all polls created by a user
2. Search polls by its title
3. List all polls created after a certain date

Given the polls.json file, which contain some data that you can use to bootstrap your database. We expect the responses from your API to be compatible with the shape of the polls in that file.

Introduction:
-------------
This is a assignment project for implementing a REST API to be able to fetch poll data from database based on above mentioned filters.

Tools and technologies used:
----------------------------
1. Java 11 (Language)
2. SpringBoot (Framework)
3. JPA (ORM)
4. PostgreSQL (Database)
5. Lombok (Remove boilerplate code)
6. hibernate-types-52 (To support json data type in POJO)
7. Jackson databind (To map json file to List)

Steps to configure for running the project:
-------------------------------------------
1. Run the docker container 
docker-compose build, then docker-compose up

Features included if given more time:
-------------------------------------------
1. Create swagger api page
2. Proper Exception handling
3. Build single api for quering polls with multiple filters using custom query specifications
4. Add unit test cases

Sample Requests:
-------------------------------------------
1. List all polls created by a user

GET http://localhost:8080/api/polls/user/mh+sample@doodle.com

2. Search polls by its title

GET http://localhost:8000/api/polls/title/كم عدد الأخطاء الإملائية والنحوية يمكنك بقعة في النص؟

3. List all polls created after a certain date

GET http://localhost:8080/api/polls/date/2017-01-25 23:50:43
