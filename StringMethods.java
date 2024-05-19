

public class StringMethods {
    public static void main(String[] args) {
        
        String FirstName = "Suresh";
        String LastName = "Banoth";
        String fname ="Suresh";
        String email = "    ss777@gmail.com    ";

      // concatination of strings

      System.out.println(1+" "+FirstName+" "+ LastName);

      // finding a character in String
      System.out.println(2+" "+FirstName.contains("h"));

      // difference between == and equal method

      System.out.println(3+" " +FirstName==fname); // referring to memory
      System.out.println(4+" " +FirstName.equals(fname));// referring to values

      // String lower case and upper case

      System.out.println(5+" " +FirstName.toLowerCase());
      System.out.println(6+"  "+FirstName.toUpperCase());

      // trim method to remove extra spaces
      System.out.println(7+" "+email);
      email = email.trim();
      System.out.println(8+" "+email);

    }
}
