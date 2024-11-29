package StringDemo;

final class ImmutableInteger {

    private final int value; // Renamed to 'value'

    public ImmutableInteger(int value) {
        this.value = value; // Constructor sets the value
    }
    // Method to create a new instance with the modified value
    public ImmutableInteger modify(int newValue) {
        if (this.value == newValue) {
            return this; // Return the same instance if value is unchanged
        } else {
            return new ImmutableInteger(newValue); // Return a new instance if value changes
        }
    }
    // Getter for the value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        ImmutableInteger original = new ImmutableInteger(10);
        ImmutableInteger modified1 = original.modify(100);
        ImmutableInteger modified2 = original.modify(10);

        System.out.println(original == modified1); // false: original and modified1 are different instances
        System.out.println(modified1 == modified2); // false: modified1 and modified2 are different instances
        System.out.println(original == modified2); // true: original and modified2 are the same instance
        System.out.println(original.getValue()); // Prints the value of original
        System.out.println(modified1.getValue()); // Prints the value of modified1
        System.out.println(modified2.getValue()); // Prints the value of modified2
    }
}
