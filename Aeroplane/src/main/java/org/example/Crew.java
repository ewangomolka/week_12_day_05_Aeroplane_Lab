package org.example;

public class Crew {

    private String name;

    private CrewType crewType;

    public Crew(String name, CrewType crewType) {
        this.name = name;
        this.crewType = crewType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CrewType getCrewType() {
        return crewType;
    }

    public void setCrewType(CrewType crewType) {
        this.crewType = crewType;
    }

    public String relayMessage() {
        return "Coffee, Tea or me, me, me";
    }
}
