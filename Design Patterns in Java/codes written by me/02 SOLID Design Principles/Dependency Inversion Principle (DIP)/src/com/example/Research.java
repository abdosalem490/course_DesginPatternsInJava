package com.example;

import java.util.List;

public class Research { // high level

    // violates dependency rule
    /*public Research(Relationships relationships){
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream().filter(x-> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
                .forEach(ch-> System.out.println("John has a child called " + ch.getValue2().name));
    }*/

    // doesn't violate dependency rule
    public Research(RelationshipBrowser browser){
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.name);
    }
}
