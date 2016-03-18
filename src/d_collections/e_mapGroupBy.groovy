package d_collections

    class User {
            String name
            String city
            Date birthday
            public String toString() { name }
    }

     users = [
            new User(name: "mrhaki", city: "Tilburg",
                    birthday: Date.parse("yyyy-MM-dd", "1973-09-07")),
            new User(name: "bob", city: "New York",
                    birthday: Date.parse("yyyy-MM-dd", "1963-09-07")),
            new User(name: "britt", city: "Amsterdam",
                    birthday: Date.parse("yyyy-MM-dd", "1973-12-07")),
            new User(name: "kim", city: "Amsterdam",
                    birthday: Date.parse("yyyy-MM-dd", "1975-03-17")),
            new User(name: "liam", city: "Tilburg",
                    birthday: Date.parse("yyyy-MM-dd", "1973-09-05"))
    ]

    users.groupBy { it.city }
    users.groupBy ( {it.city}, {it.birthday.format('MMM')} )


