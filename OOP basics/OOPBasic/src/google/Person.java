package google;

import java.security.Policy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private static final String DEFAULT_VALUE = "";

    private String name;
    private Company company;
    private Car car;

    private Set<Parent> parents;
    private Set<Child> children;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.company = new Company ();
        this.car = new Car ();
        this.parents = new HashSet<Parent> ();
        this.children = new HashSet<Child> ();
        this.pokemons = new ArrayList<Pokemon> ();
    }

    public String getName() {
        return this.name;
    }

    public Company getCompany() {
        return this.company;
    }

    public Car getCar() {
        return this.car;
    }

    public Set<Child> getChildren() {
        return this.children;
    }

    public Set<Parent> getParents() {
        return this.parents;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setParents(Parent parent) {
        this.parents.add (parent);
    }

    public void setChildren(Child child) {
        this.children.add (child);
    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemons.add (pokemon);
    }
}
