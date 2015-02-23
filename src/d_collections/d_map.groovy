package d_collections

def emptyMap = [:]

def map = ["a":1, "b":2, "c":3]
assert java.util.LinkedHashMap == map.getClass()
assert 1 == map.a
assert 1 == map["a"]

map.y = 8
assert ["a":1, "b":2, "c":3, "y":8] == map

assert ["a":1, "b":2] == map.subMap(["a", "b"])
assert "b" == map.find {it.value == 2}.key

map = ["a":1, "b":2, "c":3].withDefault { 1975 }
assert 1975 == map.victor

def words = ['Groovy', 'Rocks', 'Big', 'Time']
assert [Groovy:true, Rocks:true, Big:false, Time:false] ==
        words.collectEntries { [(it): it.contains('o')] }

