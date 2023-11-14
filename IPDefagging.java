public class IPDefagging {
    public String defangIPaddr(String address) {

        return address.replace(".","[.]");

    }
}
