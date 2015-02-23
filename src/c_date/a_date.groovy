package c_date

def today = new Date()
println "today is: $today"

def tomorrow = today + 1
println "tomorrow is: $tomorrow"

def yesterday = today - 1
println "yesterday was $yesterday"


assert tomorrow.after(today)
assert yesterday.before(today)

println today.time

