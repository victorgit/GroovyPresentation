package cs

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

class Campaign {

}

String getCampaignsConfigurationForWidgetNew(List<Campaign> campaigns) {
    def result = campaigns.collect {
        getCampaignConfigurationForWidget(it)
    }
    return new JsonBuilder(result).toString()
}

String getCampaignsConfigurationForWidget(List<Campaign> campaigns) {
    def result = []
    for (Campaign campaign in campaigns) {
        def campaignConfig = getCampaignConfigurationForWidget(campaign)
        result.push(campaignConfig)
    }
    return new JsonBuilder(result).toString()
}

def getCampaignConfigurationForWidget(Campaign campaign) {

}

String getCampaignText(Campaign campaign) {
    def variants = getVariantsForCampaign(campaign)
    variants.find {it.experienceType != "control"}.templateParams?.content
}

def getVariantsForCampaign(Campaign campaign) {
    def campaignConfigJson = new JsonSlurper().parseText(campaign.configuration)
    campaignConfigJson.variantsConfig
}

boolean isEmailCampaign(long campaignId) {
    def variants = getVariantsForCampaign(campaignId);
    variants.findAll {it.experienceType == "lead"}.size() > 0
}

