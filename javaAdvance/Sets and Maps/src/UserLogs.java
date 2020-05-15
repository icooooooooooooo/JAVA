import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map<String, LinkedHashMap<String, Integer>> logs = new TreeMap<> ();
        // user              IP sent, #of times
        String input = scanner.nextLine ();
        //INPUT
        //IP=(IP.Address) message=(A&sample&message) user=(username)

        int counter = 1;
        while (true) {
            if ("end".equals (input) || counter > 50) {
                break;
            }

            String[] incomingData = input.split (" ");
            String[] ipRaw = incomingData[0].split ("=");
            String[] userNameRaw = incomingData[2].split ("=");
            String ip = ipRaw[1];
            String user = userNameRaw[1];
            String message = incomingData[1];


            if (!logs.containsKey (user)) {
                logs.put (user, new LinkedHashMap<String, Integer> () {{
                    put (ip, 1);
                }});

            } else if (logs.containsKey (user)) {

                if (!logs.get (user).containsKey (ip)) {
                    logs.get (user).put (ip, 1);
                } else if (logs.get (user).containsKey (ip)) {
                    logs.get (user).replace (ip, logs.get (user).get (ip) + 1);
                }
            }
            counter++;
            input = scanner.nextLine ();
        }

        //OUTPUT
        //username:
        //IP => count, IP => count.
        for (Map.Entry<String, LinkedHashMap<String, Integer>> name : logs.entrySet ()) {
            System.out.printf ("%s: \n", name.getKey ());
            LinkedHashMap<String, Integer> values = name.getValue ();
            for (Map.Entry<String, Integer> stringIntegerEntry : values.entrySet ()) {
                System.out.printf ("%s => %d.\n",stringIntegerEntry.getKey (),stringIntegerEntry.getValue ());

            }
           //
           // for (Map.Entry<String, Integer> value : logs.get (name).entrySet ()) {
           //     System.out.printf ("%s =>%d\n",value.getKey (),value.getValue ());
           // }
        }
    }
}


