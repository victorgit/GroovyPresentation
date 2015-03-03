package x_cs

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

    def campaign1 = """
                   {
                      "name" : "Coupons campaign",
                      "type" : "specialCoupons",
                      "specialCode" : "XYZ",
                      "displayer" : "small slider",
                      "variants" : [
                          {
                            "variantType" : "coupon",
                            "couponCode" : "ABC"
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

                            "color" : "red"
                          }
                        ]
                    }
                   """
    def campaign3 = """
                   {
                      "name" : "Coupons campaign",
                      "type" : "specialCoupons",
                      "specialCode" : "qwert",
                      "displayer" : "small slider",
                      "variants" : [
                          {
                            "variantType" : "coupon",
                            "color" : "red",
                            "couponCode" : "1234"
                          }
                        ]
                    }
                   """

    def campaigns = [campaign1, campaign2, campaign3]

    Map getSpecialCampaignsCouponCodes(campaigns) {
        campaigns.findAll {isSpecialCampaignWithCodeAndVariants(it)}.
                  collectEntries {[campaignHolisticCode(it), specialCampaignCouponCode(it)]}
    }

    boolean isSpecialCampaignWithCodeAndVariants(campaign) {
        def configuration = getCampaignConfigurationJson(campaign)
        configuration.type == "specialCoupons" && configuration.specialCode != null && configuration.variants != null && configuration.variants.size() > 0
    }

    def campaignHolisticCode(campaign) {
        getCampaignConfigurationJson(campaign).specialCode
    }

    // the assumption is that there is exactly one variant
    def specialCampaignCouponCode(campaign) {
        getCampaignConfigurationJson(campaign).variants[0].couponCode
    }

    def getCampaignConfigurationJson(campaign) {
        new JsonSlurper().parseText(campaign)
    }

    println ""
    println getSpecialCampaignsCouponCodes(campaigns)

