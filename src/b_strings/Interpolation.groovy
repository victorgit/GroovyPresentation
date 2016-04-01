package b_strings

    def getHost() { "my.domain.com" }
    port = 8080
    username = "user"
    password = "pass"

    url = "https://${getHost()}:$port/resource?username=$username&password=$password"


