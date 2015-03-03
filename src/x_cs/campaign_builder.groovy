package x_cs
import groovy.json.JsonSlurper

    def campaign1 = """
                   {
                      "name" : "Coupons campaign",
                      "type" : "coupons",
                      "displayer" : "small slider",
                      "variants" : [
                          {
                            "variantType" : "coupon",
                            "color" : "red"
                          },
                          {
                            "variantType" : "coupon",
                            "color" : "blue"
                          },
                          {
                            "variantType" : "control"
                          }
                        ]
                    }
                   """
    def campaign2 = """
                   {
                      "name" : "Coupons campaign2",
                      "type" : "coupons",
                      "displayer" : "big slider",
                      "variants" : [
                          {
                            "variantType" : "coupon",
                            "color" : "red"
                          }
                        ]
                    }
                   """

    def campaigns = [campaign1, campaign2]


    def getCampaignsDisplayers(campaigns) {
        campaigns.collect { getCampaignDisplayer(it) }
    }

    def getCampaignDisplayer(campaign) {
        new JsonSlurper().parseText(campaign).displayer
    }

getCampaignsDisplayers(campaigns).each {
    println it
}

    def getCampaignType(campaign) {
        new JsonSlurper().parseText(campaign).variants.
                find { it.variantType != "control"}.variantType
    }

    def isCouponCampaign(campaign) {
        new JsonSlurper().parseText(campaign).variants.
                any { it.variantType == "coupon" }
    }

println "Is it a coupon campaign = ${isCouponCampaign(campaign1)}"
println "Is it a coupon campaign = ${isCouponCampaign(campaign3)}"


// holistic email example

