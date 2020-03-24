package mypackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListOperationsTest {

    private ListOperations listOperations;

    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNameToList() {
        boolean changed = listOperations.addNameToList("Andy");
        // int sizeOfList = listOperations.getSizeList();
        assertTrue(changed);
    }

    @Test
    public void testAddNameToListCheckSize() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeList();
        assertEquals(1, sizeOfList);

    }
    
    
    
    @Test
    public void testAddNameToListCheckName() {
        String name = "Andy";
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeList();
        String actualName = listOperations.getNames().get(sizeOfList-1);
        assertTrue(actualName.equals(name));
    }

    @Test
    public void testAddNameToListManyNames(){
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Peter");
        int sizeOfList =listOperations.getSizeList();
        assertEquals(3,sizeOfList);
        
    }
    
    @Test
    public void testAddNameToListNull(){
        listOperations.addNameToList(null);
        int sizeOfList = listOperations.getSizeList();
        assertEquals(0,sizeOfList);
    }

    
    @Test
    public void testRemoveNameFromList() {
      listOperations.addNameToList("John");
      assertEquals(1,listOperations.getSizeList());
      listOperations.removeNameFromList("John");
        assertEquals(0, listOperations.getSizeList());   
    }
    
     @Test
    public void testRemoveNameFromNullList() {
      //we get null pointer exeption cause removeName() does not initialize the list.
      listOperations.removeNameFromList("John");
        assertEquals(0, listOperations.getSizeList());   
    }
    
    
     @Test
    public void testRemoveNameFromListMultiple() {
        listOperations.addNameToList("John");
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("George");  
        assertEquals(4, listOperations.getSizeList());
        listOperations.removeNameFromList("John");
        listOperations.removeNameFromList("Mary");    
        assertEquals(2, listOperations.getSizeList()); 
        
    }
    
    
     @Test
    public void testRemoveNameFromListDuplicate() {
        listOperations.addNameToList("John");
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("John");  
        assertEquals(4, listOperations.getSizeList());
      listOperations.removeNameFromList("John");
     // listOperations.removeNameFromList("John");
        assertEquals(3, listOperations.getSizeList()); 
        //removes first occurance of John  cause its a list . (polymorph to Set)
    }
    
    
    
    @Test
    public void testGetSizeList() {
       listOperations.addNameToList("Tom");
       listOperations.removeNameFromList("Tom");
        assertEquals(0, listOperations.getSizeList());
        
    }
    
      @Test(expected = NullPointerException.class)
    public void testGetSizeNullList() {       
        assertEquals(0, listOperations.getSizeList());
        //null exception error
    }
    
      @Test
    public void testGetSizeListNotSame() {     
          listOperations.addNameToList("Tom");
           listOperations.addNameToList("Andy");
            listOperations.addNameToList("Jerry");
           int a= listOperations.getSizeList();
           listOperations.removeNameFromList("Tom");
           int b = listOperations.getSizeList();
          assertNotSame(a, b);        
    }
    
     @Test
    public void testGetSizeListSame() {     
          listOperations.addNameToList("Tom");
           listOperations.addNameToList("Andy");
           int a= listOperations.getSizeList();
            listOperations.addNameToList("Jerry");          
           listOperations.removeNameFromList("Tom");
           int b = listOperations.getSizeList();
          assertSame(a, b);        
    }
    
    

}
