package Day_16;

import java.util.Base64;

class solution_of_D16Q3
{
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl)
    {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(longUrl.getBytes());
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl)
    {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(shortUrl));
    }
}

public class Q3_Encode_And_Decode_TinyURL
{
    /*
        TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
        Design a class to encode a URL and decode a tiny URL.

        There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can
        be decoded to the original URL.

        Implement the Solution class:
            Solution() Initializes the object of the system.
            String encode(String longUrl) Returns a tiny URL for the given longUrl.
            String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.


            Example 1:
                Input: url = "https://leetcode.com/problems/design-tinyurl"
                Output: "https://leetcode.com/problems/design-tinyurl"
                Explanation:
                Solution obj = new Solution();
                string tiny = obj.encode(url); // returns the encoded tiny url.
                string ans = obj.decode(tiny); // returns the original url after decoding it.
    */
    public static void main(String[] args)
    {
        solution_of_D16Q3 obj = new solution_of_D16Q3();
        String e = obj.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println("Encode=>"+e);
        String d = obj.decode(e);
        System.out.println("Decode=>"+d);
    }
}
