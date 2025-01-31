package it.softengunina.dietiestateslogin;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public boolean login (@RequestBody LoginCredentials credentials) {
        try {
            validateCredentials(credentials);
            return true;
        } catch (LoginException e) {
            return false;
        }
    }

    private void validateCredentials (LoginCredentials credentials) throws LoginException {
        //TODO: use cognito to validate credentials
    }
}

class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}