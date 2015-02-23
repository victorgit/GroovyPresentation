package x_cs

import groovy.transform.Canonical

class MyEntity {
    Long id;
    String type;
    String name;
    String key;
}

@Canonical
class MySubEntity {
    Long id;
    String type;
}

MySubEntity copySubEntityJava(MyEntity entity) {
    MySubEntity subEntity = new MySubEntity();
    subEntity.id = entity.id;
    subEntity.type = entity.type;
    return subEntity;
}

MySubEntity copySubEntityGroovy(def entity) {
    entity.properties.subMap(["id", "type"])
}

def entity = new MyEntity(id:1L, type:"type", name:"name", key:"key")
MySubEntity subJava = copySubEntityJava(entity)
MySubEntity subGroovy = copySubEntityGroovy(entity)

assert subJava == subGroovy


