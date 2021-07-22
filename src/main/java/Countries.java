public class Countries {

    public String Name;
    public Long population;
    public String Capital;

    public Countries(String name, Long population, String capital) {
        Name = name;
        this.population = population;
        Capital = capital;
    }

    public Countries (String name, String capital) {
        Name = name;
        Capital = capital;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }
}
