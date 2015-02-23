package g_fromJava

path = "ConfigurationBuilderImpl.groovy"
def builder = GroovyLoader.createGroovyInstance(path)
def configuration = builder.buildInitialConfiguration()
println configuration

