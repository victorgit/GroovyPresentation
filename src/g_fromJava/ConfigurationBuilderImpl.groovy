package g_fromJava

import groovy.json.JsonBuilder

class ConfigurationBuilderImpl implements ConfigurationBuilder {
    @Override
    String buildInitialConfiguration() {
        def configuration = [:]
        configuration.type = 1
        configuration.name = "name"
        configuration.created = new Date()
        new JsonBuilder(configuration).toString()
    }
}
