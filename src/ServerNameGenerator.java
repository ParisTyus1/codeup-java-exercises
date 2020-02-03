import java.lang.reflect.Array;
import java.util.Random;


public class ServerNameGenerator {
public static void main (String[]args){
    //creation of the array//
    ServerNameGenerator server = new ServerNameGenerator();
    String[] Adjective = {"ambitious", "conscientious",
            "diligent","enthusiastic", "gregarious", "amiable",
            "courageous", "resourceful", "sincere", "witty" };

    String [] Noun = {"photon","electron","neutron","Paris","Rome","Atom","moonlight","sun","Ocean","earth"};
    System.out.println("Here is the server name: ");
    System.out.println(server.returnElement(Adjective, Noun));

}

        //randomize the noun and adjective//


public String returnElement(String[] Adjectives, String[] Noun){
    int randomAdj = new Random().nextInt(Adjectives.length);//method to randomize adj//
    int randomNoun = new Random().nextInt(Noun.length);//method to randomize noun//
    for(int i = 0; i < 0;i++);
    System.out.println(Adjectives[randomAdj] + " - "+ Noun[randomNoun]);
}
}

