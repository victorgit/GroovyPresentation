package f_http

import groovyx.net.http.URIBuilder


    def uri = new URIBuilder('http://www.google.com:80/one/two?a=1#frag')


    uri.scheme = 'https'
    assert uri.toString() == 'https://www.google.com:80/one/two?a=1#frag'


    uri.host = 'localhost'
    assert uri.toString() == 'https://localhost:80/one/two?a=1#frag'


    uri.port = 8080
    assert uri.toString() == 'https://localhost:8080/one/two?a=1#frag'


    uri.fragment = 'asdf2'
    assert uri.toString() == 'https://localhost:8080/one/two?a=1#asdf2'


    // relative paths:
    uri.path = 'three/four.html'
    assert uri.toString() == 'https://localhost:8080/one/three/four.html?a=1#asdf2'


    uri.path = '../four/five'
    assert uri.toString() == 'https://localhost:8080/one/four/five?a=1#asdf2'


    // control the entire path with leading '/' :
    uri.path = '/six'
    assert uri.toString() == 'https://localhost:8080/six?a=1#asdf2'
