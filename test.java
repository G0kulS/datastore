// i can't create unit test because i had some problem in junit and with my ide so i create a java file   inorder to test DataStore file

import org.json.simple.JSONObject;
// import DataStore;
//  if DataStore is  not default package then undo the commeent
public  class test
        {
            public static void main(String args[])
            {
              DataStore test = new DataStore();
                JSONObject n = new JSONObject();
                n.put("Name","Robbinhood");
                test.create("First",n);
                 createunittest(test,n,"First");   //give success message to confirm successfull creation or give error message when key already exist
                 readunittest(test,n,"First");    //returns json object if reading is successfull or if key is not exist give error messaage
                 test.delete("First");             //given if error message key is not exist
                 test.read("First");               //when we try to invoke a object of key which is not exist it raise error
            }
            public static void createunittest(DataStore test,JSONObject object,String key)
            {
                if(test.read(key).equals(object))
                {
                    System.out.println("Creation Success");
                }

            }
            public static void readunittest(DataStore test,JSONObject object,String key)
            {

                    System.out.println(test.read(key));

            }

         }
