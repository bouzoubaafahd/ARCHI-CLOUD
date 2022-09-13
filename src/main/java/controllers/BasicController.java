package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {



        @GetMapping( "/yo")
        public @ResponseBody String greeting() {
                return "<h1> Hello, World </h1>";
        }

}
