import jakarta.xml.ws.Endpoint;
import ws.BanqueService;
//JaxB fait le mapping objet xml(convertir xml au java ou l'inversse)
public class ServerJWS {
    public static void main(String[] args) {
        //0.0.0.0 au lieu de localhost pour accepter la connexion depuis n'importe quel @IP
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService()) ;
        System.out.println("Web service déployé sur http://0.0.0.0:9191/");

    }
}
