package e_json

import groovy.json.*

def me = [:]
me.name = "Victor"
me.daughters = 2
me.company = [:]
me.company.name = "Commerce Sciences"
me.company.hiring = true
me.company.address = "Herzelya"


def builder = new JsonBuilder(me)
println builder.toPrettyString()

