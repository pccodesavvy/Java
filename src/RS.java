public class RS {

    static String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ACDEFGHIJKMOPQTUVWXYZ"
                + "acdefghijkmopqtuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {

        // Get the size n
        int n = 6;

        // Get and display the alphanumeric string
        for(int y = 1;y<1001;y++){
            System.out.println(RS
                    .getAlphaNumericString(n));
//            System.out.println("Vendor");
//            System.out.println("Product");
//            System.out.println("Variation");
        }

    }
}
