package com.barengific.bgaj;

import java.util.ArrayList;

public class Chromosome extends Gene{
    ArrayList<Gene> genes;
    String chromosome;
    int cRating;

    public Chromosome() {
    }

    public Chromosome(String chromosome, int cRating) {
        this.chromosome = chromosome;
        this.cRating = cRating;
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public int getcRating() {
        return cRating;
    }

    public void setcRating(int cRating) {
        this.cRating = cRating;
    }
    //TODO convert chromosome to decimal value

}
