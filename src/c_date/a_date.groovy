package c_date

today = new Date()
println "today is: $today"

tomorrow = today + 1
println "tomorrow is: $tomorrow"

yesterday = today - 1
println "yesterday was $yesterday"


assert tomorrow.after(today)
assert yesterday.before(today)

println today.time

