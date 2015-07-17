interface Imports {

    //  wheel revolutions per minute
    ArrayList<Map> getAllContacts();
    Integer createContact(Map contactData);
    ArrayList<Map> getContactsAndFK();

    ArrayList<Map> getCSVData(String pathToCSV);
    void saveCSVData(ArrayList<Map> datum)

}