package f_http

import groovy.json.JsonSlurper
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

    http = new HTTPBuilder('http://ajax.googleapis.com')

    def googleQuery() {
        http.request( GET, TEXT ) { req ->
            uri.path = '/ajax/services/search/web'
            uri.query = [ v:'1.0', q: 'Groovy language' ]
            headers.'User-Agent' = "Mozilla/5.0 Firefox/3.0.4"
            headers.Accept = 'application/json'

            response.success = { resp, reader ->
                def firstResult = new JsonSlurper().parseText(reader.text).
                        responseData.results[0]
                println "First URL is ${firstResult.url}"
            }

            response.'404' = {
                println 'Not found'
            }
        }
    }





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
        }
    }
}

googleQuery()