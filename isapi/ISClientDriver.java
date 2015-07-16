import java.net.MalformedURLException;
import org.apache.xmlrpc.XmlRpcException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.supdev.ISClient;

public class ISClientDriver{
  public static void main(String[] args) {
    try {
      ISClient thisclient = new ISClient("if188", "c5029ec5d3188d90cbb3a4fcd5c17674");
      thisclient.printFirstContacts();
      System.out.println("\n\n\n\n");
      ArrayList allcontacts = thisclient.getAllContacts();
      for (int i = 0; i < allcontacts.size(); i++) {
          //Each item in the array is a struct
          Map contact = (Map) allcontacts.get(i);
          System.out.println("Contact with email address " + contact.get("Email") + " was found and has ID " +
                  contact.get("Id"));

      }
    } catch (MalformedURLException e){
      System.err.println("MalformedURLException Ya broke it" + e.getMessage());
    } catch (XmlRpcException e) {
      System.err.println("XmlRpcException Ya broke it" + e.getMessage());
    }
  }
}
