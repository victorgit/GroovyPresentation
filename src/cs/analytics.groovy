package cs

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