package kz.zhelezyaka.restExample.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Country {
    static final Logger log = LogManager.getLogger(Country.class.getName());
    private String name;
    private int population;

    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean doIt() {
        log.entry();
        log.error("Did it again");
        return log.exit(false);
    }
}
