package h_gmongo

@Grab(group='com.gmongo', module='gmongo', version='1.5')
import com.gmongo.*

    mongo = new GMongo()
    def db = mongo.getDB("example")

    db.languages << [[name: 'Groovy', type: 'dynamic'],
                     [name: 'Clojure', type: 'dynamic']]

    lang = db.languages.findOne()
    lang.site = 'http://groovy.codehaus.org/'
    db.languages.save lang

    db.languages.update([name: 'Groovy'],
            [$set: [paradigms: ['object-oriented', 'functional']]])


