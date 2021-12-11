package com.barengific.bgaj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        initPop();
    }


    public static void main(String[] args) {
        launch(args);
        int a = (int)Math.random();
        System.out.println(a);

    }

    void initPop(){
        int cSize = 10;
        int pSize = 20;
        Population pop = new Population();
        Chromosome cs = new Chromosome();
        ArrayList<String> qq = new ArrayList<>();

        for(int i =0; i< pSize; i++){
            cs.setChromosome("");
            for(int j = 0; j < cSize; j++){
                double b = Math.random();
                long a = Math.round(b);
                cs.setChromosome(cs.getChromosome() + Long.toString(a));
            }
            qq.add(cs.getChromosome());
        }
        System.out.println(qq.toString());
    }

    int chromosome2Rating(String sChromosome){
        return Integer.parseInt(sChromosome, 2);
    }

    String rating2Chromosome(int iChromosome){
        return Integer.toBinaryString(iChromosome);
    }

    ArrayList<String> matingSelection(ArrayList<String> a){
        //TODO come up with different algorithms to find mates for the chromosomes
        return null;
    }

    ArrayList<String> reproduction(ArrayList<String> a){
        //TODO different algorithms to find generate new chromosomes
        return null;
    }

    ArrayList<String> mutation(ArrayList<String> a){
        //TODO different algorithms to mutate the chromosomes
        return null;
    }


}
