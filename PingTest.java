import java.io.IOException;
import java.net.InetAddress;

public class PingTest {
    public static void main(String[] args) {
        // Remplacez "adresseIP" par l'adresse IP de votre ami ou son nom de domaine.
        String ipAddress = "192.168.21.1"; // Exemple : 192.168.1.10 ou google.com

        try {
            // Obtenir l'objet InetAddress pour l'adresse IP ou le nom de domaine
            InetAddress address = InetAddress.getByName(ipAddress);

            System.out.println("Envoi du ping à " + ipAddress);

            // Tenter de pinger l'adresse avec un délai de timeout de 5000ms (5 secondes)
            boolean reachable = address.isReachable(5000); // 5000 ms = 5 sec

            if (reachable) {
                System.out.println("Le PC est accessible !");
            } else {
                System.out.println("Le PC n'est pas accessible !");
            }
        } catch (IOException e) {
            System.err.println("Erreur lors du ping : " + e.getMessage());
        }
    }
}
