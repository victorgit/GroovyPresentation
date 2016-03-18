package d_collections

    @groovy.transform.Sortable
    @groovy.transform.ToString
    class Person {
        String username, email, city
    }

    person1 = new Person(username: "user1", email: "user1@cs.com", city: "Tel Aviv")
    person2 = new Person(username: "user1", email: "user3@cs.com", city: "Hertzelya")

    person3 = [username: "user2", email: "user3@cs.com", city: "Kfar Saba"]
    person4 = [username: "user2", email: "user1@cs.com", city: "Tel Aviv"]

    persons = [person1, person2, person3, person4]
    immutable = persons.asImmutable()

    assert persons.class.name == 'java.util.ArrayList'
    assert immutable.class.name == 'java.util.Collections$UnmodifiableRandomAccessList'

    persons.sort()
    sortedPersons = immutable.toSorted()

