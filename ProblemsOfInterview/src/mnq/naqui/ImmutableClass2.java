package mnq.naqui;


import java.util.ArrayList;
import java.util.Date;

/**
* Always remember that your instance variables will be either mutable or immutable.
* Identify them and return new objects with copied content for all mutable objects.
* Immutable variables can be returned safely without extra effort.
* */
final class ImmutableClass2
{
 
    /**
    * Integer class is immutable as it does not provide any setter to change its content
    * */
    private final Integer immutableField1;
    /**
    * String class is immutable as it also does not provide setter to change its content
    * */
    private final String immutableField2;
    /**
    * Date class is mutable as it provide setters to change various date/time parts
    * */
    private final Date mutableField;
    
    private final ArrayList<String> mutableList;
    //Default private constructor will ensure no unplanned construction of class
    private ImmutableClass2(Integer fld1, String fld2, Date date, ArrayList<String> mutableList)
    {   
        
        this.immutableField1 = fld1;
        this.immutableField2 = fld2;
        this.mutableField = new Date(date.getTime());
        ArrayList<String> tempList=new ArrayList<String>();
        for (String string : mutableList) {
            tempList.add(string);
        }
        this.mutableList=tempList;
    }
 
    //Factory method to store object creation logic in single place
    public static ImmutableClass2 createNewInstance(Integer fld1, String fld2, Date date, ArrayList<String> mutableList)
    {
        return new ImmutableClass2(fld1, fld2, date,  mutableList);
    }
 
    //Provide no setter methods
 
    /**
    * Integer class is immutable so we can return the instance variable as it is
    * */
    public Integer getImmutableField1() {
        return immutableField1;
    }
 
    /**
    * String class is also immutable so we can return the instance variable as it is
    * */
    public String getImmutableField2() {
        return immutableField2;
    }
 
    /**
    * Date class is mutable so we need a little care here.
    * We should not return the reference of original instance variable.
    * Instead a new Date object, with content copied to it, should be returned.
    * */
    public Date getMutableField() {
        return new Date(mutableField.getTime());
    }
    
    
  /*  public ArrayList<String> getMutableList() {
      return (ArrayList<String>) mutableList.clone();
    }*/
    
    public ArrayList<String> getMutableList() {
    return new ArrayList<String>(this.mutableList);
    
    }
    
    
    @Override
    public String toString() {
      return "immutableField1=" + immutableField1 + ", immutableField2="
          + immutableField2 + ", mutableField=" + mutableField + ", mutableList=" + mutableList
          ;
    }

}

//Now its time to test our class:

 class Main
{
    public static void main(String[] args)
    {   
      ArrayList<String> al=new ArrayList<String>();
      al.add("qqq");
      al.add("zxx");
      al.add("mkii");
        ImmutableClass2 im = ImmutableClass2.createNewInstance(100,"test", new Date(), al);
        
        System.out.println(im);
        al.add("3rdType");
        im.getMutableList().add("Added2way");
        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField(), im.getMutableList());
        System.out.println(im);
        
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("123");
        al1.add("234");
        al1.add("345");
          ImmutableClass2 im1 = ImmutableClass2.createNewInstance(200,"test2", new Date(), al1);
          System.out.println(im1);
          al1.add("3rdType");
          im1.getMutableList().add("Added2way");
          tryModification(im1.getImmutableField1(),im1.getImmutableField2(),im1.getMutableField(), im1.getMutableList());
          System.out.println(im1);
        
        
    }
 
    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField,ArrayList<String> al)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
        al.add("1st way added");
        
    }
}