package b_strings

host = "my.domain.com"
port = 8080
username = "user"
password = "pass"

url = "https://" + host + ":" + port + "/resource?username=" +
      username + "&password=" + password

url = String.format("https://%s:%s/resource?username=%s&password=%s",
      host, port, username, password)

url = "https://$host:$port/resource?username=$username&password=$password"


