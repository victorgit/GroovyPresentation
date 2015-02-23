package f_http

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

    http = new HTTPBuilder('http://jsonplaceholder.typicode.com')


    def fetchAlbum() {
        http.request(  GET, JSON ) { req ->
            uri.path = "/albums/1"

            response.success = { resp, json ->
                println "Got response: ${resp.statusLine}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
                println json
            }
        }
    }

def createAlbum(title, body) {

    http.request( POST, JSON ) { req ->
        uri.path = '/albums'
        body = [title: title, body: body, userId:1]

        response.success = { resp, json ->
            println "Album was created successfully ${resp.statusLine}"
            println "Album was created successfully ${json}"
            postId = json.id
            println "Album was created successfully ${postId}"
        }
    }
}

println "**************************"
createAlbum("The Groovy album", "Every Java developer must know Groovy")
println "**************************"
fetchAlbum()
println "**************************"