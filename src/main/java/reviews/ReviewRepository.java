package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	//Constructor
	public ReviewRepository() {
    
	//Creating review object to place into the map
	Review review = new Review(12121, "Star Wars: Revenge of the Sith", "/images/starwars.jpg", "Sci/Fi", "Tragic end to the epic prequel trilogy.", "2005", "The Clone Wars are coming to an end. Anakin must make a choice that will forever alter his destiny", "tag");
	reviewMap.put(review.getId(),review);
	Review review2 = new Review(13131, "Blow", "/images/blow.jpg", "Crime/Drama", "The rise and fall of George Jung.", "2001", "Born into a struggling middle class household, George Jung grows up to establish American cocaine market in the 1970's", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(14141, "American Psycho", "/images/american.jpg", "Drama/Slasher", "Christian Bale is CRAZY good.", "2000", "Wealthy New York investment banker by day, derranged sociopathic killer by night, Patrick Bateman is the American Psycho", "tag");
	reviewMap.put(review3.getId(),review3);
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long id) {
    	return reviewMap.get(id);
    }
}