package com.auntielizllc.liftoffproject.controllers;

import com.auntielizllc.liftoffproject.data.UserRepository;
import com.auntielizllc.liftoffproject.models.User;
import com.auntielizllc.liftoffproject.models.dto.LoginFormDTO;
import com.auntielizllc.liftoffproject.models.dto.RegisterFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;

    // Key used to store user IDs
    private static final String userSessionKey = "user";

    /*
    Looks for data with the key user in the user's session. If found, it attempts to retrieve User object from database.
    If no user ID is in the session, or if there is no user with the given ID, null is returned.
     */
    public User getUserFromSession(HttpSession session) {
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        if (userId == null) {
            return null;
        }

        Optional<User> user = userRepository.findById(userId);

        if(user.isEmpty()) {
            return null;
        }

        return user.get();
    }

    // Uses HttpSession object to store key/value pair
    private static void setUserInSession(HttpSession session, User user) {
        session.setAttribute(userSessionKey, user.getId());
    }

    @GetMapping("/register")
    public String displayRegistrationForm(Model model) {
        model.addAttribute(new RegisterFormDTO());
        model.addAttribute("title", "Register");
        return "register";
    }

    /*
    Define the handler method at the route /register that takes a valid RegisterFormDTO object, associated errors, and a Model.
    In addition, the method needs an HttpServletRequest object.
    This object represents the incoming request, and will be provided by Spring.
     */
    @PostMapping("/register")
    public String processRegistrationForm(@ModelAttribute @Valid RegisterFormDTO registerFormDTO,
                                          Errors errors, HttpServletRequest request,
                                          Model model) {

        // Return the user to the form if any validation errors occur
        if (errors.hasErrors()) {
            model.addAttribute("title", "Register");
            return "register";
        }

        // Retrieve the user with the given username from the database
        User existingUser = userRepository.findByUsername(registerFormDTO.getUsername());

        // If a user with the given username already exists, register a custom error with the errors object and return the user to the form.
        if (existingUser != null) {
            errors.rejectValue("username", "username.alreadyexists", "A user with that username already exists");
            model.addAttribute("title", "Register");
            return "register";
        }

        String password = registerFormDTO.getPassword();
        String verifyPassword = registerFormDTO.getVerifyPassword();
        // Compare the two passwords submitted. If they do not match, register a custom error and return the user to the form
        if (!password.equals(verifyPassword)) {
            errors.rejectValue("password", "passwords.mismatch", "Passwords do not match");
            model.addAttribute("title", "Register");
            return "register";
        }

        // User with the given username does NOT already exist and the rest of the form data is valid
        // Create a new user object, store it in the database, and then create a new session for the user
        User newUser = new User(registerFormDTO.getUsername(), registerFormDTO.getPassword());
        userRepository.save(newUser);
        setUserInSession(request.getSession(), newUser);

        return "redirect:";
    }

    @GetMapping("/login")
    public String displayLoginForm(Model model) {
        model.addAttribute(new LoginFormDTO());
        model.addAttribute("title", "Log In");
        return "login";
    }
}
