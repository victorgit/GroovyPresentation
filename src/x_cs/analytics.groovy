package x_cs

@groovy.lang.Grab (group='joda-time', module='joda-time', version = '2.1')
import org.joda.time.*

class ApiQuery {
    String eventName
    String queryType

    public String queryId() {
        return String.format("e=%s;t=%s;",
                eventName!=null?eventName:"",
                queryType!=null?queryType:"")
    }
}

class KeyValueResult {
    String key
    String result
}
class ApiResult {
    List<KeyValueResult> values
    ApiQuery query
}


Map<String, List<KeyValueResult>> mapResultsByQueryIdJava(List<ApiResult> results)  {
    Map<String, List<KeyValueResult>> map = new HashMap<>();
    for (ApiResult apiResult : results) {
        map.put(apiResult.query.queryId(), apiResult.values);
    }
    return map;
}


def mapResultsByQueryIdGroovy(List<ApiResult> results)  {
    results.collectEntries { [it.query.queryId(), it.values] }
}


class Variant {
    long id;
}

List<Long> getVariantIdsJava(List<Variant> variants) {
    List<Long> ids = new ArrayList<>();
    for (Variant variant : variants) {
        ids.add(variant.id)
    }
    return ids;
}

def  getVariantIdsGroovy(List<Variant> variants) {
    variants.collect(it.id)
}

def padTime(time) {
    time.toString().padLeft(2, '0')
}

def secondsToTime(seconds) {
    def period = new Period(seconds*1000)
    "${padTime(period.getHours())}:${padTime(period.getMinutes())}:${padTime(period.getSeconds())}"
}

println (secondsToTime(301))