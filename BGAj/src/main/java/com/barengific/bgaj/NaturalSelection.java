package com.barengific.bgaj;

import java.util.ArrayList;

//who survives
public class NaturalSelection {

    ArrayList<Chromosome> xrating(ArrayList<Chromosome> pop, int nKeep){
        //
        int nPop = pop.size();
        for(int i = nKeep; nKeep < nPop; nKeep++){
            pop.remove(i);
        }
        return pop;
    }

    ArrayList<Chromosome> thresholding(ArrayList<Chromosome> pop, double threshold){
        //
        int nPop = pop.size();
        for(int i = 0; i < pop.size(); i++){
            if(pop.get(i).getcRating() < threshold){
                pop.remove(i);
            }
        }
        return pop;
    }

}
