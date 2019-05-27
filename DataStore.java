import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class DataStore {
    private static String path ="c://file.json";
    public DataStore()
    {

           if(!new File(path).canWrite())
            {
                path= "file.json";
           }


    }
    public  synchronized void create(String key, JSONObject jsonobj)
    {   double storage = new File(path).length()*Math.pow(10,-6);
        storage = 0.016 + storage + 0.000104;
        if(storage>1024){
            throw new RuntimeException("Memory is full");
        }
            JSONObject data = Fileread();
        if(keyexist(key))
        {
            throw new java.lang.RuntimeException("Key Already exist - Pls Enter Different key ");
        }
        data.put(key,jsonobj);
        Filecreation(data);
    }

public synchronized JSONObject read(String key)

{ if(keyexist(key))
{
    return (JSONObject) Fileread().get(key);}
    else
  {
      throw  new java.lang.RuntimeException("Enter valid key-");
  }
}
public synchronized void delete(String key)
{   if(keyexist(key)){
    JSONObject output =Fileread();
    output.remove(key);
    Filecreation(output);}
    else
{
       throw new java.lang.RuntimeException("Enter valid key");
}

}
private Boolean keyexist(String key)
{
   if(Fileread().get(key)!=null)
   {
       return true;
   }
   else {
       return  false;}
}
private void Filecreation(JSONObject data)
{
    try

    {  FileWriter file= new FileWriter(path);
        file.write(data.toJSONString());
        file.flush();

        file.close();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }

}
    private JSONObject  Fileread()

    {   JSONObject output = new JSONObject();
        JSONParser parser = new JSONParser();
        try

        {   FileReader file;
            file = new FileReader(path);
            Object o = parser.parse(file);
            output = (JSONObject) o;

        }
        catch (ParseException r)
        {
            r.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException r){
            r.printStackTrace();
        }
    return  output;
    }
}
