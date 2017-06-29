
import java.util.*;
import java.io.*;

public class US
{
    private static final String FILENAME = "US_states";

    //****************************parseUSStates()*****************************
    private static void parseUSStates(String states[], String capitals[])
    {
        try
        {
            Scanner sc = new Scanner(new File(FILENAME));
            String line;
            int i = 0;

            sc.nextLine();
            sc.nextLine(); // skip over couple of headers

            while(sc.hasNext())
            {
                line = sc.nextLine();
                String temp[] = line.split("\\s\\s+");

                if(temp.length >= 2)
                {
                    if(temp.length == 2)
                    {
                        states[i]     = temp[0];
                        capitals[i++] = temp[1];
                    }
                    else
                    {

                        states[i]     = temp[0] + " " + temp[1];
                        capitals[i++] = temp[2];
                    }
                }
            }
        }catch(FileNotFoundException e){System.err.println(e);}
    }
}

