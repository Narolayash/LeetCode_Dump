public class Problem_1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<address.length(); i++) {
            if (address.charAt(i) == '.') sb.append("[.]");
            else sb.append(address.charAt(i));
        }

        return sb.toString();
    }

    // public String defangIPaddr(String address) {
    //     StringBuilder sb = new StringBuilder();

    //     String[] ip = address.split("\\.");

    //     int i=0;
    //     for (; i<ip.length-1; i++) {
    //         sb.append(ip[i]);
    //         sb.append("[.]");
    //     }
    //     sb.append(ip[i]);

    //     return sb.toString();
    // }
}
