package com.borabora.drivedocprocessor.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * Borabora Systems
 * Created by mananoreboton on 17/08/14.
 */
@Configuration
@EnableOAuth2Client
public class Oauth2Config {

    @Resource
    @Qualifier("accessTokenRequest")
    private AccessTokenRequest accessTokenRequest;

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.INTERFACES)
    public OAuth2RestTemplate googleRestTemplate() {
        //mod
        OAuth2RestTemplate template = new OAuth2RestTemplate(google(), new DefaultOAuth2ClientContext(accessTokenRequest));
/*        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.valueOf("text/javascript")));
        template.setMessageConverters(Arrays.<HttpMessageConverter<?>>asList(converter));*/
        return template;
    }

    @Bean
    public OAuth2ProtectedResourceDetails google() {
        AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
        details.setId("google");
        details.setClientId("");
        details.setClientSecret("");
        //details.setClientSecret("<secret>");
        details.setAccessTokenUri("https://accounts.google.com/o/oauth2/token");
        details.setUserAuthorizationUri("https://accounts.google.com/o/oauth2/auth");
        details.setPreEstablishedRedirectUri("http://localhost:8080/google");
        final ArrayList<String> scope = new ArrayList<String>();
        //scope.add("https://www.googleapis.com/auth/calendar");
        scope.add("https://www.googleapis.com/auth/drive");
        scope.add("https://www.googleapis.com/auth/userinfo.email");
        scope.add("https://www.googleapis.com/auth/userinfo.profile");
        details.setScope(scope);

        details.setTokenName("oauth_token");
        details.setAuthenticationScheme(AuthenticationScheme.query);
        details.setClientAuthenticationScheme(AuthenticationScheme.form);
        return details;
    }
}
