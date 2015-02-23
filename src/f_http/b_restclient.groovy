package f_http


@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*

rest = new RESTClient('http://jsonplaceholder.typicode.com')

    def fetchAlbum() {
        response = rest.get(path: "/albums/1")
        println "Got response: ${response.statusLine}"
        println "Content-Type: ${response.headers.'Content-Type'}"
        println response.data

    }

def createAlbum(title, body) {

    response = rest.post(path: "/albums",
            body: [title: title, body: body, userId:1],
            requestContentType: JSON)

    println "POST response status: ${response.statusLine}"
    println "Album was created successfully ${response.data}"
    postId = response.data.id
    println "Album was created successfully ${postId}"

}

println "**************************"
createAlbum("The Groovy album", "Every Java developer must know Groovy")
println "**************************"
fetchAlbum()
println "**************************"