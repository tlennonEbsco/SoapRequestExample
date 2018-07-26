package hello;

import hello.client.UserInfoClient;
import hello.wsdl.GetUserInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    UserInfoClient userInfoClient;

    @GetMapping(path = "/userinfo/getUserInfo")
    public ResponseEntity<GetUserInfoResponse> getUserInfo() {
        GetUserInfoResponse response  = userInfoClient.getUserInfo();
        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
    }
}
