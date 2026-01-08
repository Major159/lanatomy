package com.major.lanatomy;

import com.lukaspradel.steamapi.webapi.client.SteamWebApiClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SteamController {
    private final SteamWebApiClient client;

    public SteamController(final String steamApiKey) {
        client = new SteamWebApiClient.SteamWebApiClientBuilder(steamApiKey).useHttps(true).build();
    }

    @RequestMapping(method = {RequestMethod.GET}, value = "/group/{groupId}")
    public void getGroupData(@PathVariable("groupId") final String groupId) {
        //client.processRequest(SteamWebApiRequestFactory.fr)
    }


}
