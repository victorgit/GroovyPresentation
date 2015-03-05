package x_cs

import groovy.json.JsonSlurper
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.RESTClient

import static groovyx.net.http.ContentType.JSON

def updateAccount() {

    (instanceUrl, accessToken) = authenticate()
    def salesforce = new RESTClient(instanceUrl)

    def response = salesforce.patch(
            path : "/services/data/v33.0/sobjects/Account/$id",
            body : account,
            headers: ["Authorization":"Bearer $accessToken"],
            requestContentType : JSON )

    println response.status

}

def authenticate() {

    def http = new HTTPBuilder('https://login.salesforce.com')

    def query = [grant_type : "password", client_id : clientId,
            client_secret : clientSecret, username : username,
            password : "$password$token"]

        http.request( POST, URLENC ) { req ->
            uri.path = "/services/oauth2/token"
            uri.query = query
            headers.Accept = 'application/json'
            response.success = { resp, json ->
               accessToken = json.access_token
               instanceUrl = json.instance_url
            }
        }

    [instanceUrl, accessToken]

}


