package edu.sdev.greenriver.circlecidemoproject.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
public class HomeApi
{
    @GetMapping
    public String home()
    {
        return "Hello, world!";
    }
}
