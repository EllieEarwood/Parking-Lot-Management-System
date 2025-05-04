public class SlotTest {
    public static void main(String[] args) {
        testIsSlotAvailable();
    }

    // This would usually come from your ParkingSlot class
    public static boolean isSlotAvailable(String status) {
        return status.equalsIgnoreCase("available");
    }

    public static void testIsSlotAvailable() {
        String testStatus1 = "available";
        String testStatus2 = "occupied";

        assert isSlotAvailable(testStatus1) : "Test 1 failed: Slot should be available";
        assert !isSlotAvailable(testStatus2) : "Test 2 failed: Slot should be unavailable";

        System.out.println("All unit tests passed!");
    }
}
