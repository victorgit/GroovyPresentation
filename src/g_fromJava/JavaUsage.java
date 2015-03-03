package g_fromJava;

public class JavaUsage {

    public static void main(String[] args) {
        ConfigurationBuilder builder =
                GroovyLoader.createGroovyInstance(ConfigurationBuilder.class);
        String configuration = builder.buildInitialConfiguration();
        System.out.println(configuration);
    }
}
