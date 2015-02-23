package d_collections

def list = [1,2,3,4]

list.each { println "Item: $it" }
list.eachWithIndex {item, index ->  println "Item: $item at $index" }

def doubles = list.collect { it*2 }
assert [2,4,6,8] == doubles

assert 2 == list.find { it > 1 }
assert [2, 3, 4, ] == list.findAll { it > 1 }

assert list.every { it < 5 }
assert ! list.every { it < 2 }

assert list.any { it > 2 }
assert ! list.any { it > 6 }





