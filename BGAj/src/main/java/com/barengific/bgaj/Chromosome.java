package com.barengific.bgaj;

public class Chromosome {
    String chromosome;
    int nGenes;
    int geneSize;
    int cRating;

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public int getGeneSize() {
        return geneSize;
    }

    public void setGeneSize(int geneSize) {
        this.geneSize = geneSize;
    }

    public int getcRating() {
        return cRating;
    }

    public void setcRating(int cRating) {
        this.cRating = cRating;
    }

    public int getnGenes() {
        return nGenes;
    }

    public void setnGenes(int nGenes) {
        this.nGenes = nGenes;
    }
    //TODO convert chromosome to decimal value

}
