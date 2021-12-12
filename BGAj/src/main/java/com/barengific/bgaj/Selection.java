package com.barengific.bgaj;

import java.util.ArrayList;

public class Selection {

    ArrayList<String> topToBottom(ArrayList<String> a){
        //TODO Start at the top of the list and pair the
        //chromosomes two at a time until the top Nkeep chromosomes are
        //selected for mating
        return null;
    }

    ArrayList<String> randPairing(ArrayList<String> a){
        //TODO : A uniform random number generator to select
        //chromosomes.
        //Property: All chromosomes (in the mating pool of NKeep) have chance
        //to mate. Introduce diversity to the population resulting in higher chance
        //of producing offspring of quality
        return null;
    }

    ArrayList<String> weightedRandPairing(ArrayList<String> a){
        //TODO : (roulette wheel weighting): The
        //probabilities assigned to the chromosomes in the mating pool are
        //inversely proportional to their cost. Property: A chromosome with the lowest cost has the greatest
        //probability of mating, while the chromosome with the highest cost has
        //the lowest probability of mating.
        return null;
    }

    ArrayList<String> tournamentSelection(ArrayList<String> a){
        //TODO : Randomly pick a small subset of chromosomes (two or three) from the
        //mating pool in the Nkeep, and the chromosome with the lowest cost in
        //the subset becomes a parent.
        //Properties:
        //It is problem independent (cost function independent).
        //It works best for larger population sizes because sorting becomes
        //time-consuming for large populations ) less computationally
        //expensive.
        //Chromosomes of good quality (with lower cost) have higher chance to
        //be chosen.
        return null;
    }


}
