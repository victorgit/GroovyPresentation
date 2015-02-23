package e_json

import groovy.json.*

def jsonSlurper = new JsonSlurper()
def john = jsonSlurper.parseText('{ "name": "John Doe" }')
assert "John Doe" == john.name
assert java.util.HashMap == john.getClass()

john = jsonSlurper.parseText('{ "name": "John Doe" }  /* a comment */')
assert "John Doe" == john.name

def list = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')
assert [4, 8, 15, 16, 23, 42] == list.myList
assert java.util.ArrayList == list.myList.getClass()

def object = jsonSlurper.parseText '''
     { "simple": 123,
       "fraction": 123.66,
       "exponential": 123e12
     }'''

assert 123 == object.simple
assert java.lang.Integer == object.simple.getClass()
assert 123.66 == object.fraction
assert java.math.BigDecimal == object.fraction.getClass()


class User {
    String name
    String address
}

User u = new User(name:"Victor", address: "Kfar Sava")

def json = new JsonBuilder(u).toPrettyString()

new JsonSlurper().parseText(json) as User



