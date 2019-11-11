import java.util.Hashtable;
import java.util.Objects;

/**
 * @author Abhishek Jain
 */

class ParentClass {
    public void PrintHello()
    {
        System.out.println("Hello Abhishek from ParentClass");
    }
}
class UsingAnnotation extends ParentClass{
    @Override
    public void PrintHello()
    {
        System.out.println("Hello Abhishek from UsingAnnotation class");
    }

    @Deprecated
    public void RetiringThisMethodSoon()
    {
        System.out.println("This method is support is planned to remove");
    }

    public Hashtable getTableData()
    {
        Hashtable hashtable = null;
        try {
            hashtable = new Hashtable();
            hashtable.put(34, "Abhishek");
            hashtable.put(5, "Arhan");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            return hashtable;
        }
    }
}
public class JavaAnnotationEx {
    public static void main(String[] args) {
        UsingAnnotation usingAnnotation = new UsingAnnotation();
        usingAnnotation.PrintHello();
        usingAnnotation.RetiringThisMethodSoon();
    }
}
