package x_cs

import groovy.json.JsonSlurper

class AnalyticsQuery {
    String id;
    String field;
}

class AnalyticsResult {
    List<String> values;
}

def results = """
                  [
                      {
                        "value": {
                            "result": "10.0"
                          }
                        ,
                        "query": {
                          "campaign": "xyz",
                          "type" : "1"
                        }
                      },
                      {
                        "value": {
                            "result": "11.0"
                          }
                        ,
                        "query": {
                          "campaign": "xyz",
                          "type" : "2"
                        }
                      },
                      {
                        "value":
                          {
                            "result": "100.0"
                          },
                        "query": {
                          "campaign": "abc"
                        }
                      }
                  ]
              """

def getResultsByQuery(results) {
    new JsonSlurper().parseText(results).collectEntries {
        [it.query.campaign, it.value]
    }
}

println getResultsByQuery(results)