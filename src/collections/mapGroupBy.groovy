package collections

class User {
    String name
    String city
    Date birthday

    public String toString() { name }
}

def BIRTHDAY_FORMAT = "yyyy-MM-dd"

def users = [
        new User(name: "mrhaki", city: "Tilburg", birthday: Date.parse(BIRTHDAY_FORMAT, "1973-09-07")),
        new User(name: "bob", city: "New York", birthday: Date.parse(BIRTHDAY_FORMAT, "1963-09-07")),
        new User(name: "britt", city: "Amsterdam", birthday: Date.parse(BIRTHDAY_FORMAT, "1973-12-07")),
        new User(name: "kim", city: "Amsterdam", birthday: Date.parse(BIRTHDAY_FORMAT, "1975-03-17")),
        new User(name: "liam", city: "Tilburg", birthday: Date.parse(BIRTHDAY_FORMAT, "1973-09-05"))
]

println users.groupBy { it.city }

println users.groupBy({it.city}, {it.birthday.format('MMM')})
