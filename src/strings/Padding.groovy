package strings

def lang = "Groovy"

assert lang.center(12, "*") == "***Groovy***"
assert lang.padLeft(12, "*") == "******Groovy"
assert lang.padRight(12, "*") == "Groovy******"

assert lang.center(12) == "   Groovy   "
assert lang.padLeft(12) == "      Groovy"
assert lang.padRight(12) == "Groovy      "

