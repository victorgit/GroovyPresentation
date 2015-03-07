package x_cs

@Grab(group='com.google.code.gson', module='gson', version='2.3')
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
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
//println "Is it a coupon campaign = ${isCouponCampaign(campaign3)}"



    boolean isCouponCampaignJava(String campaign) {
        boolean isCouponVariant = false;
        JsonElement jelement = new JsonParser().parse(campaign);
        JsonObject  jobject = jelement.getAsJsonObject();
        List<JsonObject> variants = jobject.getAsJsonArray("variants").elements
        for (JsonObject variant : variants) {
        String variantType = variant.get("variantType").getAsString();
            if (variantType.equals("coupon")) {
                isCouponVariant = true;
                break;
            }
        }
        return isCouponVariant;
    }

    boolean isCouponCampaignGroovy(String campaign) {
        boolean isCouponVariant = false
        def variants = new JsonSlurper().parseText(campaign).variants
        for (variant in variants) {
            if (variant.variantType == "coupon") {
                isCouponVariant = true
                break
            }
        }
        isCouponVariant
    }

println isCouponCampaignJava(campaign1)
println isCouponCampaignGroovy(campaign1)
