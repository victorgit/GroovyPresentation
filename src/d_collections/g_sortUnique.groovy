package d_collections



    person1 = [new Person(username: "user1", email: "user1@cs.com", city: "Tel Aviv")]
    person2 = [username: "user1", email: "user3@cs.com", city: "Hertzelya"]
    person3 = [username: "user2", email: "user3@cs.com", city: "Kfar Saba"]
    person4 = [username: "user2", email: "user1@cs.com", city: "Tel Aviv"]

    persons = [person1, person2, person3, person4]

    persons.sort()
    persons.sort { it.username }
    persons.sort { it.username ?: it.email }

    persons.unique()
    persons.unique { it.email }
    persons.unique { p1, p2 -> p1.email <=> p2.email ?: p1.username <=> p2.username }





