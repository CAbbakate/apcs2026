
/**
 * Write a description of class Weather here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weather
{
    public enum WeatherType{
        Sunny,
        Cloudy,
        Rainy,
        Thundering,
        Typhoon,
        Hurricane,
        Snowy,
        Icy,
        InstantDeath
        
    }
    public static void main(String[] args){
        int rainyDays = 0, rndIndex;
        
        WeatherType[] options = WeatherType.values();  
        
        for(int day = 1; day <= 7; day++) {
            rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            System.out.println("Day " + day + ": " + today);
            
            if(today == WeatherType.Rainy) {
                rainyDays++;
            }
        }
        
        System.out.println("There are " + rainyDays + " rainy days this week.");
        
        for(WeatherType w: WeatherType.values()){
            System.out.println("Category:" + w);
        }
    }
}
