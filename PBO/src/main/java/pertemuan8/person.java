package pertemuan8;

public class person {
    
    protected String name;
    protected String address;

    
//    default constructor
    
    public person(){
    
        System.out.println("Inside person : Constructor");
        name    = "";
        address = "";
        
    }
    
//    constructor 2 parameter
    public person( String name, String address ){
        this.name       = name;
        this.address    = address;
    }
    
//    method accessor
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
}
