package com.ondev.demoswagger.demoswaggerspring3.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

/**
 * @author MJean-Claude
 */
@OpenAPIDefinition(
        info = @Info(
                title = "User API",
                description = "Doing CRUD Operations",
                summary = "Tis user api will permit us to configure user data base",
                termsOfService = "T&S",
                contact = @Contact(
                        name = "Ondev",
                        email = "ondev.contact@gmail.com"
                ),
                license = @License(
                        name = "Ondev_Licence_1752-78"
                ),
                version = "1.0.2"
        )
)
public class SwaggerConfig {
}
