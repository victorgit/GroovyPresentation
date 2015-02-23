package f_http;

import groovyx.net.http.URIBuilder;

import java.net.URISyntaxException;

    public class UriBuilderJava {


        public static void main(String[] args) throws URISyntaxException {
            URIBuilder uri = new URIBuilder( "http://www.google.com/one/two?a=1#frag" );

            uri.setScheme( "https" ).setHost( "localhost" ).setPath( "../three" );
            assert uri.toString().equals( "https://localhost/three?a=1#frag" );
        }

    }
