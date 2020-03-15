public class WeightPerPlanet{

  public static void main(String[] args){
  
    float weight = Float.parseFloat(args[0]);
    String planet = args[1];
    
    switch(planet){
    
      case "Venus" :
        weight *= 0.78;
        System.out.printf("Your weight in %s is: %.2f",planet ,weight);
          break;
      case "Mars" :
        weight *= 0.39;
        System.out.printf("Your weight in %s is: %.2f",planet ,weight);
          break;
      case "Jupiter" :
        weight *= 2.65;
        System.out.printf("Your weight in %s is: %.2f",planet ,weight);
          break;
      case "Saturn" :
        weight *= 1.17;
        System.out.printf("Your weight in %s is: %.2f",planet ,weight);
          break;
      case "Uranus" :
        weight *= 1.05;
        System.out.printf("Your weight in %s is: %.2f",planet ,weight);
          break;
      case "Neptune" :
        weight *= 1.23;
        System.out.printf("Your weight in %s is: %.2f",planet ,weight);
          break;

    }

  }
}