package PrimitiveAndReferanceTypes;
/*
Source: https://github.com/swtestacademy/java-functional/tree/main/src/test/java/basics/datatypes
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Primitive type example: \n");
        primitiveTypes primitiveTypes = new primitiveTypes();
        primitiveTypes.primitiveTypeExample();

        System.out.println("\nReferance type example: \n");
        referanceTypes referanceTypes = new referanceTypes();
        referanceTypes.referenceTypeExample();
    }
}