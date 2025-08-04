package resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;
import pojo.UpdatePlace;

public class TestDataBuild {

	public AddPlace addPlacePayLoad(String name, String language, String address) throws IOException {
		AddPlace p = new AddPlace();
		dataDriven data=new dataDriven();
		ArrayList<String> d=data.getData("AddPlace");
		
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number(d.get(1));
		p.setWebsite(d.get(2));
		p.setName(name);
		List<String> myList = new ArrayList<String>();
		myList.add(d.get(3));
		myList.add(d.get(4));

		p.setTypes(myList);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
	}
	
public UpdatePlace updatePlacePayload(String place_id, String address) {
		UpdatePlace u=new UpdatePlace();
		u.setPlace_id(place_id);
		//u.setName(name);
		//u.setLanguage(language);
		u.setAddress(address);
		//u.setPhone_number("(+91) 983 893 4964");
		return u;
		
		//guru
		
		
	}
			
	public String deletePlacePayload(String placeId) {
		return "{\r\n    \"place_id\":\"" + placeId + "\"\r\n}";
	}
}
