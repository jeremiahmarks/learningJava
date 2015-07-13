/* 
* @Author: Jeremiah Marks
* @Date:   2015-07-12 15:58:13
* @Last Modified 2015-07-12
* @Last Modified time: 2015-07-12 17:59:27
*/
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


List Company = new ArrayList(1000);
List Contact = new ArrayList(1000);

Company.add("AccountId");
Company.add("Address1Type");
Company.add("Address2Street1");
Company.add("Address2Street2");
Company.add("Address2Type");
Company.add("Address3Street1");
Company.add("Address3Street2");
Company.add("Address3Type");
Company.add("Anniversary");
Company.add("AssistantName");
Company.add("AssistantPhone");
Company.add("BillingInformation");
Company.add("Birthday");
Company.add("City");
Company.add("City2");
Company.add("City3");
Company.add("Company");
Company.add("CompanyID");
Company.add("ContactNotes");
Company.add("ContactType");
Company.add("Country");
Company.add("Country2");
Company.add("Country3");
Company.add("CreatedBy");
Company.add("DateCreated");
Company.add("Email");
Company.add("EmailAddress2");
Company.add("EmailAddress3");
Company.add("Fax1");
Company.add("Fax1Type");
Company.add("Fax2");
Company.add("Fax2Type");
Company.add("FirstName");
Company.add("Groups");
Company.add("Id");
Company.add("JobTitle");
Company.add("LastName");
Company.add("LastUpdated");
Company.add("LastUpdatedBy");
Company.add("MiddleName");
Company.add("Nickname");
Company.add("OwnerID");
Company.add("Password");
Company.add("Phone1");
Company.add("Phone1Ext");
Company.add("Phone1Type");
Company.add("Phone2");
Company.add("Phone2Ext");
Company.add("Phone2Type");
Company.add("Phone3");
Company.add("Phone3Ext");
Company.add("Phone3Type");
Company.add("Phone4");
Company.add("Phone4Ext");
Company.add("Phone4Type");
Company.add("Phone5");
Company.add("Phone5Ext");
Company.add("Phone5Type");
Company.add("PostalCode");
Company.add("PostalCode2");
Company.add("PostalCode3");
Company.add("ReferralCode");
Company.add("SpouseName");
Company.add("State");
Company.add("State2");
Company.add("State3");
Company.add("StreetAddress1");
Company.add("StreetAddress2");
Company.add("Suffix");
Company.add("Title");
Company.add("Username");
Company.add("Validated");
Company.add("Website");
Company.add("ZipFour1");
Company.add("ZipFour2");
Company.add("ZipFour3");

Contact.add("AccountId");
Contact.add("Address1Type");
Contact.add("Address2Street1");
Contact.add("Address2Street2");
Contact.add("Address2Type");
Contact.add("Address3Street1");
Contact.add("Address3Street2");
Contact.add("Address3Type");
Contact.add("Anniversary");
Contact.add("AssistantName");
Contact.add("AssistantPhone");
Contact.add("BillingInformation");
Contact.add("Birthday");
Contact.add("City");
Contact.add("City2");
Contact.add("City3");
Contact.add("Company");
Contact.add("CompanyID");
Contact.add("ContactNotes");
Contact.add("ContactType");
Contact.add("Country");
Contact.add("Country2");
Contact.add("Country3");
Contact.add("CreatedBy");
Contact.add("DateCreated");
Contact.add("Email");
Contact.add("EmailAddress2");
Contact.add("EmailAddress3");
Contact.add("Fax1");
Contact.add("Fax1Type");
Contact.add("Fax2");
Contact.add("Fax2Type");
Contact.add("FirstName");
Contact.add("Groups");
Contact.add("Id");
Contact.add("JobTitle");
Contact.add("LastName");
Contact.add("LastUpdated");
Contact.add("LastUpdatedBy");
Contact.add("LeadSourceId");
Contact.add("Leadsource");
Contact.add("MiddleName");
Contact.add("Nickname");
Contact.add("OwnerID");
Contact.add("Password");
Contact.add("Phone1");
Contact.add("Phone1Ext");
Contact.add("Phone1Type");
Contact.add("Phone2");
Contact.add("Phone2Ext");
Contact.add("Phone2Type");
Contact.add("Phone3");
Contact.add("Phone3Ext");
Contact.add("Phone3Type");
Contact.add("Phone4");
Contact.add("Phone4Ext");
Contact.add("Phone4Type");
Contact.add("Phone5");
Contact.add("Phone5Ext");
Contact.add("Phone5Type");
Contact.add("PostalCode");
Contact.add("PostalCode2");
Contact.add("PostalCode3");
Contact.add("ReferralCode");
Contact.add("SpouseName");
Contact.add("State");
Contact.add("State2");
Contact.add("State3");
Contact.add("StreetAddress1");
Contact.add("StreetAddress2");
Contact.add("Suffix");
Contact.add("Title");
Contact.add("Username");
Contact.add("Validated");
Contact.add("Website");
Contact.add("ZipFour1");
Contact.add("ZipFour2");
Contact.add("ZipFour3"]);

Map tablesAndCols = new HashMap();
tablesAndCols.put("Contact", Contact);
tablesAndCols.put("Company", Company);


public class JavaClient {
    private String appname;
    private String apikey;
    private String serverAddress;
    private XmlRpcClient connection;
    private XmlRpcClientConfigImpl config;

    public JavaClient(String appname, String apikey){
        this.appname = appname;
        this.apikey = apikey;
        this.serverAddress = "https://" + this.appname + ".infusionsoft.com:443/api/xmlrpc";
        this.config = new XmlRpcClientConfigImpl();
        this.config.setServerURL(new URL(this.serverAddress));
        this.connection = new XmlRpcClient()
        this.connection.setConfig(config)
    }

    public void getAllContacts() {
        dataToPass = new ArrayList();
        dataToPass.add(this.apikey); //Secure key
        dataToPass.add("Contact");  //What table we are looking in
        dataToPass.add(new Integer(50)); //How many records to return
        dataToPass.add(new Integer(0)); //Which page of results to display
        dataToPass.add("GroupId"); //The field we are querying on
        dataToPass.add(new Integer(groupId)); //THe data to query on
        paramete
    }

   public
}