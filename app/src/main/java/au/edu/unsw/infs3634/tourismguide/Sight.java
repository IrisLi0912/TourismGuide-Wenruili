package au.edu.unsw.infs3634.tourismguide;

import java.io.Serializable;
import java.util.ArrayList;

public class Sight implements Serializable {

    private String sightName;
    private String attractionType;
    private Double rating;
    private String ratingDescription;
    private String location;
    private String sightDescription;
    private String learnMore;
    private int numReviews;
    private String guestReviews1;
    private String guestReviews2;
    private String imageName;
    private int imageMax;  //initialization the number of image that will be including in to imagebanner.


    public Sight(String sightName, String attractionType, Double rating, String ratingDescription, String location, String sightDescription, String learnMore, Integer numReviews, String guestReviews1, String guestReviews2, String imageName, int imageMax) {
        this.sightName = sightName;
        this.attractionType = attractionType;
        this.rating = rating;
        this.ratingDescription = ratingDescription;
        this.location = location;
        this.sightDescription = sightDescription;
        this.learnMore = learnMore;
        this.numReviews = numReviews;
        this.guestReviews1 = guestReviews1;
        this.guestReviews2 = guestReviews2;
        this.imageName = imageName;
        this.imageMax = imageMax;

    }

    // input all the sight information into a arraylist.
    public static ArrayList<Sight> getSights() {
        ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight("Sydney Opera House", "Landmarks", 4.7, "Excellent", "Bennelong Point Sydney, 2000",
                "One of the most iconic buildings in the world – the Sydney Opera House is an architectural masterpiece and vibrant performance space. " +
                        "It's a place where the past shapes the future, where conventions are challenged and cultures are celebrated. Step inside and discover the stories " +
                        "that make the Opera House so inspiring. Whether you’re a local or a tourist, a first-timer or an aficionado, the Sydney Opera House has something for everyone.",
                "https://www.sydneyoperahouse.com/", 8752, "Rebecca: With the Opera House still closed due to Coivid 19 it was a pleasant walk around the outside. " +
                "The Opera Bar that is normally very busy was quiet but open. Worth the walk around the outside, lots of photo opportunities", "Nick: We hadn't had the chance to go inside, " +
                "but the outside is very beautiful, it is a futuristic monument, what a great job", "operahouse", 5));


        sights.add(new Sight("Bondi Beach", "Beach", 4.8, "Excellent", "Queen Elizabeth Drive, Sydney 2026",
                "Bondi Beach is famous for its glistening ocean, pristine sands, reliable surf and seaside spirit. It's laid back coastal lifestyle, cafe culture, " +
                        "boutique shops and thriving, eclectic community is equally enticing.", "http://bondibeach.com/", 10273, "Matthew: Certainly the best known of the Sydney " +
                "beaches - it is always a pleasant day out ta Bondi. Although I would try to avoid public holidays when it can get very busy. Nowadays (with COVID) I would suggest Bronte as the more " +
                "enjoyable alternative.", "Eric: I had a spinal cord injury and Jethro and Hoppo were so nice in helping me and getting me stabilized and I truly appreciate that."
                , "bondibeach", 6));


        sights.add(new Sight("Royal Botanic Garden", "Parks", 4.3, "Very Good", "Mrs Macquaries Road, Sydney 2000",
                "The Royal Botanic Garden Sydney is a major botanical Garden located in the heart of Sydney, New South Wales, Australia. Opened in 1816, the garden " +
                        "is the oldest scientific institution in Australia and one of the most important historic botanical institutions in the world.", "https://www.rbgsyd.nsw.gov.au/", 2375,
                "Shannon: and admire the harbour or the flora, seating is available or pull up a patch of grass", "Kelly: The Gardens arre magnificent in spring and well worth a visit. If funds allow, " +
                "Luke Nyugen's Botanical House Restaurant is a must!! He is a culinary genius!!"
                , "garden", 6));


        sights.add(new Sight("Hornby LightHouse", "Landmarks", 4.3, "Very Good", "Victoria Street, Watsons Bay, 2030",
                "Hornby Lighthouse stands tall at South Head, near Watsons Bay in Sydney Harbour National Park. The iconic red and white striped tower is surrounded by magnificent views: " +
                        "Sydney Harbour to the west, Middle Head and North Head to the north, and the expansive Pacific Ocean to the east. It’s a great spot for whale watching in winter." +
                        "The lighthouse was built in 1858 following the wrecking of the Dunbar at the foot of South Head. Designed by colonial architect Alexander Dawson, Hornby Lighthouse was the third lighthouse to be built in NSW.",
                "https://www.nationalparks.nsw.gov.au/things-to-do/historic-buildings-places/hornby-lighthouse", 1203, "Tyler: The lighthouse is nothing great but when you sit and observe the waves for some time, " +
                "then you start feeling on top of the world.", "Tom: The lighthouse we found a bit trick to get to through the streets and it's not really well signposted. View is great when you get there. Map your route before heading out. " +
                "Pretty easy walk for most fitness levels but take water as nowhere to buy some."
                , "lighthouse", 6));


        sights.add(new Sight("Sydney Harbour Bridge", "Landmarks", 4.6, "Excellent", "Sydney Harbour Bridge, Sydney 2000", "Spanning the city center to the North Shore, " +
                "the Sydney Harbour Bridge is a wide steel arch bridge known for its beauty as well as function, providing a crossing for cars, trains, bikes and pedestrians. While the more daring can do the BridgeClimb to the top of the structure," +
                " opened to traffic in 1932, anyone can enjoy a walk for free.", "https://sydney-harbour-bridge.nesa.nsw.edu.au/", 7659, "Andrea: Great walk after dinner and a sunset cocktail. Good finish to the evening. " +
                "There were still a lot of people walking across the bridge and security guards are present to ensure everyone's safety", "Tommy: Walking across the bridge or over it on a tour, the Sydney Harbour Bridge is a sight to behold. Worth a visit and many photos."
                , "bridge", 6));


        sights.add(new Sight("Sydney Park", "Parks", 4.0, "Very Good", "416 Sydney Park Rd.", "Sydney Park is made of 40 hectares of lush grass, landscaped gardens, rolling hills, " +
                "meandering pathways and picturesque wetlands. Creeks flow throughout the park and attract all different types of birds. There are plenty of spacious viewing decks that are perfectly placed to make sure you can take it all in as long as" +
                " you like. Sydney Park is popular for weekend picnics and it’s very dog friendly. A large children’s playground will probably have the grown-ups mesmerised just as much as the kids. The tactile, one-of-a-kind playground includes many" +
                " different types of equipment that will keep children entertained for hours, as well as several elements that will stimulate their senses of touch, hearing and sight.", "https://www.cityofsydney.nsw.gov.au/parks/sydney-park", 5414,
                "Ryan: Such a nice way to spend time - wandering around this newly sustainable park that was once a brickworks, complete with tall chimneys-cum-garbage dump. Thoughtful designs, dog and people friendly!", "Brandon: Well kept great walking paths. " +
                "Great outdoors of Sydney. A place to take time and enjoy. Also good for people in a wheelchair."
                , "park", 4));


        sights.add(new Sight("Darling Harbour", "Landmarks", 4.6, "Excellent", "Sydney NSW 2000.", "This waterside pocket of Sydney has got it all; amazing entertainment, fascinating museums," +
                " incredible wildlife and delicious dining options right on the water plus a brand-new food precinct. Darling Harbour is a fantastic family-friendly destination right in the heart of Sydney that has something for everyone.",
                "https://www.darlingharbour.com/", 8736, "Oliver: This is a place for the young, many pubs but everywhere noisy, only use supping language as you can’t hear each other !", "Milke: Darling Harbour has become a fantastic space for hanging out, " +
                "lunch, exercise, shopping, you name it. Huge space, car-free, attractive architecture, and views of the city and harbour."
                , "darling", 5));


        sights.add(new Sight("Queen Victoria Building", "Shopping", 4.5, "Excellent", "455 George St, 2000.", "Visit for the beautiful architecture, stay for the shops. Window shop through the " +
                "atrium's five levels for high fashion brands, enjoy coffee at the cafes, and listen to the Royal Clock strike.", "https://www.qvb.com.au/", 3583, "Stephanie: This is an iconic building in Sydney and worth a visit at a tourist. We often visit here for HobbyCo " +
                "but were disappointed with their model plane displays and prices.", "Tiffany: The architecture is really beautiful and the interior is beautifully decorated as well. A great place for window shopping as there are many shops here."
                , "qvb", 5));


        sights.add(new Sight("Sydney Tower Eye", "Landmarks", 4.3, "Very Good", "100 Market St, 2000", "Sydney Tower Eye takes you to the highest point above Sydney for breathtaking 360 degree " +
                "views of the beautiful harbour city. From the golden beaches to the distant Blue Mountains, you'll be amazed by the views. Your ticket includes the 4D cinema experience - the first produced in Australia - where you can uncover a new dimension to " +
                "Sydney through a whole new perspective. The engaging film experience is taken to the fourth dimension with evocative in-theatre effects including wind, bubbles and water!", "https://www.sydneytowereye.com.au/", 7813, "Frank: Great views and was expecting " +
                "good photos with the extra $40 I pre-paid. Staff were going to give me the photos for free because they were of horrific quality and couldnt do anything about a refund as I paid for the photos online with my tickets.", "jeff: It is a lovely view with some information about " +
                "what you are looking at. There’s other places to get lovely views with smaller crowds and cost. "
                , "towereye", 6));


        sights.add(new Sight("Art Gallery Of NSW", "Museums", 3.4, "Average", "Art Gallery Rd, 2000.", "One of Australia's leading art museums. Over 1.3 million people visit each year. Located 15 minutes walk " +
                "from the city centre, with impressive collections of Aboriginal, Australian, European, Asian and contemporary art. Open daily, free general admission. Late opening Wednesdays until 10pm with free talks, films, live music and more.", "https://www.artgallery.nsw.gov.au/", 5243,
                "Ashley: I love this gallery and enjoyed seeing the biennial items. It is a pity that the cloakroom was closed so you have to carry around your bag. Looking forward to the new building in 2022.", "Jisoo: We spent a rainy afternoon here and were thoroughly impressed. Really appreciated " +
                "the way classical art was interposed with contemporary and Indigenous art to disrupt the way you perceive things."
                , "art", 5));


        sights.add(new Sight("Australian National Maritime Museums", "Museums", 3.6, "Very Good", "2 Murray St, 2000.", "We share stories of the sea. Visit us in Darling Harbour to explore tall ships and beautiful boats, dive under " +
                "the sea on a submarine, discover contemporary exhibitions and enjoy creative family activities.", "https://www.sea.museum/", 6182, "Sandy: Highlight the Sea Monsters exhibition, Photography Section, Gift shop and Boarding the Tallship Endeavour and HMAS Vampire.", "" +
                "Kris: Very interesting place. From commercial fishing to nature and wildlife. Lots to see. Great movies to sit and watch and a chance to rest the feet. Interesting boats tied up to the docks outside! Worth the trip."
                , "museum", 5));


        sights.add(new Sight("The Star Sydney", "Casinos", 4.8, "Excellent", "80 Pyrmont St, 2009.", "The Star Sydney is Australia’s premier place to play. A sip of sparkling. A dozen freshly shucked oysters. Crisp white sheets and red carpet. " +
                "Diamonds and spades. Gucci and gastronomy. The day begins with luxury – where it ends is up to you. At The Star, we have just one mission –– to thrill. That’s why we have all star chefs and restaurants, luxurious accommodation and high-end fashion, a sumptuous day spa, an amazing nightclub, " +
                "and, of course, the world-class casino. It’s all yours for the taking, so will you? Come and play at The Star.", "https://www.star.com.au/sydney/", 2719, " Elvis: Has most facilities you expect in a casino without excelling at anything. I've been to casinos all over the " +
                "world and most have distinguishing features. This casino has none but enough for a good night out.", "Iris: This casino which is close to Darling Harbour and on the tram line, attracts a rough Asian, mostly Chinese crowd. Motorcycle gang clubs are just about as friendly, and probably under less police observation."
                , "thestart", 6));

        return sights;


    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getImageMax() {
        return imageMax;
    }

    public void setImageMax(int imageMax) {
        this.imageMax = imageMax;
    }

    public String getSightName() {
        return sightName;
    }

    public void setSightName(String sightName) {
        this.sightName = sightName;
    }

    public String getAttractionType() {
        return attractionType;
    }

    public void setAttractionType(String attractionType) {
        this.attractionType = attractionType;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSightDescription() {
        return sightDescription;
    }

    public void setSightDescription(String sightDescription) {
        this.sightDescription = sightDescription;
    }

    public String getLearnMore() {
        return learnMore;
    }

    public void setLearnMore(String learnMore) {
        this.learnMore = learnMore;
    }

    public int getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(int numReviews) {
        this.numReviews = numReviews;

    }

    public String getGuestReviews1() {
        return guestReviews1;
    }

    public void setGuestReviews1(String guestReviews1) {
        this.guestReviews1 = guestReviews1;
    }

    public String getGuestReviews2() {
        return guestReviews2;
    }

    public void setGuestReviews2(String guestReviews2) {
        this.guestReviews2 = guestReviews2;
    }
}



