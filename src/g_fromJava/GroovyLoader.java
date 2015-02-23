package g_fromJava;

import groovy.lang.GroovyClassLoader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

    public class GroovyLoader {
        private static Map<String, Object> cache = new HashMap<String, Object>();

        public static <T> T createGroovyInstance(String path) {
            if (cache.containsKey(path)) {
                return (T)cache.get(path);
            }
            T instance = createNew(path);
            cache.put(path, instance);
            return instance;
        }

        private static <T> T createNew(String path) {
            try {
                GroovyClassLoader gcl = new GroovyClassLoader();
                Class clazz = gcl.parseClass(new File(path));
                Object aScript = clazz.newInstance();
                return (T) aScript;
            } catch(Exception e) {
                throw new RuntimeException("Failed to create groovy " +
                        "instance for path="+path, e);
            }
        }
    }






