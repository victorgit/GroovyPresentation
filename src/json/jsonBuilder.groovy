package json

import groovy.json.*

def builder = new JsonBuilder()
builder.people {
    person {
        firstName 'Guillame'
        lastName 'Laforge'
        address(
            city: 'Paris',
            country: 'France',
            zip: 12345,
        )
        married true
        // a list of values
        conferences 'JavaOne', 'Gr8conf'
    }
}
println builder.toString()
println builder.toPrettyString()

