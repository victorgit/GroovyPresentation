package d_collections

def emptyMap = [:]

    groovyMap = ["a":1, "b":2, "c":3].withDefault { 1975 }

    Integer getValueFromMap(String key) {
        groovyMap[key]
    }


    assert map.subMap(["a", "b"]) == ["a":1, "b":2]
    assert map.find {it.value == 2}.key == "b"

    map = ["a":1, "b":2, "c":3].withDefault { 1975 }
    assert map.victor == 1975

    def words = ['Groovy', 'Rocks', 'Big', 'Time']
    assert [Groovy:true, Rocks:true, Big:false, Time:false] ==
            words.collectEntries { [(it): it.contains('o')] }

