1. Creating Comparators for Multiple Fields
To sort on multiple fields, we must first create simple comparators for each field on which we want to sort the stream items. 
Then we chain these Comparator instances in the desired order to give GROUP BY effect on complete sorting behavior.








Note that Comparator provides a few other methods that we can use if they fit in the requirements.
-------------------------------------------------------------------------------------------------

thenComparing(keyExtractor)

thenComparing(comparator)

thenComparing(keyExtractor, comparator)

thenComparingDouble(keyExtractor)

thenComparingInt(keyExtractor)

thenComparingLong(keyExtractor)

Joining Multiple Comparators











//first name comparator
--------------------------
Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getFirstName );
 
//last name comparator
-----------------------
Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getLastName );
 
//Compare by first name and then last name (multiple fields)
-------------------------------------------------------------
Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);





 
//Using Comparator - pseudo code
---------------------------------
list.stream().sorted( comparator ).collect();


2. Sorting with Complex Comparator


Given below is an example of using thenComparing() to create Comparator which is capable of sorting the employees’ list by their first name and last name.











Sort by first name and last name
--------------------------------

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class Main 
{
  public static void main(String[] args) 
  {
    ArrayList<Employee> employees = getUnsortedEmployeeList();
     
    //Compare by first name and then last name
    Comparator<Employee> compareByName = Comparator
                        .comparing(Employee::getFirstName)
                        .thenComparing(Employee::getLastName);
     
    List<Employee> sortedEmployees = employees.stream()
                    .sorted(compareByName)
                    .collect(Collectors.toList());
     
    System.out.println(sortedEmployees);
  }
 
  private static ArrayList<Employee> getUnsortedEmployeeList() 
  {
    ArrayList<Employee> list = new ArrayList<>();
    list.add( new Employee(2l, "Lokesh", "Gupta") );
    list.add( new Employee(1l, "Alex", "Gussin") );
    list.add( new Employee(4l, "Brian", "Sux") );
    list.add( new Employee(5l, "Neon", "Piper") );
    list.add( new Employee(3l, "David", "Beckham") );
    list.add( new Employee(7l, "Alex", "Beckham") );
    list.add( new Employee(6l, "Brian", "Suxena") );
        return list;
  }
}


Output:::  


[E[id=7, firstName=Alex,  lastName=Beckham], 
E [id=1, firstName=Alex,  lastName=Gussin], 
E [id=4, firstName=Brian,   lastName=Sux], 
E [id=6, firstName=Brian,   lastName=Suxena], 
E [id=3, firstName=David,   lastName=Beckham], 
E [id=2, firstName=Lokesh,  lastName=Gupta], 
E [id=5, firstName=Neon,  lastName=Piper]]