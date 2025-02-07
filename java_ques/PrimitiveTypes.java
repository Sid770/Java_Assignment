// question 13

public class PrimitiveTypes {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;
    
    public static void main(String[] args) {
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("----------------------------------------");
        
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: " + (int)defaultChar);
        System.out.println("boolean: " + defaultBoolean);
        
        System.out.println("\nMaximum and Minimum values of primitive data types:");
        System.out.println("----------------------------------------");
        
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
        
        System.out.println("\nSize of primitive data types (in bits):");
        System.out.println("----------------------------------------");
        
        System.out.println("byte: " + Byte.SIZE + " bits");
        System.out.println("short: " + Short.SIZE + " bits");
        System.out.println("int: " + Integer.SIZE + " bits");
        System.out.println("long: " + Long.SIZE + " bits");
        System.out.println("float: " + Float.SIZE + " bits");
        System.out.println("double: " + Double.SIZE + " bits");
        System.out.println("char: " + Character.SIZE + " bits");
    }
}
