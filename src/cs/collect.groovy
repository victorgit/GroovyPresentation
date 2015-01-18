package cs

import groovy.json.JsonBuilder

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
