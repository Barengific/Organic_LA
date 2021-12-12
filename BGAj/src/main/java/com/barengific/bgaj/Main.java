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
        double temp1 = xHi - xLo;
        double temp2 = Math.pow(10, -precision);
        double temp3 = (temp1 / temp2) + 1;
        double temp4 = Math.log(temp3)/Math.log(2);
        return temp4;

    }

    void initPop() {
        int cSize = 10;
        int pSize = 20;
        Population pop = new Population();
        Chromosome cs = new Chromosome();
        ArrayList<String> qq = new ArrayList<>();

        for (int i = 0; i < pSize; i++) {
            cs.setChromosome("");
            for (int j = 0; j < cSize; j++) {
                double b = Math.random();
                long a = Math.round(b);
                cs.setChromosome(cs.getChromosome() + Long.toString(a));
            }
            qq.add(cs.getChromosome());
        }
        System.out.println(qq.toString());
    }


}
