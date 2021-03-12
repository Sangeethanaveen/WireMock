
import static com.github.tomakehurst.wiremock.client.WireMock.*;
public class WIreMock {
    public static void main(String[] args) {
        stubFor(get(urlEqualTo("/some/thing"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Hello world!")));

    }

}

