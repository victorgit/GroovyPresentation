package e_json

import groovy.json.*

class Company {
    String name
    String address
    boolean hiring
}

class Person {
    String name
    Company company
    int daughters
}

def cs = new Company(name: "Commerce Sciences", hiring: true, address: "Herzelya")
def me = new Person(name:"Victor", daughters:2, company: cs)

def builder = new JsonBuilder(me)
println builder.toPrettyString()

