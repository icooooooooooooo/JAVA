import java.util.*;

public class ParseURL {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        //[protocol]://[server]/[resource]

        String input = scanner.nextLine ().substring (2); // escaping URL is leaving // in front of the string

        String[] protocolExtractor = input.split ("://");
        if (protocolExtractor.length > 2) {
            System.out.printf ("Invalid URL");
            return;
        }
        Map<String, String> map = new LinkedHashMap<> ();

        String protocol = protocolExtractor[0];
        map.put ("Protocol", protocol);
        String domain = protocolExtractor[1].substring (0, protocolExtractor[1].indexOf ('/'));
        map.put ("Server", domain);
        String resource = protocolExtractor[1].substring (protocolExtractor[1].indexOf ('/') + 1);
        map.put ("Resource", resource);

        for (Map.Entry<String, String> e : map.entrySet ()) {
            System.out.println (e.getKey () + " = " + e.getValue ());
        }
    }
}
