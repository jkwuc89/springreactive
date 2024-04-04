package com.keithwedinger.springreactive;

import com.keithwedinger.springreactive.controllers.ProfileRestController;
import com.keithwedinger.springreactive.handlers.ProfileHandler;
import com.keithwedinger.springreactive.routers.ProfileEndpointConfiguration;
import com.keithwedinger.springreactive.services.ProfileService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;

@Log4j2
@ActiveProfiles("default")
@Import({
    ProfileEndpointConfiguration.class,
    ProfileHandler.class,
    ProfileService.class
})
public class FunctionalProfileEndpointsTest extends AbstractBaseProfileEndpoints {

    @BeforeAll
    static void before() {
        log.info("running default " + ProfileRestController.class.getName() + " tests");
    }

    FunctionalProfileEndpointsTest(@Autowired WebTestClient client) {
        super(client);
    }
}
