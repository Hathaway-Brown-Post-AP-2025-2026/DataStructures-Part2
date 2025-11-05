
/**
 * Contains information about a (wait for it) ... Airport!
 *
 * @author  MH & MB @HB
 * @version 2025 Halloween!
 */
public class Airport
{
    private String ataCode;
    private String city;
    private String location;
    private int offset;
    
    public Airport (String code, String cityName, String locPlace)
    {
        ataCode = code;
        city = cityName;
        location = locPlace;
    }
    
    public int getOffset ()        { return offset;  }
    public void setOffset (int o)  { offset = o;  }
    
    public String toString ()
    {
        return String.format("%s   %20s  %s", ataCode, city, location);
    }
    
    public static int ataToInt (String ata)
    {
        // ASCII for 'A' = 65
        int ans = 0;
        
        ans += ((int)(ata.charAt(0)) - 65) * 26 * 26;
        ans += ((int)(ata.charAt(1)) - 65) * 26;
        ans += ((int)(ata.charAt(2)) - 65);
        
        return ans;
    }
    
    public static String intToATA (int n)
    {
        String ans = "";
        int a = n / (26 * 26);
        ans += (char)(a + 65);    // ASCCII for 'A' = 65
        n %= (26 * 26);
        a = n / 26;
        ans += (char)(a + 65);    // ASCCII for 'A' = 65
        ans += (char)((n % 26) + 65);
        
        return ans;
    }
}
