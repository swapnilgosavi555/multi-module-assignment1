
import java.util.*;
public class Entity
{

        private  int user_id;
        private   String user_name;
        private   int user_age;

        public int getId(){
            return user_id;
        }
        public void setId(int user_id){
            this.user_id=user_id;
        }
        public String getName(){
            return user_name;
        }
        public void setName(String user_name){
            this.user_name=user_name;
        }
        public int getAge(){
            return this.user_age;
        }
        public void setAge(int user_age){
            this.user_age=user_age;
        }
    }


