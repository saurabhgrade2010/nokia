create URL : https://demonokia.cfapps.us10.hana.ondemand.com/nokia/create  
method : post
Request Body : 
{
    "id": "",
    "name": "vikky",
    "phone": 9873258262,
    "email": "saurabhgrade2010@gmail.com",
    "address": "delhi",
    "country": "india",
    "department": "IT"
}

Response Body :

{
    "id": "10",
    "name": "vikky",
    "phone": 9873258262,
    "email": "saurabhgrade2010@gmail.com",
    "address": "delhi",
    "country": "india",
    "department": "IT"
}


update URL : https://demonokia.cfapps.us10.hana.ondemand.com/nokia/update
method type : put
Request Body :

{
    "id": "10",
    "name": "vikky singh",
    "phone": 9873258262,
    "email": "saurabhgrade2010@gmail.com",
    "address": "delhi",
    "country": "india",
    "department": "IT"
}

Response Body : 

{
    "id": "10",
    "name": "vikky singh",
    "phone": 9873258262,
    "email": "saurabhgrade2010@gmail.com",
    "address": "delhi",
    "country": "india",
    "department": "IT"
}

read URL : https://demonokia.cfapps.us10.hana.ondemand.com/nokia/get/user/{id}
Api Url : https://demonokia.cfapps.us10.hana.ondemand.com/nokia/get/user/10
method type : get

Request Body : none

Response Body : 

{
    "id": "10",
    "name": "vikky singh",
    "phone": 9873258262,
    "email": "saurabhgrade2010@gmail.com",
    "address": "delhi",
    "country": "india",
    "department": "IT"
}


read URL : https://demonokia.cfapps.us10.hana.ondemand.com/nokia/delete/{id}
Api Url : https://demonokia.cfapps.us10.hana.ondemand.com/nokia/delete/10
method type : delete

Request Body : none

Response Body : User Deleted

