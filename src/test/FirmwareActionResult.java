package test;

import java.util.HashMap;
import java.util.Map;
public class FirmwareActionResult{
	private static Long asd ;
	
public enum FirmwareActionResult2 {
    NO_ERROR("noError", 0L),
    IN_PROGRESS("inProgress", 1L),
    FAULT_CODE("fault code", null) ;
    private static final Map<Long, FirmwareActionResult2> INTEGER_TO_ENUM = new HashMap<>();
    
    private final String name;
    private Long value;

    static { // Initialize map from integer value to enum constant
        for (final FirmwareActionResult2 status : values()) {
            INTEGER_TO_ENUM.put(status.value, status);
        }
    }

    /**
     * Constructor for creating a {@code FirmwareActionResult} enum
     * 
     * @param name the name of the object as a {@code string}
     * @param value the value as a number
     */
    private FirmwareActionResult2(String name, Long  value) {
        this.value = value;
        this.name = name;
    }
    
  

    /**
     * Finds the firmware action result status corresponding to a specific value
     * 
     * @param value Action result
     * @return firmware action result corresponding to value, {@code null} if no such action
     *         result status exists.
     * @throws Exception 
     */
    public static FirmwareActionResult2 getFirmwareActionResult(Long value) {
        FirmwareActionResult2 result = null;
        if (result == null) {
                result = FirmwareActionResult2.FAULT_CODE;
                result.setValue(value);
            }
        return result;
    }


 
    private void setValue(long value) {
        this.value = value;
    }
    public Long getValue() {
        return value;
    }
    @Override
    public String toString() {
        return name;
    }
}

}
