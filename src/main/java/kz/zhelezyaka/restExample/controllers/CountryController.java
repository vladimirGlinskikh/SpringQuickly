package kz.zhelezyaka.restExample.controllers;

import kz.zhelezyaka.restExample.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
        Country country = Country.of("France", 46);
        return country;
    }

    @GetMapping("/all")
    public List<Country> countries() {
        Country country1 = Country.of("France", 56);
        Country country2 = Country.of("Spane", 45);
        return List.of(country1, country2);
    }
}
