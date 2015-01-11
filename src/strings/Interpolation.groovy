package strings

class LanguageQuery {
    def whichLanguage() {
        "Groovy"
    }
}

def oldLanguage = "Java"

println "Every $oldLanguage developer must know ${new LanguageQuery().whichLanguage()}!"


