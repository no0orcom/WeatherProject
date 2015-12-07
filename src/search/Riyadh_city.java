package MFWP_Classes_PKG;


import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;
import javax.swing.JOptionPane;

/**
 *
 * @author Feras
 */
public class Riyad_City 
{
    
       
  static final String Riyad_City_ID = "2346951";
  static final String Temperature_Degree = "c";
  private String Temperature;
  private String Humidity;
  private String Cloudy;
  
  
    public String getTemperature()
    {
 
    
        try{  
             WeatherDoc   doc = new WeatherDoc(Riyad_City_ID,Temperature_Degree);
                WeatherDisplay display = new WeatherDisplay();
                Temperature = display.getTemperature();
              
                return Temperature;  
           }
        catch(Exception e)
           {
             
           JOptionPane.showMessageDialog(null, "This Error could appear because there is No Internet connection");
               return null;
           }  
     
   
    } 
//----------------------------------------------------------------------------//
//----------------------------------------------------------------------------//

    
    public String getHumidity()
    {
 
    
        try{  
             WeatherDoc   doc = new WeatherDoc(Riyad_City_ID,Temperature_Degree);
                WeatherDisplay display = new WeatherDisplay();
                Humidity = display.getHumidity();
              
                return Humidity;  
           }
        catch(Exception e)
           {
             
           JOptionPane.showMessageDialog(null, "This Error could appear because there is No Internet connection");
               return null;
           }  
     
   
    } 
//----------------------------------------------------------------------------//
//----------------------------------------------------------------------------//
    
    public String getCloudy()
    {
 
    
        try{  
             WeatherDoc   doc = new WeatherDoc(Riyad_City_ID,Temperature_Degree);
                WeatherDisplay display = new WeatherDisplay();
                Cloudy = display.getCondition();
              
                return Cloudy;  
           }
        catch(Exception e)
           {
             
           JOptionPane.showMessageDialog(null, "This Error could appear because there is No Internet connection");
               return null;
           }  
     
   
    } 
 
    

    
}
