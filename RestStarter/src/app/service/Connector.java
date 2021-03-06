package app.service;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import app.bean.Person;

@Path("Connector")
public class Connector {

//	@POST
//	@Path("getHelloText")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String getHelloText(String jsonString) {
//		try {
//			 JSONObject json = new JSONObject(jsonString);
//			 String firstname = (String) json.get("firstname");
//			 String lastname = (String) json.get("lastname");
//			return "Hello, " + firstname + lastname;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Service Error";
//		}
//	}

	@POST
	@Path("getHelloText")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String getHelloText(@FormParam("firstname")String firstname, @FormParam("lastname")String lastname) {
		try {
			return "Hello, " + firstname + lastname;

		} catch (Exception e) {
			e.printStackTrace();
			return "Service Error";
		}
	}	
	
//	@POST
//	@Path("getHelloText")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String getHelloText(Person person) {
//		try {
//			
//			return person.getFirstname()+person.getLastname();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Service Error";
//		}
//	}	
	
	@POST
	@Path("getHelloText")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getHelloText(JSONArray objArr) {
		try {
			StringBuilder result = null;
			
			Person person1 = (Person)objArr.get(1);
			Person person2 = (Person)objArr.get(1);
			
//			result.append()
//			List list = (List)objArr.;
//			Iterator<Person> iterator = list.iterator();
//			
//			while(iterator.hasNext()){
//				result.append(iterator.next().getFirstname());
//				result.append(iterator.next().getLastname());
//			}
			
			result.append(person1.getFirstname());
			result.append(person1.getLastname());
			result.append(person2.getFirstname());
			result.append(person2.getLastname());
			
			
			return result.toString();

		} catch (Exception e) {
			e.printStackTrace();
			return "Service Error";
		}
	}	
	
}
