package hello.config;

import hello.client.UserInfoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class UserInfoConfiguration {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("hello.wsdl");
        return marshaller;
    }

    @Bean
    public UserInfoClient userInfoClient(Jaxb2Marshaller marshaller) {
        UserInfoClient client = new UserInfoClient();
        client.setDefaultUri("http://edc-ags.epnet.com/AdminGatewayService/UserProfile.svc");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
