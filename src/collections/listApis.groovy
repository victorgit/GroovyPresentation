package collections

def list = [1,2,3,4]

list.each { println "Item: $it" }
list.eachWithIndex {item, index ->  println "Item: $item at $index" }

def doubles = list.collect { it *2 }
assert [2,4,6,8] == doubles

def mixedList = [10, 20, [1, 2, [25, 50]], ['Groovy']]
def mixedDoubles = mixedList.collectNested { it * 2 }
assert [20, 40, [2, 4, [50, 100]], ['GroovyGroovy']] == mixedDoubles

assert 2 == list.find { it > 1 }
assert [2, 3, 4, ] == list.findAll { it > 1 }

assert list.every { it < 5 }
assert ! list.every { it < 2 }

assert list.any { it > 2 }
assert ! list.any { it > 6 }





