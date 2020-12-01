package util;

public class ConversaoMoeda {


    public static double totalDolarEmReais(double precoDolar, double quantDolar){
          double a = precoDolar * quantDolar ;
         return a + a * 0.06;
    }
}
