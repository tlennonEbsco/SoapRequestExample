package hello.client;

import hello.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

public class UserInfoClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(UserInfoClient.class.getName());

    public GetUserInfoResponse getUserInfo() {

        ObjectFactory objectFactory = new ObjectFactory();

        JAXBElement profileKey = objectFactory.createGetProfileBrandingProfileKey("");
        GetProfileBranding brandingRequest = objectFactory.createGetProfileBranding();
        brandingRequest.setProfileKey(profileKey);

        GetUserInfoResponse response = (GetUserInfoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://edc-ags.epnet.com/AdminGatewayService/UserProfile.svc",
                        brandingRequest,
                        new SoapActionCallback("http://www.tempuri.org/IUserProfile/GetProfileBranding"));
        return response;
    }
}
