/* 
* @Author: Jeremiah Marks
* @Date:   2015-07-12 15:58:13
* @Last Modified 2015-07-12>
* @Last Modified time: 2015-07-12 15:59:18
*/
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class stest {

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {

        //Sets up the java client, including the api url
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("https://marty.infusionsoft.com:443/api/xmlrpc"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        //The secure encryption key
        String key = "6ae189d497cd486b9db53793ccf98646";
    }
}