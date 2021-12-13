package com.barengific.bgaj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    int nVar;
    int nBits;
    int nPop;
    int totalPop = nBits * nPop;
    int xRate;
    int nKeep = nPop * xRate;
    int nDel = nPop - nKeep;
    static int xLo;
    static int xHi;
    double pn;
    double cn;
    double Cn;
    double u;
    static int precision;
    Chromosome cs = new Chromosome();
    ArrayList<Chromosome> pop = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        //initPop();
        xHi = 100;
        xLo = 25;
        precision = 2;
        System.out.println(encoding());
    }

    public static void main(String[] args) {
        launch(args);
    }

    static double encoding() {
        return Math.round(Math.log((((xHi - xLo)/(Math.pow(10, -precision))) + 1))/Math.log(2));
    }

    static double decoding(){
        return xLo + bin2int("")*((xHi-xLo)/Math.pow(2,encoding())-1);
    }

    static int bin2int(String binary){
        return Integer.parseInt(binary,2);
    }

    static String int2bin(int decimal){
        return Integer.toBinaryString(10);
    }

    void initPop( ) {
        ArrayList<String> population = new ArrayList<>();
        for (int i = 0; i < nPop; i++) {
            cs.setChromosome("");
            for (int j = 0; j < nBits; j++) {
                double b = Math.random();
                long a = Math.round(b);
                cs.setChromosome(cs.getChromosome() + Long.toString(a));
            }
            population.add(cs.getChromosome());
        }
        System.out.println(population.toString());
    }

}
