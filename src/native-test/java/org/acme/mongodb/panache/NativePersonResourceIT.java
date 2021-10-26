package org.acme.mongodb.panache;

import io.quarkus.test.junit.DisabledOnNativeImage;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
@DisabledOnNativeImage
public class NativePersonResourceIT extends PersonResourceTest {

    // Execute the same tests but in native mode.
}
