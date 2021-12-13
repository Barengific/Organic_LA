package com.barengific.bgaj;

import java.util.ArrayList;

public class Chromosome extends Gene{
    ArrayList<Gene> genes;
    String chromosome;
    double cRating;
    double pn;
    double cn;

    public Chromosome() {
    }

    public Chromosome(String chromosome, int cRating) {
        this.chromosome = chromosome;
        this.cRating = cRating;
    }

    public Chromosome(String chromosome, double cRating, double pn, double cn) {
        this.chromosome = chromosome;
        this.cRating = cRating;
        this.pn = pn;
        this.cn = cn;
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public double getcRating() {
        return cRating;
    }

    public void setcRating(double cRating) {
        this.cRating = cRating;
    }
    //TODO convert chromosome to decimal value


    public ArrayList<Gene> getGenes() {
        return genes;
    }

    public void setGenes(ArrayList<Gene> genes) {
        this.genes = genes;
    }

    public double getPn() {
        return pn;
    }

    public void setPn(double pn) {
        this.pn = pn;
    }

    public double getCn() {
        return cn;
    }

    public void setCn(double cn) {
        this.cn = cn;
    }
}
