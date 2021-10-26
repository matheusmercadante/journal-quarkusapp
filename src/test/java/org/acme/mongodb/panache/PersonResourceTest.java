package org.acme.mongodb.panache;

import io.quarkus.test.junit.DisabledOnNativeImage;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@DisabledOnNativeImage
@QuarkusTest
public class PersonResourceTest {

}
