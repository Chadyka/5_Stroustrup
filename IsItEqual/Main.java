package IsItEqual;

public class Main {
    public static void main(String[] args) {
        // Given
        String first = "...";
        String second = "...";
        // String third = "...";
        // This way third becomes a String object and first is a String literal
        // which is cached from the String pool thus it is not the same object
        // as third since their references do not match
        String third = new String("...");
        // When
        var firstMatchesSecondWithEquals = first.equals(second);
        var firstMatchesSecondWithEqualToOperator = first == second;
        var firstMatchesThirdWithEquals = first.equals(third);
        var firstMatchesThirdWithEqualToOperator = first == third;

        System.out.println(firstMatchesSecondWithEquals);
        System.out.println(firstMatchesSecondWithEqualToOperator);
        System.out.println(firstMatchesThirdWithEquals);
        System.out.println(firstMatchesThirdWithEqualToOperator);

    }
}
