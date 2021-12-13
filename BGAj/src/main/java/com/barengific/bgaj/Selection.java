package com.barengific.bgaj;

import java.util.ArrayList;
import com.barengific.bgaj.Crossover;
//Determine who should reproduce offspring
public class Selection {

    ArrayList<Chromosome> topToBottom(ArrayList<Chromosome> pop, int nKeep, String matingType){
        //TODO Start at the top of the list and pair the
        //chromosomes two at a time until the top Nkeep chromosomes are
        //selected for mating
        int nPop = pop.size();
        int maxSel = nPop-nKeep;

        for(int i = nKeep; nKeep < nPop; nKeep++){
            pop.remove(i);
        }

        if(matingType.equals("singlePoint")){
            pop = Crossover.singlePoint(pop);
        }else if(matingType.equals("doublePoint")){
            pop = Crossover.doublePoint(pop);
        }else if(matingType.equals("uniform")){
            pop = Crossover.uniform(pop);
        }

        return pop;
    }

    ArrayList<Chromosome> randPairing(ArrayList<Chromosome> pop, int nKeep, String matingType){
        //TODO : A uniform random number generator to select
        //chromosomes.
        //Property: All chromosomes (in the mating pool of NKeep) have chance
        //to mate. Introduce diversity to the population resulting in higher chance
        //of producing offspring of quality
        int nPop = pop.size();
        int[] nChosen = new int[nPop];
        ArrayList<Chromosome> newPop = new ArrayList<>();
        for(int i = 0; i < nKeep; i++){
            int temp = getRandomNumber(0,nPop);
            nChosen[i] = temp;
            for(int j = 0; j < nChosen.length; j++){
                if(nChosen[j] != temp){
                    newPop.add(pop.get(temp));
                }
            }
        }
        if(matingType.equals("singlePoint")){
            newPop = Crossover.singlePoint(newPop);
        }else if(matingType.equals("doublePoint")){
            newPop = Crossover.doublePoint(newPop);
        }else if(matingType.equals("uniform")){
            newPop = Crossover.uniform(newPop);
        }

        return newPop;
    }

    ArrayList<Chromosome> weightedRandPairing(ArrayList<Chromosome> pop, int nKeep, String technique, String matingType){
        //TODO : (roulette wheel weighting): The
        //probabilities assigned to the chromosomes in the mating pool are
        //inversely proportional to their cost. Property: A chromosome with the lowest cost has the greatest
        //probability of mating, while the chromosome with the highest cost has
        //the lowest probability of mating.
        double[][] pnpop = new double[pop.size()][2];
        double pnsum = 0;
        double[][] Cnpop = new double[pop.size()][3];
        if (technique.equals("rankWeighting")){
            for(int i = 0; i < pop.size(); i++){
                pnpop[i][0] = i;
                pnsum = pnsum +  (nKeep-pop.get(i).getcRating()+1)/(pnsum);
                pnpop[i][1] = (nKeep-pop.get(i).getcRating()+1)/(pnsum);
            }
        }else if(technique.equals("costWeighting")){
            pnsum = 0;
            double sumCn = 0;
            for(int i = 0; i < pop.size(); i++){
                Cnpop[i][0] = i;
                Cnpop[i][1] = pop.get(i).getcRating()-pop.get(nKeep+1).getcRating();
                sumCn = sumCn + Cnpop[i][1];
            }
            for(int i = 0; i < pop.size(); i++){
                pnsum = pnsum + Math.abs((Cnpop[i][1])/sumCn);
                Cnpop[i][2] = Math.abs((Cnpop[i][1])/sumCn);
            }
        }

        if(matingType.equals("singlePoint")){
            pop = Crossover.singlePoint(pop);
        }else if(matingType.equals("doublePoint")){
            pop = Crossover.doublePoint(pop);
        }else if(matingType.equals("uniform")){
            pop = Crossover.uniform(pop);
        }

        return pop;
    }

    ArrayList<Chromosome> tournamentSelection(ArrayList<Chromosome> pop, int nKeep, String matingType){
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
        int nPop = pop.size();
        int[] nChosen = new int[nPop];
        ArrayList<Chromosome> newPop = new ArrayList<>();

        for(int i = 0; i < nKeep; i++){
            int temp1 = getRandomNumber(0,nPop);
            int temp2 = getRandomNumber(0,nPop);
            if(nChosen[i] != temp1 || nChosen[i] != temp2){
                if(pop.get(temp1).getcRating() <= pop.get(temp2).getcRating()){
                    nChosen[i] = temp1;
                    newPop.add(pop.get(temp1));
                }else if (pop.get(temp2).getcRating() < pop.get(temp1).getcRating()){
                    nChosen[i] = temp2;
                    newPop.add(pop.get(temp2));
                }
            }
        }

        if(matingType.equals("singlePoint")){
            newPop = Crossover.singlePoint(newPop);
        }else if(matingType.equals("doublePoint")){
            newPop = Crossover.doublePoint(newPop);
        }else if(matingType.equals("uniform")){
            newPop = Crossover.uniform(newPop);
        }
        return newPop;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
