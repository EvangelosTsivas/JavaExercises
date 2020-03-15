public class FriendsArray{

  public static void main(String[] args){

    String [] friends = new String[4];
    friends[0]= args[0];
    friends[1]=args[1];
    friends[2]=args[2];
    friends[3]=args[3];

    for(int i=0; i<friends.length; i++){
      if(i<friends.length-1){
      System.out.print(friends[i]+", ");
      }else{
      System.out.print(friends[i]+".");
      }

    }
    System.out.println();

    for(String friends1:friends){
      
      System.out.print(friends1+ " ");

    }
    System.out.println();

    int i =0;
    while(i<friends.length){
      if(i<friends.length-1){
        System.out.print(friends[i]+", ");
      }else{
        System.out.print(friends[i]+".");
      }
    i++;
    }
    System.out.println();

    int j = 0;
    do{
      if(j<friends.length-1){
        System.out.print(friends[j]+", ");
      }else{
      System.out.print(friends[j]+".");
    }
    j++;
    }while(j<friends.length);

  }

}