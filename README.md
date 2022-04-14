# Springboot-REST-LMS

	All List of Library's users
	GET
	http://localhost:8008/api/users
	
	API Endpoints api/users
	
	Response
	
	[
	    {
	        "userid": "111-1",
	        "name": "Shruti",
	        "address": "Kanpur",
	        "book1issue": "",
	        "book2issue": "",
	        "book1return": "",
	        "book2return": "",
	        "_links": {
	            "self": {
	                "href": "http://localhost:8008/api/user/111-1"
	            }
	        }
	    },
	    {
	        "userid": "111-2",
	        "name": "Ketan",
	        "address": "Pune",
	        "book1issue": "",
	        "book2issue": "",
	        "book1return": "",
	        "book2return": "",
	        "_links": {
	            "self": {
	                "href": "http://localhost:8008/api/user/111-2"
	            }
	        }
	    }
	]
	
	![image](https://user-images.githubusercontent.com/54240204/163479691-f703026d-7691-4865-b5aa-2769f8bc62fb.png)

	All List of book in Library
	
	GET
	api/books
	http://localhost:8008/api/books
	
	Response
	
	[
	    {
	        "isbn": "111-1",
	        "title": "Let us C",
	        "author": "Deepti Verma",
	        "publisher": "pbs publisher",
	        "status": "Avilable",
	        "borrower": "none",
	        "borrowDate": "none",
	        "returnDate": "none",
	        "_links": {
	            "self": {
	                "href": "http://localhost:8008/api/book/111-1"
	            }
	        }
	    },
	    {
	        "isbn": "111-2",
	        "title": "Gita",
	        "author": "Lord Krishna",
	        "publisher": "pbs publisher",
	        "status": "Avilable",
	        "borrower": "none",
	        "borrowDate": "none",
	        "returnDate": "none",
	        "_links": {
	            "self": {
	                "href": "http://localhost:8008/api/book/111-2"
	            }
	        }
	    }
	]





1) Ability to add books to the system.

	POST
	api/books
	
	http://localhost:8008/api/book
	
	Request Pay load or body
	
	{
		"isbn": "111-5",
	 	"title": ".net",
	 	"author": "microsoft", 	
	 	"publisher": "PBS",
	 	"status": "Avilable",
	 	"borrower": "none",
	 	"borrowDate": "none",
	 	"returnDate": "none"
	        
	}
	
	Response 
	
	{
	    "isbn": "111-5",
	    "title": ".net",
	    "author": "microsoft",
	    "_links": {
	        "self": {
	            "href": "http://localhost:8008/api/book/111-5"
	        },
	        "Books": {
	            "href": "http://localhost:8008/api/books"
	        }
	    }
	}



2) Ability to add users to the system.

	POST
	api/users`

	http://localhost:8008/api/user
	
	Request Pay load
	
	{
		"userid": "111-5",
		"name": "Shweta Agarwal",
	    "address": "Dublin, Ireland",
	    "book1issue": "",
	    "book2issue": "",
	    "book1return": "",
	    "book2return": ""
	    
	}
	
	Response
	
	{
	    "userid": "111-5",
	    "name": "Shweta Agarwal",
	    "address": "Dublin, Ireland",
	    "book1issue": null,
	    "book2issue": null,
	    "book1return": null,
	    "book2return": null,
	    "_links": {
	        "self": {
	            "href": "http://localhost:8008/api/user/111-5"
	        },
	        "Users": {
	            "href": "http://localhost:8008/api/users"
	        }
	     }
	}

3) Ability to lend books to users.

	GET
	API End point lendbook/{user id}/{book id}
	request example 
	
	Get Method and link 
	
	http://localhost:8008/api/lendbook/111-1/111-1
	
	Response
	{
	    "userid": "111-1",
	    "name": "Shruti",
	    "address": "Agarwal",
	    "book1issue": "Book 1 Issue :Let us C",
	    "book2issue": null,
	    "book3issue": null,
	    "book1return": null,
	    "book2return": null,
	    "book3return": null
	}


4) Ability to return books to the library.

	GET
	API End point return/{user id}/{book id}
	
	request example 
	
	Get Method and link 
	
	http://localhost:8008/api/return/111-1/111-1
	
	Response
	
	[
	    {
	        "isbn": "111-1",
	        "title": "Let us C",
	        "author": "Deepti Verma",
	        "publisher": "pbs publisher",
	        "status": "Avilable",
	        "borrower": "none",
	        "borrowDate": "none",
	        "returnDate": "none",
	        "_links": {
	            "self": {
	                "href": "http://localhost:8008/api/book/111-1"
	            }
	        }
	    }
	]




5) Ability to limit the number of books borrowed by user.

	"Only max 3  books can borrowed by per user";
	if he try more then 3 books will get user.status = "You [user id ]"+userid +"have used total limit as only max 3  books can borrowed by per user"


6) Ability to search a book by title, author.

	search a book by title
	API End point api/search/book/{title}
	
	request example (search a book by title("Gita"))

	Get Method and link 	
	http://localhost:8008/api/search/book/Gita
	
	Response
	[
    {
        "isbn": "111-2",
        "title": "Gita",
        "author": "Lord Krishna",
        "publisher": "Kbs publisher",
        "status": "Avilable",
        "borrower": "none",
        "borrowDate": "none",
        "returnDate": "none"
    }
]
	


	search a book by author
	API End point api/search/book/{author}
	
	request example (search a book by author("Deepti"))

	Get Method and link 	
	http://localhost:8008/api/search/book/Deepti
	
	Response
	[
    {
        "isbn": "111-5",
        "title": "Let us C",
        "author": "Deepti Verma",
        "publisher": "pbs publisher",
        "status": "Avilable",
        "borrower": "none",
        "borrowDate": "none",
        "returnDate": "none"
    }
   ]



7) Ability to search a user by name.

I have added 2 user with same name and name is  "Shruti"


GET
API End point api/search/user/{name}

request example 

Get Method and link  

http://localhost:8008/api/search/user/Shruti

Response
[
    {
        "userid": "111-1",
        "name": "Shruti",
        "address": "Kanpur",
        "book1issue": "none",
        "book2issue": "none",
        "book3issue": "none",
        "book1return": "none",
        "book2return": "none",
        "book3return": "none",
        "status": "none",
        "_links": {
            "self": {
                "href": "http://localhost:8008/api/user/Shruti"
            },
            "Users": {
                "href": "http://localhost:8008/api/users"
            }
        }
    },
    {
        "userid": "111-4",
        "name": "Shruti",
        "address": "Kanpur",
        "book1issue": "111-1",
        "book2issue": "111-2",
        "book3issue": "111-3",
        "book1return": "none",
        "book2return": "none",
        "book3return": "none",
        "status": "none",
        "_links": {
            "self": {
                "href": "http://localhost:8008/api/user/Shruti"
            },
            "Users": {
                "href": "http://localhost:8008/api/users"
            }
        }
    }
]

##Tools
	*STS
	*SpringBoot
	*SpringBoot Initialiser

## Installation
* Ensure that Java 8 and Maven 3.2 are installed
* Clone this repo: https://github.com/Agarwal-Shruti/springboot-lms.git
    
## Usage
### Running the Spring Boot app
Navigate to the directory into which you cloned the repository and execute the command below:
`mvn spring-boot:run`

Once started you can access the APIs on port 8008, e.g.
`http://localhost:8008/api/books`

The port number can be changed by editing the port property in `src/main/resources/application.yml`

